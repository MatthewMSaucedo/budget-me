export enum ExpenseType {
  MONTHLY_RENT_COST,
  MONTHLY_UTILITY_COST,
  MONTHLY_GROCERIES_COST,
  MONTHLY_SPENDING_MONEY,
  MONTHLY_JULIENNE_ALLOWANCE,
  MONTHLY_GAS
}

export interface ExpenseBudget {
  id: string;
  expenseType: ExpenseType;
  total: number;
  remaining: number;
}

export interface ChargeRequest {
  expenseType: ExpenseType;
  cost: number;
}
