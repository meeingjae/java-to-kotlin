package com.advanced.chapter5

fun main() {

    val cage = Cage5<Fish>(mutableListOf(Fish("hihi"),Fish("hinamamamma")))

    val list:List<Fish> = mutableListOf(Fish("asd"), Fish("bcd"))
    val list2:List<Fish> = mutableListOf(Fish("123"),Fish("456"))
    list.hasInterSect(list2)
}

abstract class Animal(val name: String)
class Fish(name: String) : Animal(name), Comparable<Fish> {
    override fun compareTo(other: Fish): Int {
        return this.compareTo(other)
    }

}

class Cage5<T>(
    val list: MutableList<T> = mutableListOf()
) where T : Animal, T : Comparable<T> {

    fun printNameAfterSorting() {
        this.list.sorted()
            .map { it.name }
            .let { println(it) }
    }
}

fun <T> List<T>.hasInterSect(other: List<T>) : Boolean {
    return (this intersect other).isNotEmpty()
}
