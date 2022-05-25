import { Injectable } from '@angular/core';
import { Card } from './model/card'

@Injectable()
export class ViewModel {
  cards: Card[];

  setCards(cards: Card[]) {
    this.cards = cards;
  }
}
