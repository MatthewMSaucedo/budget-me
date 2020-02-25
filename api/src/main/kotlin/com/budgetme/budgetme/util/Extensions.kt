package com.budgetme.budgetme.util

import com.budgetme.budgetme.model.ExpenseBudget

operator fun ExpenseBudget?.minus(cost: Int): ExpenseBudget {
  return ExpenseBudget(this?.id, this?.expenseType, this?.total, this?.remaining?.minus(cost))
}
