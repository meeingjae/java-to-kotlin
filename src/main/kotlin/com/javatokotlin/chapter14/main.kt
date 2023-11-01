package com.javatokotlin.chapter14

fun main() {
    val kDataClass: KDataClass = KDataClass("myname")
    val kDataClass2: KDataClass = KDataClass("myname")
    println(kDataClass)
    println(kDataClass == kDataClass2)
    nationWhen(Nation.KOREA)
    bmwFunc(Series5())
}

fun nationWhen(nation: Nation) {
    when (nation) {
        Nation.KOREA -> println("Korea")
        Nation.AMERICA -> println("USA")
    }
}

fun bmwFunc(bmw: BMW) {
    when (bmw) {
        is Series3 -> println("3시리즈여~")
        is Series5 -> println("5시리즈여~~")
    }
}
