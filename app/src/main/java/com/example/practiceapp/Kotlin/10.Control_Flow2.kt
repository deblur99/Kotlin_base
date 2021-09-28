package com.example.practiceapp.Kotlin

// 10. 제어흐름
// when 문 : switch 문과 유사!
// 사용법 : when (변수) {값1 -> {} 식2 -> {}}

fun main(args: Array<String>) {
    val value: Int = 1

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        4 -> {
            println("value is 4")
        }
        5 -> {
            println("value is 5")
        }
        else -> {
            println("IDK")
        }
    }
}