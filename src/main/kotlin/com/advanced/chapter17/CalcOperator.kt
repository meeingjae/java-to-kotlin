package com.advanced.chapter17

enum class CalcOperator(
    val operatorName: Char,
    open val operateFun: (Int, Int) -> Int
) {
    PLUS('+', fun(a, b) = a + b),
    MINUS('-', { a, b -> a - b }),
    MUL('-', fun(a, b): Int { return a * b }),
    DIV('/', { a, b -> a / b });

    operator fun invoke(num1: Int, num2: Int): Int {
        return operateFun(num1, num2)
    }
}

fun operateWithNums(num1: Int, num2: Int, calcOperator: CalcOperator) = calcOperator.operateFun(num1, num2)
fun operateWithNumsInvoke(num1: Int, num2: Int, calcOperator: CalcOperator) = calcOperator(num1, num2)

fun main() {
    println(operateWithNums(1, 2, CalcOperator.PLUS))
    println(operateWithNumsInvoke(1, 2, CalcOperator.PLUS))
}
