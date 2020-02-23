package com.budgetme.budgetme.controller

import com.budgetme.budgetme.dto.ChargeRequest
import com.budgetme.budgetme.model.ExpenseBudget
import com.budgetme.budgetme.model.ExpenseType
import com.budgetme.budgetme.repository.ExpenseBudgetRepository
import org.springframework.web.bind.annotation.*
import java.lang.Exception
import java.util.*

@RequestMapping("api/budget")
@RestController
class BudgetController (val expenseBudgetRepository: ExpenseBudgetRepository) {

  @PostMapping(path = ["charge"])
  public fun charge(@RequestBody chargeRequest: ChargeRequest): ExpenseBudget {
    // TODO: Process charge, return object of type ExpenseBudget
    return ExpenseBudget(UUID.randomUUID(), ExpenseType.MONTHLY_GAS, 500, 200)
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
