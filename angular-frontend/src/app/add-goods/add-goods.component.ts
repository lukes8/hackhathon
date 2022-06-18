import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Good } from '..';
import { GoodsService } from '../service/goods.service';
import { addSuccess } from 'src/app/animation/animation';

@Component({
  selector: 'app-add-goods',
  templateUrl: './add-goods.component.html',
  styleUrls: ['./add-goods.component.scss'],
  animations: [addSuccess]
})
export class AddGoodsComponent implements OnInit {

  good: Good = {id: 0, title: '', address: '', datePickedUp: new Date(),  
  reservation: false, afterGuarantee: false, numberOfLikes:0, likeYou: false, isReserved: false, description: '', urlImage: ''}
  successMessage = 'Successful created';
  isSucess = false;

  constructor(private goodService: GoodsService) { }

  ngOnInit(): void {
  }

  addGood(form: NgForm):void{
    const ids = this.goodService.getGoods().map(object => {
      return object.id;
    });
    this.good.id = Math.max(...ids);
    this.good.title = form.value.title;
    this.good.address = form.value.address;
    this.good.datePickedUp = form.value.datePickedUp;
    this.good.reservation = form.value.reservation;
    this.good.afterGuarantee = form.value.afterGuarantee;
    this.good.description = form.value.description  
    this.goodService.addGoods(this.good);
    this.isSucess = true;
    form.reset()
    
    
  }

  

  onSelectFile(event: any) { // called each time file input changes
    if (event.target.files && event.target.files[0]) {
      var reader = new FileReader();

      reader.readAsDataURL(event.target.files[0]); // read file as data url
      reader.onload = (event: any) => { // called once readAsDataURL is completed
        this.good.urlImage = event.target.result;
      }
    }
}

animationStarted(event: any) {
  console.log('start anim')
}

animationEnded(event: any) {
  console.log('finish anim')
  this.isSucess = false
}

}
