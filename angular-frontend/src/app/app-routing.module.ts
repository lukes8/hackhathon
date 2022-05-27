import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddGoodsComponent } from './add-goods/add-goods.component';
import { ListGoodsComponent } from './list-goods/list-goods/list-goods.component';

const routes: Routes = [
  { path: '', redirectTo: '/list', pathMatch: 'full' },
  { path: 'list', component: ListGoodsComponent},
  { path: 'add', component: AddGoodsComponent, },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
