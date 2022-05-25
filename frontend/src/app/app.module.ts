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
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatButtonToggleModule } from '@angular/material/button-toggle';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { FormsModule } from '@angular/forms';

import { HeaderComponent } from './header/header.component';
import { ViewComponent } from './main/view.component';
import { DonationComponent } from './main/donation/donation.component'

import { ViewModel } from './main/view.model'
import { DonationService } from './main/services/donation.service'
import { UserService } from './main/services/user.service'
import { AppService } from './app.service'


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ViewComponent,
    DonationComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatToolbarModule,
    MatButtonModule,
    FlexLayoutModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatButtonToggleModule,
    MatCheckboxModule

  ],
  providers: [
    ViewModel,
    DonationService,
    UserService,
    AppService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
