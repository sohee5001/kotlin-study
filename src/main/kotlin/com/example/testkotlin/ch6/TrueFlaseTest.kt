package com.example.testkotlin.ch6


// 왼쪽먼저 체크하기 때문에 && 조건시 한쪽이 false이면 성립하지 않기에 다음꺼 수행 안함. || 조건시 한쪽이 true면 성립하기에 다음꺼 수행안함.
fun main(args : Array<String>){
    fun trueFun() : Boolean{
        println("call.. trueFun()")
        return true
    }
    fun falseFun() : Boolean{
        println("call.. falseFun()")
        return false
    }

    println("1")
    trueFun() && trueFun()
    println("2")
    trueFun() && falseFun()
    println("3")
    falseFun() || trueFun()
    println("4")
    trueFun() || trueFun()


}

