package com.example.practiceapp.Kotlin

// 29. Generic
// 목적 : 타입을 체크하는 기능
// 제너릭은 만들기 어렵고 실제로 만들 일이 적기 때문에 사용하는 법만..

fun main(args: Array<String>) {
    // 제너릭을 사용하지 않은 경우 형변환해야 한다.
    val lst1 = listOf(1, 2, 3, "가")
    val b: String = lst1[2].toString() // type casting

    // 제너릭을 사용하는 경우 -> 타입이 안전하다
    val lst2 = listOf<String>("a", "b", "c")
    val c: String = lst2[2]

    // 강한 타입을 체크할 수 있다.
    val lst3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
    //val lst4 = listOf<Int>(1, 2, 3, "가") // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val lst5 = listOf<Any>(1, 2, 3, "가") // -> Any는 기본 타입
    // 부모 : Any
    // 자식 : String, Int, Float
}