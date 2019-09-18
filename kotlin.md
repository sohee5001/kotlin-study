# Kotlin 기본 문법

 
 ## 1. Kotlin 장점

1.  Nullable 안전성<br> 
    ```kotlin
     Ex) fun test(a : String) : String? = a
      // a 값이 null인 경우 에러 발생. Nullable 허용하려면 변수타입에 ? 붙여줘야됨.
    ```
     
2.  Vararg(가변 인수) 선언으로 오버라이딩 메소드 로직 감소.
 
 ## 2. Kotlin 특징
 
-  변수 선언 <br>

| val | var    
|---|--- 
* 재사용 가능 | * 재사용 불가능 
* 컴파일러가Getter/setter 생성 |* 상수 변수 선언시 사용. 자바에서는 final 사용.  
  | * 컴파일러가 getter만 생성
    
- 배열 생성 <br>
 	 - default : ArrayOf(11,22,33,44)
     - 타입에 따른 배열 생성시 1,2번은 같은 형태.
        ```kotlin
          val a = ArrayOf<Int>(11,22,33,44) 
          val a = IntArrayOf(11,22,33,44) 
        ```
     - 가변 배열과 불변 배열. (map도 동일.) <br>
        a. mutableListOf  : 가변 배열
        ```kotlin
           val mutableList : MutableList<String> = mutableListOf("hello","world")
           mutableList.add("kim")
           mutableList.set(1, "aaaa")
           println("${mutableList[0]} +++ ${mutableList[1]} +++ + ${mutableList[2]}")
        ```
       b. listOf  : 불변 배열( add(), set(), get() 자체를 제공하지 않음.)
       ```kotlin
             val immutableList : List<String> = listOf("hello","world")
             immutableList.add("kim")   // 에러 발생
             println("${immutableList[0]} +++ ${immutableList[1]}")
        ```
    
- arrayOf vs arrayListOf vs listOf 차이점 <br>
    ``` kotlin
      arrayOf : 특정 원소를 담고 있는 배열  (배열의 크기 변경 불가 , 수정 가능)
      arrayListOf : 인자로 받은 자식값을 요소로 하는 arrayList를 반환 (가변 배열.)
      listOf : 포함하는 요소를 읽을수 있고 , 수정 불가. (불변 배열)
    ```
    
- 형변환  :  toXXX()
    ```kotlin
      Ex) val a : Int = 50
          val b : String = a.toString()
    ```
    
- Int형 표현식 : Int형에 _(밑줄)이 들어가는것은 숫자를 좀더 읽기 좋게 하기위한 표현식.
     ```kotlin
       Ex) val a : Int = 100_000_000
    ```
    
- 문자열 표현<br>
    a. 문자열 템플릿 개념으로 문자열 내에 변수의 데이터나 특정 연산식 결과에 의한 데이터를 $기호로 쉽게 포함 가능.<br>
    ```kotlin
	     Ex) val a : Int = 5
          println("a값은 ${a}")  
    ```
    b.  escaped String : ""(큰따옴표)  , raw String :  """(큰따옴표 세개)로 묶어서 표현시 키보드에서 입력한 엔터 등의 값이 문자열 그대로 적용. 
    ```kotlin
	     Ex) val str2 = "test \n Enter" 
		        val str3 = """Hello
                           Wrold"""
    ``` 
    
     
- Class Type별 사용 방법<br>
    a. data class : 데이터만 담기 위한 클래스 (getter/setter를 자동으로 생성해줌)<br>
     ```kotlin
       Ex) data class Test(val a : Int ,var b : Any)
    ```
    b. class :  Property 생성 및 커스텀 가능. 객체의 값을 여러개로 분리


     
 ## 3. Kotlin vs Java
  | | Kotlin | Java    
|:--- |:---|:----
 함수 작성방법 | fun 함수명(변수명 : 변수타입) : 반환값타입 = return 값 |  접근제어자  반환값타입 함수명(변수타입  변수명){ return 값 }
 기초 타입 | X(기초타입 존재 안함. Int,Double 클래스 타입으로 명시) | O(int, double등 기초타입 존재)
final | X(사용안함. 상수변수 선언시 val 사용)  | O(상수변수 선언시 예약어) 
Object타입 | Any | Object  
;(세미콜론 사용여부)| 필수 아님  | 필수
데이터 타입 체크 | is | instanceOf
Directory & package 구조 | -  Class이름이 파일 이름과 달라도 된다.<br>- package 구조는 directory 구조와 동일하지 않아도 된다.<br>(즉, 파일의 위치가 다르더라도 package를 동일하게 선언하면 다른 파일에 선언한 정의 사용 가능. + 다른 패키지도 import하면 접근가능.) | - Class 이름이 java 파일의 이름이 되어야 한다.<br>  - package 구조는 directory 구조와 동일해야한다. 


 
