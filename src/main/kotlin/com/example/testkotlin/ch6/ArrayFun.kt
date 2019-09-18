package com.example.testkotlin.ch6

fun main(args : Array<String>){

    val array3  = Array(3, {i -> i*10})


    for(a in array3){
        println(a)
    }

    var array2 = intArrayOf(1,2,3,4,5)
    println("${array2[0]} +  ${array2[1]}  +  ${array2[2]}")
    var array1 = arrayOf<Int>(1,2,3,4)



    var test = Array(3,
            { val i: Int = 0; i*10 }
    )

    for(a in test){
        println(a)
    }


}