package com.example.testkotlin.ch3

/////////////// 중위 연산자 : 피연산자를 중간에 놓는다. ////////////////////

data class Test(var a : Int)

class Funclass{

    infix fun infixFun(a : Int){
        print(" test calll ~~~ ${a}")
    }
}

fun String.myFun(x :Int) : Int =  x * x
fun Test.myFun2(x :Int) : Int = x * x
fun Any.myFun3(x :Int) : Int = x * x

fun main(args :Array<String>){

    val obj = Funclass()
    obj.infixFun(10)

    // 중위 표현식. 사용해주기위해선 함수에 infixFun을 붙여야함.
    obj infixFun 10

    println( "aaa".myFun(10))
    println( Test(1).myFun2(10))
    println( Test(1).myFun3(10))

}