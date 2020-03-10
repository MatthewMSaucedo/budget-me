package com.budgetme.budgetme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BudgetMeApplication

fun main(args: Array<String>) {
	runApplication<BudgetMeApplication>(*args)
}

@RestController
class MainController{
	@GetMapping
	fun index()="Hello World"
}