package com.example.testkotlin.ch5

//// 코틀린에서는 기초 타입이 없음. java에서는 int , double등 기초타입이 존재하지만 코틀린에서는 기초타입이 없음. 클래스로 타입을 명시한다.


val intData : Int  = 10  // intData는 Int 객체.  Int 객체 내의 minus() 함수를 사용할수 있음.
val result = intData.minus(5)    // minus() 왼쪽에서 오른쪽값을 빼는 함수.


// Int 타입 값에는 _(밑줄)을 넣을 수 있다.
val oneMillion : Int = 1_000_000



val charData = 'D'

fun check(c : String) {
    print(c)
}

fun main(args : Array<String>){
/*    println(result)
    println(oneMillion)
    check("Hello")*/


    /// String 문자열은 ""(큰따옴표) 또는 """(큰따옴표 세개) 로 묶어서 표현한다.
    val str2 = "test \n Enter"
    val str3 = """Hello 
        Wrorld"""

    println(str2)
    println(str3)
}
