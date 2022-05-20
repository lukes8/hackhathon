import { Component } from '@angular/core';
import { ViewModel } from './view.model';
import { DonationService } from './services/donation.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent {

  constructor(public model: ViewModel, private service: DonationService) {
    service.getAll().subscribe(
      res => {
        this.model.setDonations(res);
      }
    );
  }

  onLike(event, donation) {
    event.target.parentElement.disabled = true;
    donation.likes++;
    this.service.update(donation);

  }
}
