package com.example.testkotlin.ch6

import java.util.Arrays.asList
import java.util.stream.Collectors.toList


fun main(args: Array<String>){

   // getindices()
    //getWithIndex()
    //other()
    //label()

//    ex1)
//    val array1 = arrayOf("배열","배열2","배열3")
//    array1.set(2,"dddd")
//    some(*array1)

//    ex2)
    val test22 = asList<String>("test","hhh","aa","Test","mutable 테스트")
    some(*test22.toTypedArray())

//    ex3)
//    val listTest= arrayListOf<String>("test","hhh","aa","Test","mutable 테스트")
//    listTest.add("들어갈까요??")
//    some(*listTest.toTypedArray())

//    val list3 = listOf<String>("test","hello","dfd")
//   some2(*list3.toTypedArray())  // 컬렉션 타입을 배열형태로 변환.



    val a : Int = 50
    val b : String = a.toString()

    print(b)

    //some("2","3","hhh") // 전개 연산자
//    val array3 = arrayOf<String>("전개연산자 test","~~!","??")
//    some(*array3)

}

fun getindices(){
//    val listOf = listOf<String>("오늘은","패스트캠퍼스로","이사한","날")
//    for(i in list.indices) println(" ${i}번째 값은  ${listOf[i]} ")

//    val arrayOf = arrayOf<String>("오늘은","패스트캠퍼스로","이사한","날")
//    for(i in arrayOf.indices) println(" ${i}번째 값은  ${arrayOf[i]} ")

    val arrayListOf = arrayListOf<String>("오늘은","패스트캠퍼스로","이사한","날")
    for(i in arrayListOf.indices) println(" ${i}번째 값은  ${arrayListOf[i]} ")
}

fun getWithIndex(){
    val list = listOf<String>("오늘은","코틀린","공부를","끝내는 날")
    for((i,data) in list.withIndex()) println("${i} ===  ${data}")
}

fun other(){

    for(i in 1..10) print("${i}  ")    // 1 ~ 10
    println()
    for(i in 1 until 10) print("${i}  ")   // 1 ~ 9
    println()
    for(i in 1..10 step 3) print("${i}  ")   // 1 4 7 10
    println()
    for(i in 10 downTo 1 step 3) print("${i}  " )   // 10 7 4 1
    println()
}

// 해당 라벨 위치로 점프.
fun label(){

   for(i in 1..3){
       ta@ for(j in 1..3){
            if(j>1)  break@ta

            println(" i == ${i} , j == ${j}")
        }
    }
}

//전개 연산자
fun some(vararg a: String){
    val iterator = a.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}

//전개 연산자2
fun some2(vararg a: String){
    val iterator = a.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}