package com.advanced.chapter4

fun main() {
    val animalCage: Cage<Animal> = Cage<Animal>()
    val fishCage: Cage2<Fish> = Cage2<Fish>()
}

abstract class Animal(val name: String)
class Fish(name: String) : Animal(name)

class Cage<out T> {
    val list: MutableList<@UnsafeVariance T> = mutableListOf()

    fun getFirst(): T {
        return this.list.first()
    }

    fun getAll(): List<T> {
        return this.list
    }
}

class Cage2<in T> {
    val list: MutableList<@UnsafeVariance T> = mutableListOf()

    fun put(other: T) {
        this.list.add(other)
    }

    fun putAll(other: List<T>) {
        this.list.addAll(other)
    }
}
