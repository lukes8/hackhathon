import {ChangeDetectorRef, Component, OnDestroy, OnInit} from '@angular/core';
import {MediaMatcher} from '@angular/cdk/layout';
import {NavigationEnd, Router} from '@angular/router';
import {GoogleLoginProvider, SocialAuthService, SocialUser} from 'angularx-social-login';
import {NGXLogger} from "ngx-logger";

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnDestroy, OnInit {
  mobileQuery: MediaQueryList;
  currentPage: string | null = 'Klient';
  currentUser: SocialUser | undefined;
  user: SocialUser | undefined;

  private _mobileQueryListener: () => void;


  constructor(private router: Router, changeDetectorRef: ChangeDetectorRef, media: MediaMatcher, private authService: SocialAuthService, private logger: NGXLogger) {
    this.mobileQuery = media.matchMedia('(max-width: 600px)');
    this._mobileQueryListener = () => changeDetectorRef.detectChanges();
    this.mobileQuery.addListener(this._mobileQueryListener);

    this.router.events.subscribe(event => {
        if (event instanceof NavigationEnd) {
          logger.info("navigation", event)
          // @ts-ignore
          this.currentPage = event.url.substring(event.url.indexOf('pageName=') + 9).replaceAll('%20', ' ');
        }
      }
    );
  }

  ngOnDestroy(): void {
    this.mobileQuery.removeListener(this._mobileQueryListener);
  }

  navigateToClient(): void {
    this.router.navigate(['/client', {pageName: 'Klient'}]);
  }

  navigateToHello(): void {
    this.router.navigate(['/hello', {pageName: 'Hello'}]);
  }

  ngOnInit() {
    this.authService.authState.subscribe((user) => {
      this.user = user;
      sessionStorage.setItem("user", JSON.stringify(user));
    });
  }

  refreshGoogleToken(): void {
    this.authService.refreshAuthToken(GoogleLoginProvider.PROVIDER_ID);
  }

  signInWithGoogle(): void {
    this.authService.signIn(GoogleLoginProvider.PROVIDER_ID).then(response => {
        this.user = response;
        sessionStorage.setItem("user", JSON.stringify(response));
      }
    );
  }

  signOut(): void {
    this.authService.signOut();
    sessionStorage.setItem("user", "");
  }

  navigateToFutureClient() {
    this.router.navigate(['/future-client', {pageName: 'Budouci Klient'}]);
  }

  navigateToEmails() {
    this.router.navigate(['/emails', {pageName: 'Emaily'}]);
  }
}
