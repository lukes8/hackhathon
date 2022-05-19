import { Injectable } from '@angular/core';
import { EntityCollectionServiceBase, EntityCollectionServiceElementsFactory } from '@ngrx/data';
import Version from './version';

@Injectable({
  providedIn: 'root'
})
export class VersionService extends EntityCollectionServiceBase<Version> {
  constructor(serviceElementsFactory: EntityCollectionServiceElementsFactory) {
    super('Version', serviceElementsFactory);
  }
}
