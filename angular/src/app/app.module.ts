import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NavigationComponent} from './navigation/navigation.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';

import {CdkStepperModule} from '@angular/cdk/stepper';
import {CdkTableModule} from '@angular/cdk/table';
import {MatAutocompleteModule} from '@angular/material/autocomplete';
import {MatButtonModule} from '@angular/material/button';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatCardModule} from '@angular/material/card';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatDialogModule} from '@angular/material/dialog';
import {MatDividerModule} from '@angular/material/divider';
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatListModule} from '@angular/material/list';
import {MatMenuModule} from '@angular/material/menu';
import {MatNativeDateModule, MatRippleModule} from '@angular/material/core';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatRadioModule} from '@angular/material/radio';
import {MatSelectModule} from '@angular/material/select';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatSortModule} from '@angular/material/sort';
import {MatTableModule} from '@angular/material/table';
import {MatTabsModule} from '@angular/material/tabs';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTooltipModule} from '@angular/material/tooltip';
import {ClientOverviewComponent} from './client/client-overview/client-overview.component';
import {ConfirmationDialogComponent} from './common/confirmation-dialog/confirmation-dialog.component';
import {DefaultDataServiceConfig, EntityDataModule} from '@ngrx/data';
import {entityConfig} from './entity-metadata';
import {StoreModule} from '@ngrx/store';
import {EffectsModule} from '@ngrx/effects';
import {StoreDevtoolsModule} from '@ngrx/store-devtools';
import {ClientDetailComponent} from './client/client-detail/client-detail.component';

import {FormlyModule} from '@ngx-formly/core';
import {FormlyMaterialModule} from '@ngx-formly/material';
import {ArrayTypeComponent} from './common/formly/array.type';
import {ObjectTypeComponent} from './common/formly/object.type';
import {MultiSchemaTypeComponent} from './common/formly/multischema.type';
import {NullTypeComponent} from './common/formly/null.type';
import {MatFormFieldDefaultOptions} from '@angular/material/form-field';
import {FormlyMatDatepickerModule} from '@ngx-formly/material/datepicker';
import {ClientVisitOverviewComponent} from './client/client-visit-overview/client-visit-overview.component';
import {ClientVisitDetailComponent} from './client/client-visit-detail/client-visit-detail.component';
import {ToastrModule} from 'ngx-toastr';
import {ClientEffects} from './client/client-overview/clientEffects';
import {ClientVisitEffects} from './client/client-visit-overview/clientVisitEffects';
import {TextareaAutoResizeComponent} from './common/formly/textarea-auto-resize.component';
import {ClientBellyAnalysisOverviewComponent} from './client/client-belly-analysis-overview/client-belly-analysis-overview.component';
import {AddTokenHeaderHttpRequestInterceptor} from './common/add-token-header.http-request-interceptor';
import {GoogleLoginProvider, SocialAuthServiceConfig, SocialLoginModule} from 'angularx-social-login';
import {defaultDataServiceConfig, environment} from '../environments/environment';
import { FooterComponent } from './footer/footer.component';
import { FutureClientComponent } from './future-client/future-client.component';
import {FutureClientEffects} from "./future-client/future-client-effects";
import { SimpleInputDialogComponent } from './common/simple-input-dialog/simple-input-dialog.component';
import { EmailsComponent } from './emails/emails.component';
import { IframeDialogComponent } from './common/iframe-dialog/iframe-dialog.component';
import { SpinnerDialogComponent } from './common/spinner-dialog/spinner-dialog.component';

import { LoggerModule, NgxLoggerLevel } from 'ngx-logger';
import { MatMomentDateModule, MAT_MOMENT_DATE_ADAPTER_OPTIONS } from '@angular/material-moment-adapter';


const appearance: MatFormFieldDefaultOptions = {
  appearance: 'outline'
};

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    ClientOverviewComponent,
    ConfirmationDialogComponent,
    ClientDetailComponent,
    ClientVisitOverviewComponent,
    ArrayTypeComponent,
    ObjectTypeComponent,
    MultiSchemaTypeComponent,
    NullTypeComponent,
    ClientVisitDetailComponent,
    TextareaAutoResizeComponent,
    ClientBellyAnalysisOverviewComponent,
    FooterComponent,
    FutureClientComponent,
    SimpleInputDialogComponent,
    EmailsComponent,
    IframeDialogComponent,
    SpinnerDialogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    CdkStepperModule,
    CdkTableModule,
    MatAutocompleteModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatCardModule,
    MatCheckboxModule,
    MatDatepickerModule,
    MatDialogModule,
    MatDividerModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatNativeDateModule,
    MatPaginatorModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    MatRadioModule,
    MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSnackBarModule,
    MatSortModule,
    MatTableModule,
    MatTabsModule,
    MatToolbarModule,
    MatTooltipModule,
    ToastrModule.forRoot({positionClass: 'toast-bottom-full-width'}),
    StoreModule.forRoot({}),
    EffectsModule.forRoot([ClientEffects, ClientVisitEffects, FutureClientEffects]),
    EntityDataModule.forRoot(entityConfig),
    StoreDevtoolsModule.instrument({}),
    FormlyMaterialModule,
    MatNativeDateModule,
    MatMomentDateModule,
    SocialLoginModule,
    FormlyMatDatepickerModule,
    FormlyModule.forRoot({
      extras: {resetFieldOnHide: true},
      validationMessages: [
        {name: 'required', message: 'This field is required'},
        {name: 'null', message: 'should be null'},
        {name: 'uniqueItems', message: 'should NOT have duplicate items'}
      ],
      types: [
        {name: 'string', extends: 'input'},
        {
          name: 'number',
          extends: 'input',
          defaultOptions: {
            templateOptions: {
              type: 'number',
            },
          },
        },
        {
          name: 'integer',
          extends: 'input',
          defaultOptions: {
            templateOptions: {
              type: 'number',
            },
          },
        },
        {name: 'boolean', extends: 'checkbox'},
        {name: 'enum', extends: 'select'},
        {name: 'null', component: NullTypeComponent, wrappers: ['form-field']},
        {name: 'array', component: ArrayTypeComponent},
        {name: 'object', component: ObjectTypeComponent},
        {name: 'multischema', component: MultiSchemaTypeComponent},
        {name: 'textarea-auto-resize', component: TextareaAutoResizeComponent, wrappers: ['form-field']}
      ],
    }),
    FormsModule,
    LoggerModule.forRoot({
      serverLoggingUrl: defaultDataServiceConfig.root + '/log',
      level: environment.logLevel,
      serverLogLevel: environment.serverLogLevel,
      disableConsoleLogging: false
    })
  ],
  providers: [{provide: DefaultDataServiceConfig, useValue: defaultDataServiceConfig}, {
    provide: HTTP_INTERCEPTORS,
    useClass: AddTokenHeaderHttpRequestInterceptor,
    multi: true
  },
  {provide: MAT_MOMENT_DATE_ADAPTER_OPTIONS, useValue: {useUtc: true }},
    {
      provide: 'SocialAuthServiceConfig',
      useValue: {
        autoLogin: true,
        providers: [
          {
            id: GoogleLoginProvider.PROVIDER_ID,
            provider: new GoogleLoginProvider(
              '685406861722-codu8k59v6hf3epmd8773va18lbmuuit.apps.googleusercontent.com'
            )
          }
        ]
      } as SocialAuthServiceConfig
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
