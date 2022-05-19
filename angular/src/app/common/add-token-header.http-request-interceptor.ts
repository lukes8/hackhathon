import {Injectable} from '@angular/core';
import {HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';

import {Observable, throwError} from 'rxjs';
import {catchError, map} from 'rxjs/operators';
import {SocialUser} from 'angularx-social-login';
import {ToastrService} from 'ngx-toastr';
import {SpinnerDialogComponent} from "./spinner-dialog/spinner-dialog.component";
import {MatDialog} from "@angular/material/dialog";
import {NGXLogger} from "ngx-logger";

@Injectable()
export class AddTokenHeaderHttpRequestInterceptor implements HttpInterceptor {
  currentUser: SocialUser | undefined;

  constructor(private toastr: ToastrService, public dialog: MatDialog, private logger: NGXLogger) {
  }

  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    const spinnerDialogRef = this.dialog.open(SpinnerDialogComponent);

    if (!request.headers.has('Content-Type')) {
      request = request.clone({
        headers: request.headers.set('Content-Type', 'application/json'),
      });
    }

    request = request.clone({
      headers: request.headers.set('Accept', 'application/json'),
    });

    var user: SocialUser = JSON.parse(<string>sessionStorage.getItem("user"));
    if (user) {
      request = request.clone({
        headers: request.headers.set('Authorization', `Bearer ${user.idToken}`),
        withCredentials: true
      });
    }

    return next.handle(request).pipe(
      map((event: HttpEvent<any>) => {
        this.logger.info(request, event);
        spinnerDialogRef.close();
        return event;
      }),
      catchError((error: HttpErrorResponse) => {
        this.logger.error(request, error);
        spinnerDialogRef.close();
        this.toastr.error(error.message);
        return throwError(error);
      })
    );
  }
}
