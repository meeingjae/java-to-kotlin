package com.javatokotlin.chapter10

class Penguin(species: String) : Animal(
    species, LEG_COUNT
), Swimable, Flyable {

    private val wingCount: Int = WING_COUNT

    override fun move() {
        println("펭귄이 움직인다")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    companion object {
        private const val LEG_COUNT = 2
        private const val WING_COUNT = 2
    }

    override val swim: String
        get() = "수영~~"

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}