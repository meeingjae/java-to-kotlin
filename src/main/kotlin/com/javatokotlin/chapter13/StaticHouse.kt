package com.javatokotlin.chapter13

class StaticHouse(
    val address:String
) {
    class InnerStaticClass(
        val name:String
    ) {
        val address:String = ""
    }
}
