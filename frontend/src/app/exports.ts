import { HttpHeaders } from '@angular/common/http';
import { formatDate } from '@angular/common';

export const localBase = "";

export const dateFormat = 'dd.MM.yyyy';

export const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type' : 'application/json' })
}

export function formatDateDefault(date: Date): string {
  return formatDate(date, dateFormat, 'en-US');
}
