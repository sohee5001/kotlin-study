package com.example.testkotlin.ch4

data class Test(val a : Int)

fun main(args : Array<String>){

//    val test = ArrayList<String>()
//
//    test.add("rlathgml")
//    test.add("rla")
//    test.add("ghdrlfehd")
//
//    val x : Int = 3
//
//    if(x !in 0..test.size +5){
//        print("Out : array 사이즈는 ${test.size} 요청한 x =${x}")
//    }else {
//        print("값이 포함되어 있습니다.")
//    }
//
//    for(x in 0..test.size-1){
//        println("${x}는 === ${ test[x] }")
//    }
    println(getStringlength("hkhk"))
    println(getStringlength(123))

}
fun getStringlength(obj : Any) : String?{

    if(obj is String){
        return "${obj}는 문자열입니다. 길이는 === ${obj.length} "
    }

    return "${obj}는 문자열이 아닙니다."

}
