package com.javatokotlin.chapter17

fun main() {

    val fruit = Fruit("사과", 1_000)

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean { return fruit.name == "사과" }
    val isAppleLambda: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    val isAppleRes: Boolean = isApple(fruit)
    val isAppleLambdaRes = isAppleLambda(fruit)
    val isAppleLambdaRes2 = isAppleLambda.invoke(fruit)

    val fruitResult: Boolean = isFruit(fruit, isAppleLambda)
    val fruitResult2 = isFruit(fruit) { it.name == "사과" }

}

fun isFruit(fruit: Fruit, filter: (fruit: Fruit) -> Boolean): Boolean {
    return if (filter.invoke(fruit)) true
    else false
}
