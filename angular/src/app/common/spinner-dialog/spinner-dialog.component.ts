import {Component} from '@angular/core';
import {MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-spinner-dialog',
  templateUrl: './spinner-dialog.component.html',
  styleUrls: ['./spinner-dialog.component.scss']
})
export class SpinnerDialogComponent {
  constructor(public dialogRef: MatDialogRef<SpinnerDialogComponent>) {
  }
}
