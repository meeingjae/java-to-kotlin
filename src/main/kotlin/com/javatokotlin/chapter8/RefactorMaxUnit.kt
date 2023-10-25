package com.javatokotlin.chapter8

class RefactorMaxUnit {

    fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun max2(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }

    fun max3(a: Int, b: Int): Int =
        if (a > b) {
            a
        } else {
            b
        }

    fun max4(a: Int, b: Int) =
        if (a > b) {
            a
        } else {
            b
        }

    fun max5(a: Int, b:Int) = if(a>b) {a} else {b}

    fun max6(a: Int, b:Int) = if(a>b) a else b
}