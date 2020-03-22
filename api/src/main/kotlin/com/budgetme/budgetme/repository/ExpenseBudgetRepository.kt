package com.budgetme.budgetme.repository

import com.budgetme.budgetme.model.ExpenseBudget
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ExpenseBudgetRepository: JpaRepository<ExpenseBudget, UUID> {
    fun findByRefUserId(refUserId: Int): List<ExpenseBudget>
}
