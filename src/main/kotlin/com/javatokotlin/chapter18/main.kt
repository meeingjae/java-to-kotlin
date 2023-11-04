package com.javatokotlin.chapter18

fun main() {

}

class Fruit(val id: Int = 1, val name: String, val price: Int = 1_000)

fun fruitFilter(fruits: List<Fruit>, filter: (Fruit) -> Boolean): Boolean? {
    return fruits.filter(filter)
        .filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruite ->
            println("$idx + $fruite")
            Fruit(name = fruite.name)
        }
        .sortedBy { fruit -> fruit.name }
        .sortedByDescending { fruit -> fruit.price }
        .distinctBy { fruit -> fruit.name }
        .mapNotNull(filter)
        .lastOrNull()
}

fun fruitGroup(fruits: List<Fruit>): Map<String, List<Fruit>> {
    return fruits.groupBy { fruit -> fruit.name }
}

// key = 가격, value = List<이름>
fun fruitGroupByPriceAndName(fruits: List<Fruit>): Map<Int, List<String>> {
    return fruits.groupBy({ fruit -> fruit.price }, { fruit: Fruit -> fruit.name })
}

fun fruitGroupWithId(fruits: List<Fruit>): Map<Int, Fruit> {
    return fruits.associateBy { fruit -> fruit.id }
}

fun groupBy(fruits: List<Fruit>): List<String> {
    return fruits.groupBy { fruit -> fruit.name }
        .map { (key, value) ->
            println(value)
            key
        }
}

fun flatMapFruit(fruits: List<List<Fruit>>): List<Fruit> {
    return fruits.flatMap { fruitList -> fruitList.filter { fruit: Fruit -> fruit.name == "사과" } }
}

fun flattenFruit(fruits: List<List<Fruit>>): List<Fruit> {
    return fruits.flatten()
}
