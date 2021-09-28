package com.example.practiceapp.Kotlin

fun main() {
    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0,3)
    println(a)
    a.set(0,200)
    println(a)
    a.removeAt(4)
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    b.add(2)
    println(b)

    val c = mutableMapOf<String,Int>("one" to 10, "two" to 20)
    println()
    println(c)
    c.put("ten", 100)
    println(c)
    c.remove("one")
    println(c)
    c.clear()
    println(c)
}