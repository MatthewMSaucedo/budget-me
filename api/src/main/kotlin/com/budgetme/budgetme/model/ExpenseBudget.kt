package com.budgetme.budgetme.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class ExpenseBudget (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int?,
  val expenseType: String?,
  val total: Int?,
  val remaining: Int?
) { }
