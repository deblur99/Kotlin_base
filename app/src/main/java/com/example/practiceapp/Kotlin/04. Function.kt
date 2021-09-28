package com.example.practiceapp.Kotlin

// 함수 선언하기
// fun 함수명(인자명: 인자 자료형) : 반환형 {}

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기 - 자료형 = 어떤 값 식으로 변수 선언하듯
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int = 5): Unit {
    val result: Int = first + second
    println(result)
}

// 간단한 함수 선언 (콜백함수 용도?) -> = first + second면 계산결과 반환
fun plusShort(first: Int, second: Int) = first + second

// 가변인자 함수 선언 - 개수 무관하게 받음
fun plusVar(vararg numbers: Int): Int {
    var result = 0;

    for (number in numbers) {
        result += number
    }

    return result;
}

fun main(array: Array<String>) {
    // 함수 호출하는 방법
    val result: Int = plus(5, 10)
    println(result)

    // 함수 인자를 명시하여 호출하는 방법
    val result2 = plus(second = 20, first = 30)
    println(result2)

    // 디폴트 값을 갖는 함수 호출하기
    val result3 = plusFive(10, 20)
    println(result3)

    val result4 = plusFive(10)
    println(result4)

    printPlus(20)

    val result5 = plusShort(20, 25)
    println(result5)

    val result6 = plusVar(10, 20, 30, 40, 50, 60, 70)
    println(result6)
}