package com.advanced.chapter14

fun main() {
    println(operation(123, 456, plusOperation()))

    val a = 1
    val b = 2L
    val add = fun Int.(other: Long) : Int = this + other.toInt()
    add(a,b)
    a.add(b)
    add.invoke(a,b)
}

fun operation(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun plusOperation(): (Int, Int) -> Int {
    return { a, b -> a + b }
}


