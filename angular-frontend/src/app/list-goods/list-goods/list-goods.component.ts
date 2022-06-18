import { Component, OnInit } from '@angular/core';
import { Good } from 'src/app';
import { GoodsService } from 'src/app/service/goods.service';

@Component({
  selector: 'app-list-goods',
  templateUrl: './list-goods.component.html',
  styleUrls: ['./list-goods.component.scss']
})
export class ListGoodsComponent implements OnInit {
  goods: Good[] = []
 
  constructor(private goodService: GoodsService) { }

  ngOnInit(): void {
    this.goods = this.goodService.getGoods();
  }
  increaseLikes(good: Good): void{
    if(good.likeYou === false){
      good.numberOfLikes = good.numberOfLikes + 1;
      good.likeYou = true;
    } else {
      good.numberOfLikes = good.numberOfLikes - 1;
      good.likeYou = false;
    }
  }

  makeReservation(good: Good): void{
    if(good.isReserved === false){
      good.isReserved = true;
    } else{
      good.isReserved = false;
    }
  }

}
