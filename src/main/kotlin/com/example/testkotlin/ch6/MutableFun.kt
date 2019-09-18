package com.example.testkotlin.ch6



fun main(args : Array<String>){


    // 불변 배열   add(), set(), get() 자체를 제공하지 않음.
    val immutableList : List<String> = listOf("hello","world")
    println("${immutableList[0]} +++ ${immutableList[1]}")


    // mutable :  가변 배열
    val mutableList : MutableList<String> = mutableListOf("hello","world")

    mutableList.add("kim")
    mutableList.set(1, "aaaa")
    println("${mutableList[0]} +++ ${mutableList[1]} +++ + ${mutableList[2]}")


  // java에서 사용했던 arrayList , hashMap 사용가능. JVM에서 수행가능한 것은 다 이용할수 있다.
    val mutableList2 : ArrayList<String> = arrayListOf("hello","world")

//    val immutableMap1 = mapOf<Int,String>(2 to "b" ,1 to "test")
//    println(immutableMap1[1])
//    println("${immutableMap1[2]}")
//    println("${immutableMap1.get(1)}")
//
//
//    val immutableSet1 = setOf<String>("hello","hello","test")
//    println("${immutableSet1.elementAt(0)} ++ ${immutableSet1.elementAt(1)} ")



}