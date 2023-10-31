package com.javatokotlin.chapter13

class House(
    val address: String
) {
    inner class InnerHouse(
        val name: String
    ) {
        val address: String
            get() = this@House.address
    }
}
