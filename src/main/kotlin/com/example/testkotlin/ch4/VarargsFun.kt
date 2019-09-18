package com.example.testkotlin.ch4

///////////////// 가변 인수 /////////////////////////
fun varargsFun(data1 : Int){}
fun varargsFun2(data1 : Int, data2 : String){}
////////////////오버라이딩 ===== 위에 처럼  해주면 소스량이 길어짐. 아래와 같이하면 소스량을 줄일 수 있음./////////////////////////////////

// 가변 인수 (vararg) :  오버라이딩(기존의 매개변수를 다르게 해서 여러개의 함수를 만들어야 했던것)을 가변인수 선언으로 쉽게 작성할수 있음.
fun<T> varrargsFun3(a1 : Int ,vararg  arrayTest : T){
    println("test"+a1+"=====")
    for(a in arrayTest)
        print(a)
}

fun varrargsFun4(a1 : Int , arrayTest : ArrayList<String>){
    println("test"+a1+"=====")
    for(a in arrayTest)
        print(a)
}

//////////재귀 함수 : 함수내의 자신의 함수를 다시 호출. 반복적으로 사용하는 로직을 줄일수 있음./////////////
fun cases(obj : Any){
    when(obj) {
        "Test" -> println("test 입니다.")
        "CheckIN" -> println("CheckIN 입니다.")
        100 -> println("100 입니다.")
        "CheckOUT" -> println("CheckOUT 입니다.")
    }
}

fun main(args : Array<String>){
    varrargsFun3(10,"h","e","l","l","l")
    varrargsFun3(10,"h",1,"t",4,"l")
    varrargsFun3(20,1,2,3,4,5,6,7)

    val testArray = ArrayList<String>()
    testArray.add("test0 ")
    testArray.add("test1 ")
    testArray.add("test2 ")

    varrargsFun4(30 , testArray)

    cases("Test")
    cases(100)
}

