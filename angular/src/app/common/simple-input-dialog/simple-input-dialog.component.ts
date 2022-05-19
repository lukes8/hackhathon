import {Component, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

export interface InputDialogData {
  title: string;
  field: string;
}

@Component({
  selector: 'app-simple-input-dialog',
  templateUrl: './simple-input-dialog.component.html',
  styleUrls: ['./simple-input-dialog.component.scss']
})
export class SimpleInputDialogComponent {
  value: any;
  constructor(public dialogRef: MatDialogRef<SimpleInputDialogComponent>, @Inject(MAT_DIALOG_DATA) public data: InputDialogData) {
  }
  closeDialog() {
    this.dialogRef.close(this.value);
  }

  onNoClick(): void {
    this.dialogRef.close();
  }
}
