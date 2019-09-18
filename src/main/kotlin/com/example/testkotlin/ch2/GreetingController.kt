package com.example.testkotlin.ch2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController{

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name") name : String) : String{
          Greeting(counter.incrementAndGet(), "Hello, $name")
        print(test2)
        test()

        return "hee";
    }

}