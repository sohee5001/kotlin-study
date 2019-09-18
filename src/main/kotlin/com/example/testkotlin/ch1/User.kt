package com.example.testkotlin.ch1

data class User(val no:Int, val name: String , val email: String)


fun main(args : Array<String>){

    val list = ArrayList<User>();

    val user1= User(1,"김소희","ella@leadsoft.co.kr")
    list.add(user1)

    val user2= User(2,"김소희_네이버","ella@naver.com")
    list.add(user2)

    println("List size ${list.size} ")

    if(user1.equals(user2)){
        println(" user1 === user2 ")
    }else{
        println(" user1 !== user2 ")
    }
}