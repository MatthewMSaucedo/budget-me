import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class AppEndpointService {
  private _dbUrl = 'http://localhost:8080/api/budget';

  constructor(private http: HttpClient) { }

}
