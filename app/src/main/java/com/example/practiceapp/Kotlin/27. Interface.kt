package com.example.practiceapp.Kotlin

// 인터페이스는 기능들을 명세해 놓은 것!
// just showing to others, not implemented yet

// 인터페이스는 생성자가 없다 -> 인스턴스 생성 X -> 설명서 X
// 인터페이스의 내용을 따로 구현해야 한다.

// 상속이 만들어낸 특징
// 1. 자식 클래스는 부모 클래스의 타입
// 2. but 부모 클래스는 자식 클래스의 타입 X

// 인터페이스도 구현된 함수를 포함할 수 있다
// 인터페이스에서 구현된 함수는 구현 클래스에서 구현될 필요가 없다 (이미 구현했으니까)
// abstract 키워드를 앞에 붙일 수도 있다 <- 이때는 반드시 구현해야 한다.

interface Person_ {
    fun eat()
    fun sleep()
}

open class Person() : Person_ { // 생성자가 없으므로 ()가 오면 안 됨
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}

class Student_ : Person_ {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    val student_ : Student_ = Student_()

    student_.eat()
    student_.sleep()
}