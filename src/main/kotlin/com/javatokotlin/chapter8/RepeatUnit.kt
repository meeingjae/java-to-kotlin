package com.javatokotlin.chapter8

class RepeatUnit {

    fun repeat(str:String, num: Int, withNewLine:Boolean): Unit {
        for (i in 0..num) {
            if(withNewLine) {
                println(str)
            } else {
                print(str)
            }
        }
    }

    fun repeat2(str:String, num: Int = 3, withNewLine:Boolean = true): Unit {
        for (i in 0..num) {
            if(withNewLine) {
                println(str)
            } else {
                print(str)
            }
        }
    }
}