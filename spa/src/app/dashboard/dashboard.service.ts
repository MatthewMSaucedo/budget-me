import { Injectable } from '@angular/core';
import { AppEndpointService } from '../server-communication/app-endpoint.service';
import { ExpenseBudget } from '../server-communication/app.endpoint.constants';

@Injectable({ providedIn: 'root' })
export class DashboardService {
  constructor(public appEndpointService: AppEndpointService) { }

  public listBudgetExpenses(): Promise<ExpenseBudget[]> {
    return this.appEndpointService.listExpenseBudget();
  }

}
