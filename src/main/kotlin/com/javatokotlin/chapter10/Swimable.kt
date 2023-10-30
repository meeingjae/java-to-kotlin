package com.javatokotlin.chapter10

interface Swimable {

    val swim: String

    fun act() {
        println(swim + "예아~~")
        println("수영 수영")
    }
}