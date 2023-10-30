package com.javatokotlin.chapter10

class Cat(species: String) : Animal(
    species, LEG_COUNT
) {
    override fun move() {
        println("고양이가 움직인다")
    }

    companion object {
        private const val LEG_COUNT = 4
    }
}