import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  user;

  constructor(private service: AppService) {
  }

  ngOnInit() {
    this.service.login().subscribe(
      user => {
        this.user = user;
      }
    );
  }
}
