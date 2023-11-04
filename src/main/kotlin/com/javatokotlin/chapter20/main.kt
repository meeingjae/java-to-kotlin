package com.javatokotlin.chapter20


fun main() {

}

class Fruit(var name: String, val price: Int = 1_000)

fun nonNullSetApple(fruit: Fruit?): Fruit {
    return fruit?.let {
        it.name = "Apple"
        it
    } ?: Fruit("abc")
}

fun nonNullName(fruit: Fruit?): String {
    return fruit?.let {
        it.name + "hi"
    } ?: "null"
}

fun fruitApply(fruit: Fruit): Fruit {
    return fruit.apply { name == "ming" }
}

fun withFruit(fruit: Fruit) {
    with(fruit) {
        println(this.name)
        println(price)
    }
}
