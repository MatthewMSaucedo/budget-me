package com.budgetme.budgetme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BudgetMeApplication

fun main(args: Array<String>) {
	runApplication<BudgetMeApplication>(*args)
}
