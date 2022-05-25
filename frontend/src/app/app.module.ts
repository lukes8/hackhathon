import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule} from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { FlexLayoutModule } from '@angular/flex-layout';

import { HeaderComponent } from './header/header.component';
import { ViewComponent } from './main/view.component';
import { ViewModel } from './main/view.model'
import { ViewService } from './main/services/view.service'
import { UserService } from './main/services/user.service'
import { AppService } from './app.service'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ViewComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatToolbarModule,
    MatButtonModule,
    FlexLayoutModule
  ],
  providers: [
    ViewModel,
    ViewService,
    UserService,
    AppService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
