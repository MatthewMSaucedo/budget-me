package com.budgetme.budgetme.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class ExpenseBudget (
  @Id val id: UUID,
  val refExpenseType: UUID,
  val total: Int,
  val remaining: Int
) { }
