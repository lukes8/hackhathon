import {Component, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-iframe-dialog',
  templateUrl: './iframe-dialog.component.html',
  styleUrls: ['./iframe-dialog.component.scss']
})
export class IframeDialogComponent {
  constructor(public dialogRef: MatDialogRef<IframeDialogComponent>, @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }
}
