package com.example.testkotlin.ch6

fun main(args : Array<String>){

    class User

    val user1 = User()
    val user2 = User()
    val user3 = user1

    println("user1 == user2 is ${user1 == user2}")
    println("user1 === user2 is ${user1 === user2}")
    println("user1 == user3 is ${user1 == user3}")
    println("user1 === user3 is ${user1 === user3}")

    // == 는 값 비교 === 참조하고 있는 메모리 비교.


}