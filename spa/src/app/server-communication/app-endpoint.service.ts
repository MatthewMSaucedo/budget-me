import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { ChargeRequest, ExpenseBudget, CreateExpenseBudgetRequest } from './app.endpoint.constants';

@Injectable({ providedIn: 'root' })
export class AppEndpointService {
  private _dbUrl = 'http://budgetme-env.jixtdvdf7f.us-east-1.elasticbeanstalk.com/api/budget/';

  constructor(private http: HttpClient) { }

  public charge(chargeRequest: ChargeRequest): Promise<ExpenseBudget> {
    return this.http.post<ExpenseBudget>(`${this._dbUrl}/charge`, chargeRequest).toPromise();
  }

  public listExpenseBudget(): Promise<ExpenseBudget[]> {
    return this.http.get<ExpenseBudget[]>(`${this._dbUrl}/charge`).toPromise();
  }

  public createExpenseBudget(createExpenseBudgetRequest: CreateExpenseBudgetRequest): Promise<ExpenseBudget> {
    return this.http.post<ExpenseBudget>(`${this._dbUrl}/createExpenseBudget`, createExpenseBudgetRequest).toPromise();
  }
}
