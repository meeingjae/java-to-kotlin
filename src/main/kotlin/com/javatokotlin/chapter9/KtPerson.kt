package com.javatokotlin.chapter9

/**
 * Person1, Person2, Person3 모두 같은 클래스
 */
class KtPerson {
    class Person1 constructor(name: String, age: Int) {
        val name: String = name
        var age: Int = age
    }

    class Person2(name: String, age: Int) {
        val name: String = name
        var age: Int = age
    }

    class Person3(val name: String, var age: Int)
}