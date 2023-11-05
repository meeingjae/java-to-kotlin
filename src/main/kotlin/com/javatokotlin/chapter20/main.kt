package com.javatokotlin.chapter20


fun main() {
    letWithChain(listOf(Fruit("aaaa"), Fruit("bbbbb")))

    val person: Person = Person(name = "abc", age = 1232).apply {
        address = "songpagu"
        mobile = "010-1234-5678"
        sex = "FEMALE"
    }

    val fruitDto = with(Fruit("사과 {")) {
        FruitDto(this.name, this.price)
    }
}

class Fruit(var name: String, val price: Int = 1_000)

class FruitDto(val name: String, val price: Int)

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

fun letWithChain(fruits: List<Fruit>) {
    fruits.map { it.name.length }
        .filter { it > 3 }
        .let(::println)
}

fun letTemp(fruits: List<Fruit>): List<Fruit> {
    return fruits.filter { f ->
        f.let {
            if (it.name.length > 3) it.name else ""
        }.uppercase().length > 4
    }
}

fun alsoNums() {
    val nums = arrayListOf(1, 2, 3)
    nums.also { println(it + 1) }
        .add(4)
}

fun applyNums() {
    val nums = mutableListOf(1, 2, 3)
    nums.apply { println(this + 1) }
        .add(4)
}

class Person(
    var name: String = "abc",
    var age: Int = 123,
    var address: String = "abc",
    var mobile: String = "010-0000-0000",
    var sex: String = "MALE"
) {
    fun createPerson(name: String, age: Int, address: String): Person {
        return Person(name = name, age = age)
            .apply { this.address = address }
    }
}
