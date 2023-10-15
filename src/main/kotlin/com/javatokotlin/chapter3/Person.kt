package com.javatokotlin.chapter3

class Person {
    var age = 0
        private set
    var name: String? = null
        private set

    constructor()
    constructor(age: Int, name: String?) {
        this.age = age
        this.name = name
    }

    fun printName() {
        println("제 이름은 ${name} 입니다")
    }
}
