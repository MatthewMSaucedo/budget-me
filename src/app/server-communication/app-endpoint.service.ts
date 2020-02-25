import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { ChargeRequest, ExpenseBudget } from './app.endpoint.constants';

@Injectable({ providedIn: 'root' })
export class AppEndpointService {
  private _dbUrl = 'http://localhost:8080/api/budget';

  constructor(private http: HttpClient) { }

  public charge(chargeRequest: ChargeRequest): Promise<ExpenseBudget> {
    return this.http.post<ExpenseBudget>(`${this._dbUrl}/charge`, chargeRequest).toPromise();
  }

  public listExpenseBudget(): Promise<ExpenseBudget[]> {
    return this.http.get<ExpenseBudget[]>(`${this._dbUrl}/charge`).toPromise();
  }
}
