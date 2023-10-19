package com.javatokotlin.chapter7

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    println(parseIntOrThrow("5"))
    println(parseIntOrNull("a"))
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str} 은 숫자가 아닙니다")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

class FilePrinter {

    fun readFile() {
        val currentFile = File("")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // try with resources - ㅕㄴㄷ
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
