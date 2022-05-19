import { Component } from '@angular/core';
import { ViewModel } from './view.model';
import { ViewService } from './services/view.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent {

  constructor(public model: ViewModel, private service: ViewService) {
    service.getAll().subscribe(
      res => {
        this.model.setCards(res);
      }
    );
  }

  onLike(event, card) {
    event.target.parentElement.disabled = true;
    card.likes++;
    this.service.update(card);
  }
}
