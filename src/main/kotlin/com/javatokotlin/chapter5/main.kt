package com.javatokotlin.chapter5

fun main() {
    val num: Int = 30 + 40 // statement 면서 expression 이다
    val stringObj: String = "hi"
    println(startWithAWithString(stringObj))
}

fun startWithAWithString(obj: Any): Boolean {
    return when (obj) {
        is String -> true
        else -> false
    }
}

fun isEvenNumber(num: Int): Boolean {
    return when {
        num % 2 == 0 -> true
        else -> false
    }
}

fun judgeNumber(num: Int): Unit {
    when (num) {
        1, 2, 3 -> println("1,2,3 숫자입니다")
        else -> println("1,2,3이 아닌 숫자입니다")
    }
}

fun isPositiveInteger(num: Int): Unit {
    if (num < 0) {
        throw IllegalArgumentException("num은 0보다 작을 수 없다")
    }
}

fun getPassOrFail(num: Int): String {
    return if (num >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 1..3 -> "A"
        4 -> "B"
        in 5..9 -> "C"
        else -> "D"
    }
}
