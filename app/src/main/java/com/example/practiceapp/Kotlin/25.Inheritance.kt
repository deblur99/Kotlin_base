package com.example.practiceapp.Kotlin

// 25. 상속
// 두 번 똑같이 쓰는것까진 OK
// 두 번 초과할때부턴 상속 꼭 쓰기

var number: Int = 10

// class는 기본적으로 private이 접근 제어자
// 따라서 외부에서 상속을 위해 접근하려면, open 키워드를 앞에 명시해야 한다.
open class Car100() {
    open fun drive(): String {
        return "Running"
    }

    fun stop() {

    }
}

// 상속받기 : 부모클래스를 위임생성자 호출하는 식으로 해야 한다.
class SuperCar100() : Car100() {
    // 부모 클래스의 메서드 오버라이딩 : override fun 함수명()
    // 부모 클래스의 메서드 호출하기 : super.함수명()
    override fun drive(): String {
        val run = super.drive()
        return "$run quickly"
    }
}

class Bus100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "$run slowly"
    }
}

fun main(args: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

    val bus100: Bus100 = Bus100()
    println(bus100.drive())
}