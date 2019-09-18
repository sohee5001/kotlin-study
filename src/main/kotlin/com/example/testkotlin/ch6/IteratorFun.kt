package com.example.testkotlin.ch6

fun main(args : Array<String>){

    val list1 = listOf<String>("hello","list")

    val iterator1 = list1.iterator();

    while(iterator1.hasNext()){
        println(iterator1.next())
    }

    val map = mapOf<String,Int>("one" to 1,"two" to 2)

    val iterator2 : Iterator<Map.Entry<String, Int>> = map.iterator()

    while (iterator2.hasNext()){
        val entry = iterator2.next()
       /* println("${entry.key} - ${entry.value}")*/
        println(entry.key +"-"+ entry.value)
    }
}