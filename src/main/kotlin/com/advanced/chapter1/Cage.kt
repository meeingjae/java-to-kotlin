package com.advanced.chapter1

class Cage {
    val animals:MutableList<Animal> = mutableListOf()

    fun getFirst():Animal? {
        return this.animals.firstOrNull()
    }

    fun put(animal: Animal): Unit {
        this.animals.add(animal)
    }

    fun putAll(cage: Cage) {
        this.animals.addAll(cage.animals)
    }
}

class Cage2<T> {
    val animals:MutableList<T> = mutableListOf()

    fun getFirst():T? {
        return this.animals.firstOrNull()
    }

    fun put(animal: T): Unit {
        this.animals.add(animal)
    }

    fun putAll(cage: Cage2<T>) {
        this.animals.addAll(cage.animals)
    }
}
