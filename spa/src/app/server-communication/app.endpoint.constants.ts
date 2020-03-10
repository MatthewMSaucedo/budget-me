export interface ExpenseBudget {
  id: string;
  expenseType: string;
  total: number;
  remaining: number;
}

export interface ChargeRequest {
  expenseBudget: ExpenseBudget;
  cost: number;
}

export interface CreateExpenseBudgetRequest {
  expenseType: string;
  total: number;
  remaining: number;
}
