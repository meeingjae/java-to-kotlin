package com.javatokotlin.chapter16

fun main() {
    val s = "abc"
    s.newToString(src = "hahaha")

    val i: Int = 13
    println(i add2 200)

    println(i.add3(300))
}

fun String.newToString(src: String) {
    this.plus(src)
    println(this)
}

infix fun Int.add2(other:Int) : Int {
    return this.plus(other)
}

inline fun Int.add3(other: Int) : Int {
    return this add2 other
}
