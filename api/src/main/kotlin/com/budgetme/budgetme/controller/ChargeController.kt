package com.budgetme.budgetme.controller

import com.budgetme.budgetme.dto.ChargeRequest
import com.budgetme.budgetme.model.ExpenseBudget
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RequestMapping("api/charge")
@RestController
class ChargeController {

  @PostMapping(path = ["charge"])
  public fun charge(@RequestBody chargeRequest: ChargeRequest): ExpenseBudget {
    // TODO: Process charge, return object of type ExpenseBudget
    return ExpenseBudget(UUID.randomUUID(), UUID.randomUUID(), 500, 200)
  }
}
