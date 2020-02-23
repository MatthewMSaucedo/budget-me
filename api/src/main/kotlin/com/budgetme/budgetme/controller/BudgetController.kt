package com.budgetme.budgetme.controller

import com.budgetme.budgetme.dto.ChargeRequest
import com.budgetme.budgetme.model.ExpenseBudget
import com.budgetme.budgetme.model.ExpenseType
import com.budgetme.budgetme.repository.ExpenseBudgetRepository
import com.budgetme.budgetme.util.minus
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RequestMapping("api/budget")
@RestController
class BudgetController (val expenseBudgetRepository: ExpenseBudgetRepository) {

  @PostMapping(path = ["charge"])
  public fun charge(@RequestBody chargeRequest: ChargeRequest): ExpenseBudget {
    val expenseBudget = expenseBudgetRepository.findByExpenseType(chargeRequest.expenseType)
    return expenseBudgetRepository.save(expenseBudget - chargeRequest.cost)
  }

  @GetMapping(path = ["getBudgetByExpenseType"])
  public fun getBudgetByExpenseType(@PathVariable("expenseType") expenseType: ExpenseType): ExpenseBudget {
    return try {
      expenseBudgetRepository.findByExpenseType(expenseType)
    } catch (e: Exception) {
      throw e;
    }
  }
}
