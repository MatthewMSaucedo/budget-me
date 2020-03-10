package com.budgetme.budgetme.dto

import com.budgetme.budgetme.model.ExpenseBudget

class ChargeRequest(val expenseBudget: ExpenseBudget, val cost: Int) { }
