package com.advanced.chapter11

fun main() {

    val greenApple: GreenApple = GreenApple(Apple())

    println("${greenApple.name} + ${greenApple.color}")
    greenApple.bite()
}

interface Fruit {
    val name: String
    val color: String
    fun bite() {
        println("아삭 아삭")
    }
}

class Apple : Fruit {
    override val name: String
        get() = "사과"
    override val color: String
        get() = "붉은색"

    override fun bite() {
        println("사과 아삭아삭")
    }
}

class GreenApple(val apple: Apple) : Fruit by apple {
    override val color: String
        get() = "초록색"
}
