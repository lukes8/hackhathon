import { Injectable } from '@angular/core';
import { Good } from '..';

@Injectable({
  providedIn: 'root'
})
export class GoodsService {
  goods: Good[] = [{id: 1, title: 'Brambory', address: 'Brno Zabovresky 33', datePickedUp: new Date(),  
                  reservation: true, afterGuarantee: true, numberOfLikes:2, likeYou: false, isReserved: false, description: 'hnile', urlImage: './../assets/potatoes.jpg'},
                  {id: 1, title: 'Jahody', address: 'Brno Bohunice 87', datePickedUp: new Date(),  
                  reservation: true, afterGuarantee: false, numberOfLikes:6, likeYou: false, isReserved: true , description: 'hnile', urlImage: './../assets/strawberies.jpg'},
                  {id: 1, title: 'Gulas', address: 'Brno Lesna 34', datePickedUp: new Date(),  
                  reservation: false, afterGuarantee: false, numberOfLikes:2, likeYou: false, isReserved: false, description: 'S hovězím masem', urlImage: './../assets/gulash.jpg'},
                  {id: 1, title: 'Okurka', address: 'Brno Julianov 3', datePickedUp: new Date(),  
                  reservation: true, afterGuarantee: false, numberOfLikes:0, likeYou: false, isReserved: false, description: 'cerstva', urlImage: './../assets/cucumber.jpg'},
                  {id: 1, title: 'Jogurt', address: 'Brno Zabovresky 65', datePickedUp: new Date(),  
                  reservation: true, afterGuarantee: false, numberOfLikes:14, likeYou: false, isReserved: false, description: 'Smotanový Kunin', urlImage: './../assets/jogurt.jpg'},];

  constructor() { }

  addGoods(good: Good): void{
      this.goods.push(good);
}

  getGoods(): Good[]{
      return this.goods.slice();
  }
}
