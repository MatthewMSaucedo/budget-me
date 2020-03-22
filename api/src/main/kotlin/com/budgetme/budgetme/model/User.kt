package com.budgetme.budgetme.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int?,
  val name: String?,
  val hashedPassword: String?
) { }
