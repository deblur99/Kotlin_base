package com.example.practiceapp.Kotlin

class Car(var engine: String, var body: String) {

}

class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class Car1(engine: String, body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

fun main(args: Array<String>) {
    Car("v8 engine", "big")
    SuperCar("neural", "aluminum", "ceramic")
}