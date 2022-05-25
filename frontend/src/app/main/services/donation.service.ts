import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { Donation } from '../model/donation';
import { localBase, httpOptions } from '../../exports';

@Injectable()
export class DonationService {

  constructor(private _http: HttpClient) {
  }

  get(id: number): Observable<any> {
    let url: string = localBase + '/donation/' + id;
    return this._http.get<any>(url, httpOptions);
  }

  getAll(): Observable<Donation[]> {
    let url: string = localBase + '/donation';
    //return this._http.get<Donation[]>(url, httpOptions);

    let cards_ = new BehaviorSubject<Donation[]>([]);
    cards_.next([new Donation(), new Donation()]);

    return cards_.asObservable();
  }

  update(donation: Donation): Observable<any> {
    let url: string = localBase + '/donation/${donation.id}';
    return this._http.put<any>(url, donation, httpOptions);
  }

  create(donation: Donation): Observable<any> {
    let url: string = localBase + '/donation';
    return this._http.post<any>(url, donation, httpOptions);
  }
}
