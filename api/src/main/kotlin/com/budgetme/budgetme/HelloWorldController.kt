package com.budgetme.budgetme

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
  @GetMapping("/")
  fun getHelloUniverse() = "Hello Universe"
}
