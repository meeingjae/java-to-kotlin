package com.javatokotlin.chapter8

import com.javatokotlin.chapter8.PrintAllUnit
import com.javatokotlin.chapter8.RepeatUnit

fun main() {

    val repeatUnit: RepeatUnit = RepeatUnit()

    repeatUnit.repeat("abc", 3, true)
    repeatUnit.repeat2("abcde")
    repeatUnit.repeat2(str = "abc", withNewLine = false)

    val printAllUnit: PrintAllUnit = PrintAllUnit()

    printAllUnit.printAll("a", "b", "c")
    printAllUnit.printAll(*arrayOf("a", "b", "c"))
}