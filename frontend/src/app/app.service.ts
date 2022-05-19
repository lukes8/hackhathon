import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { localBase, httpOptions } from './exports';
import { User } from './main/model/user';

@Injectable()
export class AppService {

  constructor(private _http: HttpClient) {
  }

  login(): Observable<any> {
    let url: string = localBase + 'rest/blah/blah/';
    //return this._http.get(url, httpOptions);
    let user_ = new BehaviorSubject<User>(null);
    user_.next({id: 0, name: "test user", email: "test email"});

    return user_.asObservable();
  }
}
