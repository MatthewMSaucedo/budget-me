package com.budgetme.budgetme.controller

import com.budgetme.budgetme.dto.ChargeRequest
import com.budgetme.budgetme.model.ExpenseBudget
import com.budgetme.budgetme.repository.ExpenseBudgetRepository
import com.budgetme.budgetme.util.minus
import org.springframework.web.bind.annotation.*

@RequestMapping("api/budget")
@RestController
class BudgetController (val expenseBudgetRepository: ExpenseBudgetRepository) {

  @PostMapping(path = ["charge"])
  public fun charge(@RequestBody chargeRequest: ChargeRequest): ExpenseBudget {
    return expenseBudgetRepository.save(chargeRequest.expenseBudget - chargeRequest.cost)
  }

  @GetMapping(path = ["listExpenseBudget"])
  public fun listExpenseBudget(): List<ExpenseBudget> {
    return expenseBudgetRepository.findAll();
  }

  @PostMapping(path = ["createExpenseBudget"])
  public fun createExpenseBudget(@RequestBody expenseBudget: ExpenseBudget): ExpenseBudget {
    println(expenseBudget)
    return expenseBudgetRepository.save(expenseBudget);
  }

}