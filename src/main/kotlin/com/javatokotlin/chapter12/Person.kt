package com.javatokotlin.chapter12

class Person private constructor(
    name: String,
    age: Int
) {
    companion object Factory : Log {
        const val MIN_AGE: Int = 1
        @JvmStatic
        fun newBaby(name: String): Person {
            debug()
            return Person(name, MIN_AGE)
        }

        override fun debug() {
            println("신생아 탄생이요~")
        }
    }
}

object PersonSingleTon {
    var age:Int = 3
}
