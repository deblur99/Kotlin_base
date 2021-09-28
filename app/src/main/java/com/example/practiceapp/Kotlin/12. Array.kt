package com.example.practiceapp.Kotlin

// 12. 배열 선언하기
// arrayOf(요소) or arrayOf<요소의 자료형>(요소)
// 배열 연산자들
// set - 요소 값 변경
// get - 요소 값 가져오기
// size - 배열 크기 가져오기

// 주의사항
// 1. 인덱스 범위를 벗어나지 않도록 주의한다.
// 2. 배열 요소의 자료형을 가급적 명시하라. <> or intArray 등

fun main(array: Array<String>) {
//  배열 생성하기 1
    var number: Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

//  배열 생성하기 2
    var group2 = intArrayOf(1, 2, 3, 4, 5)
    for (e in group2) {
        print("$e ")
    }
    println()

//  배열 생성하기 3
    var group3 = arrayOf(1, 2, 3.5, "Hello")

    println("${group3.get(2)} ${group3.size}")
}