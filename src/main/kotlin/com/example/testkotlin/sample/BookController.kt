package com.example.testkotlin.sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


@RestController
class  BookController{



    @GetMapping("/books")
    fun findBookList(@RequestParam bookName : String) : ArrayList<Book>?{

        val bookList : ArrayList<Book>
        //return bookList
        return null
    }
}

data class Book(
        @field:NotNull
        val bookNo : Int,

        @field:NotEmpty
        val bookName : String,

        @field:NotEmpty
        val publisher : String
)