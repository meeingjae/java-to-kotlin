package com.javatokotlin.chapter8

class PrintAllUnit {

    fun printAll(vararg strings: String): Unit {
        for (string in strings) {
            println(string)
        }
    }
}