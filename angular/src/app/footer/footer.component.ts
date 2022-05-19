import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {ClientService} from "../client/client-overview/client.service";
import {MatTableDataSource} from "@angular/material/table";
import {Observable} from "rxjs";
import Version from "./version";
import {VersionService} from "./version.service";
import {NGXLogger} from "ngx-logger";

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent implements OnInit {
  actualVersion: Version | undefined;
  versions$: Observable<Version[]>;

  constructor(private versionService: VersionService, private logger: NGXLogger) {
    this.versions$ = versionService.entities$;
    this.versions$.subscribe(result => {
      if (result !== undefined && result[0] !== undefined)
        this.actualVersion = result[0];
    });
  }
  ngOnInit(): void {
    this.versionService.getAll();
  }
}
