package com.example.practiceapp.Kotlin

// 02. 자료형
// 정수형 - Long > Int > Short > Byte
// 실수형 - Double > Float
// 문자 - Char
// 문자열 - String
// 부울형 - True, False
// 어떤 자료형을 명시해서 변수를 선언하는 경우, 해당 자료형만 할당할 수 있다.

// 변수 선언 방법 1
// 원래 알던거

// 변수 선언 방법 2
// var/val 변수 : 자료형 = 값 (자료형은 제너릭 자료형으로 해야 한다)

fun main(args: Array<String?>) {
    var foo : Int = 10;
    var bar : String = "Hello";

    println(foo); println(bar);
}