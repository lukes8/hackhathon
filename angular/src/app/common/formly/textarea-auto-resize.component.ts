import {Component, OnInit, ViewChild} from '@angular/core';
import {FieldType} from '@ngx-formly/material';
import {MatInput} from '@angular/material/input';
import {FormControl} from '@angular/forms';

@Component({
  template: `
    <textarea matInput
              [id]="id"
              [formControl]="customFormControl"
              [errorStateMatcher]="errorStateMatcher"
              [cols]="to.cols"
              [rows]="to.rows"
              [formlyAttributes]="field"
              [matTextareaAutosize]="true"
    >
    </textarea>
  `
})
export class TextareaAutoResizeComponent extends FieldType implements OnInit {
  customFormControl: FormControl = new FormControl();
  // @ts-ignore
  @ViewChild(MatInput) formFieldControl: MatInput;

  ngOnInit(): void {
    this.customFormControl = this.formControl as FormControl;
  }
}
