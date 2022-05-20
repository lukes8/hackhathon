import { Component, ViewChild } from '@angular/core';
import { Donation } from '../model/donation';
import { DonationService } from '../services/donation.service'

@Component({
  selector: 'app-donation',
  templateUrl: './donation.component.html',
  styleUrls: ['./donation.component.css']
})
export class DonationComponent {

  donation: Donation;

  constructor(private service: DonationService) {
    this.donation = new Donation();
  }

  save() {
    console.log(this.donation);
  }
}
