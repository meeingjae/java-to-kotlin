package com.javatokotlin.chapter10

fun main() {

    Derived(200)
}

open class Base(open val num: Int = 100) {

    init {
        println(num) // 자식 클래스의 num을 호출하는데, 부모 클래스가 먼저 init 되기에 num 필드는 값이 기본 값(0) 이다
        println("Base Init")
    }
}

class Derived(override val num: Int = 300) : Base(num) {

    init {
        println("derived")
    }
}