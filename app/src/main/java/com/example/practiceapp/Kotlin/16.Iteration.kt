package com.example.practiceapp.Kotlin

fun main() {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Method 1
    for (item in a) {
        if (item == 5)
            println("item is 5")
        else
            println("item is not 5")
    }
    println()

    // Method 2
    for ((index, item) in a.withIndex()) {
        println("index: $index  value: $item")
        // 문자열 + Int(정수) => 문자열
        // 문자열 + 아무거나 => 문자열
    }
    println()

    // Method 3
    a.forEach {
        print("$it ")
    }
    println()

    // Method 4
    a.forEach { item ->
        print("$item ")
    }
    println()

    // Method 5
    a.forEachIndexed { index, i ->
        println("index: $index  value: $i")
    }
    println()

    // Method 6
    for (i in 0 until a.size) // size 전까지 반복
        print("$i ")
    println()

    // Method 7
    for (i in 0 until a.size step (2)) {  // 파이썬에서 for (i in range(len(i), 2))
        print("${a.get(i)} ")
    }
    println()

    // Method 8
    for (i in a.size - 1 downTo 0)
        print("${a.get(i)} ")
    println()

    // Method 8
    for (i in a.size - 1 downTo 0 step(2))
        print("${a.get(i)} ")
    println()

    // Method 9
    for (i in 0..10) { // = i in 0 until 10
        print("$i ")
    }
    println()
}