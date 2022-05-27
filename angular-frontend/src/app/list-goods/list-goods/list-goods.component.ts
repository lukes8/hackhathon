import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-goods',
  templateUrl: './list-goods.component.html',
  styleUrls: ['./list-goods.component.scss']
})
export class ListGoodsComponent implements OnInit {
  likes: number = 3;
  likeB: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }
  increaseLikes(): void{
    this.likes = this.likes + 1;
    this.likeB = true;
    console.log('lallala')
  }

}
