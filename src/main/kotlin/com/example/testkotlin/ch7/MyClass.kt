package com.example.testkotlin.ch7

class UserClass constructor(val name : String,val a : Int){
    //var name : String = "world"

    fun sayHello(){
        println("hello $name")
    }
}

class MyClass{

    var name : String = "world"

    fun sayHello(){
        println("hello $name")
    }
}

// 매개변수에 기본값 명시 가능.
class MyClass2(val name :String,val id : Int = 0){

    fun sayHello(){
        println("hello $name")
    }
}

////class User5(val name : String, val age : Int)  : 에러 발생 동일 이름 val 선언으로 컴파일 에러발생,
//class User5(name : String, val age : Int){
//
//    val name : String = "test"
//
//    init {
//        println("start $name")
//    }
//
//    fun sayHello(){
//        println("hello $name")
//    }
//}



fun main(args : Array<String>){

//    에러 버전
//    val obj1 = MyClass2()  : 에러 발생 . 매개변수 있는 생성자에 매개변수 미 입력시 에러.
//    val obj2 = MyClass("test") : 에러 발생 . 매개변수 없는 생성자에 매개변수 입력시 에러.
//    성공 버전
//    val obj1 = MyClass()
//    val obj2 = MyClass2("test")

//    val obj3 = UserClass("aa",3)
//
//    obj3.sayHello()

//    obj1.name = "kkang"
//    obj2.name = "a"

//    obj1.sayHello()
//    obj2.sayHello()

//    val user = User5("소희",27)
//    user.sayHello()

    class UserTest(var name : String , val age : Int)
    val user = UserTest("소희",27)
    println(user.name)
8
}