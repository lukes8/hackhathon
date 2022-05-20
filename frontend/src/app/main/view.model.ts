import { Injectable } from '@angular/core';
import { Donation } from './model/donation'

@Injectable()
export class ViewModel {
  donations: Donation[];

  setDonations(donations: Donation[]) {
    this.donations = donations;
  }
}
