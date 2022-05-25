import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { User } from '../model/user';
import { localBase, httpOptions } from '../../exports';

@Injectable()
export class UserService {

  constructor(private _http: HttpClient) {
  }

}
