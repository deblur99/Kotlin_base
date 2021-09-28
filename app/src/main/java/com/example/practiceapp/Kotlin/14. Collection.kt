package com.example.practiceapp.Kotlin

// 11. 컬렉션
// 컬렉션은 데이터의 집합
// List, Set, Map으로 구성됨 => Immutable Collection!!

// Mutable Collection
// listOf, setOf, mapOf 앞에 mutable 붙이기

fun main(array: Array<String>) {
// List: 중복 허용
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList.get(1))
    println(numberList[1])

//    Set: 중복 허용 X, 순서 X
    val numberSet = setOf<Int>(1,2,3,3,3)
    numberList.forEach {
        print("$it ")
    }
    println("\n$numberSet")

//  Map: 키-값 쌍 -> <키 자료형, 값 자료형>(키 to 값)
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))

//    Mutable Collection
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3, 4)
    println(mNumberList)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    mNumberMap.put("three", 3)
    println(mNumberMap.get("three"))
}