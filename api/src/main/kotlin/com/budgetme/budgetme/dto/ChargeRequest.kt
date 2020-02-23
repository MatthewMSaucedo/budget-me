package com.budgetme.budgetme.dto

import com.budgetme.budgetme.model.ExpenseType

class ChargeRequest(val expenseType: ExpenseType, val cost: Int) { }
