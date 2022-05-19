import { FormGroup } from '@angular/forms';
import { FormlyFormOptions, FormlyFieldConfig } from '@ngx-formly/core';

export interface Section {
    form: FormGroup;
    model: any;
    formOptions: FormlyFormOptions;
    formFields: FormlyFieldConfig[];
}
