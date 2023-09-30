package com.javatokotlin.chapter1

fun main() {
    var number1: Long = 10L // 가변
    number1 = 5L
    println(number1)

    val number2: Long = 10L // 불변
    // number2 = 5 // 불가
    println(number2)

    val number3: Long
    number3 = 5L // 한번에 한해서 초기화 가능

    var number4: Long? = 1_000L // nullable은 ? 키워드
    number4 = null

    var person = Person("밍재")
    person.printName()
}

class Person(s: String) {
    var name : String = s
    fun printName() {
        println(name)
    }
}
