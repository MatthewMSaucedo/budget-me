package com.budgetme.budgetme.repository

import com.budgetme.budgetme.model.ExpenseBudget
import com.budgetme.budgetme.model.ExpenseType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ExpenseBudgetRepository: JpaRepository<ExpenseBudget, UUID> {
  fun findByExpenseType(expenseType: ExpenseType): ExpenseBudget
}
