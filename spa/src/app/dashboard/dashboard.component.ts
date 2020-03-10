import { Component, OnInit } from '@angular/core';
import { DashboardService } from './dashboard.service';
import { ExpenseBudget } from '../server-communication/app.endpoint.constants';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  public expenseBudgetList: ExpenseBudget[];

  constructor(public dashboardService: DashboardService) { }

  async ngOnInit() {
    this.expenseBudgetList = await this.dashboardService.listBudgetExpenses();
    console.log(this.expenseBudgetList);
  }
}
