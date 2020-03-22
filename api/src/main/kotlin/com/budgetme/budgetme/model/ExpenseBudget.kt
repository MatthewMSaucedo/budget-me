package com.budgetme.budgetme.model

import javax.persistence.*

@Entity
class ExpenseBudget (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int?,
  val refUserId: Int?,
  val expenseType: String?,
  val total: Int?,
  val remaining: Int?
) { }
