package com.budgetme.budgetme.controller

import com.budgetme.budgetme.dto.ChargeRequest
import com.budgetme.budgetme.model.ExpenseBudget
import com.budgetme.budgetme.repository.ExpenseBudgetRepository
import com.budgetme.budgetme.util.minus
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"])
@RequestMapping("api/budget")
@RestController
class BudgetController (val expenseBudgetRepository: ExpenseBudgetRepository) {

  @PostMapping(path = ["charge"])
  public fun charge(@RequestBody chargeRequest: ChargeRequest): ExpenseBudget {
    return expenseBudgetRepository.save(chargeRequest.expenseBudget - chargeRequest.cost)
  }

  @GetMapping(path = ["listExpenseBudget"])
  public fun listExpenseBudgetByUser(@RequestBody refUserId: Int): List<ExpenseBudget> {
    return expenseBudgetRepository.findByRefUserId(refUserId);
  }

  @PostMapping(path = ["createExpenseBudget"])
  public fun createExpenseBudget(@RequestBody expenseBudget: ExpenseBudget): ExpenseBudget {
    println(expenseBudget)
    return expenseBudgetRepository.save(expenseBudget);
  }

}
