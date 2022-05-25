import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { Card } from '../model/card';
import { localBase, httpOptions } from '../../exports';

@Injectable()
export class ViewService {

  constructor(private _http: HttpClient) {
  }

  get(id: number): Observable<any> {
    let url: string = localBase + 'rest/blah/blah/' + id;
    return this._http.get(url, httpOptions);
  }

  getAll(): Observable<Card[]> {
    let url: string = localBase + 'rest/blah/blah/';
    //return this._http.get<Card[]>(url, httpOptions);

    let cards_ = new BehaviorSubject<Card[]>([]);
    cards_.next([{id : 0, title : "test title", type : ["test type"], pickupPoint : "test pickupPoint", reservation : true, pickupDate : new Date(), likes : 5}]);

    return cards_.asObservable();
  }

  update(card: Card): Observable<any> {
    let url: string = localBase + 'rest/blah/blah/${card.id}';
    console.log("update");
    return this._http.put(url, card, httpOptions);
  }
}
