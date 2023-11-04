package com.javatokotlin.chapter19

import com.javatokotlin.chapter19.a.ImportTest as ImportTestA
import com.javatokotlin.chapter19.b.ImportTest as ImportTestB


typealias FruitFilter = (Fruit) -> Boolean
typealias FruitMap = Map<String, Fruit>

fun main() {
    ImportTestA.printHelloWorld()
    ImportTestB.printHelloWorld()

    val person = Person("abc", 123)
    val (name, age) = person
    val name2 = person.component1()
    val age2 = person.component2()
    println(name == name2 && age == age2)
}

class Fruit(val name: String, val price: Int)

fun isApple(fruits: List<Fruit>, filter: FruitFilter): List<Fruit> {
    return fruits.filter(filter)
}

fun fruitStream(fruits: List<Fruit>): Map<String, Fruit> {
    return fruitNameMap(fruits.associateBy { it.name })
}

fun fruitNameMap(map: FruitMap): Map<String, Fruit> {
    return map
}

data class Person(val name: String, val age: Int)

fun foreachBreak(fruits: List<Fruit>) {
    run {
        fruits.forEach { fruit ->
            if (fruit.name == "사과") return@run
        }
    }
}

fun forEachContinue(fruits: List<Fruit>) {
    fruits.forEach { fruit ->
        if (fruit.name == "사과") return@forEach
    }
}

fun forLabel() {
    abced@ for(i in 0..100)
        for(j in 0..100) {
            if(j==2) break@abced
            println(j)
        }
}
