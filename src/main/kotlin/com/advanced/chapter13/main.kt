package com.advanced.chapter13

fun main() {

    operate(3, 6, fun(a, b) = a + b)
    operate(3, 6, fun(a, b): Int { return a + b })
    operate(3, 6) { a, b -> a + b }

    operateFun(3, 6, '+')
    operEnumFun(3, 6, Operator.PLUS)
}

fun operateFun(num1: Int, num2: Int, operator: Char): Any {
    return when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> {
            throw IllegalArgumentException("연산자 입력 오류")
        }
    }
}

fun operEnumFun(num1: Int, num2: Int, operator: Operator) = operator.operateFun(num1, num2)

fun operate(num1: Int, num2: Int, operator: (Int, Int) -> Int): Int {
    return operator(num1, num2)
}

enum class Operator(
    val operName: Char,
    open val operateFun: (Int, Int) -> Int
) {
    PLUS('+', fun(a, b) = a + b),
    MINUS('-', { a, b -> a - b }),
    MUL('-', fun(a, b): Int { return a * b }),
    DIV('/', { a, b -> a / b })
}
