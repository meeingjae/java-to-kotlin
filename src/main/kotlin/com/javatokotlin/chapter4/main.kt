package com.javatokotlin.chapter4

fun main() {
    val money1 = KotlinMoney(1_000L)
    val money2 = KotlinMoney(2_000L)
    val money3 = KotlinMoney(1_000L)
    val money11 = money1

    println(money1 + money2)
    println(money2 - money1)

    println(money1 === money11)
    println(money1 == money3)
}
