package com.advanced.chapter17

import java.time.LocalDate

fun main() {
    println(Point(10, -20).zeroPointSymmetry())
    println(-Point(10, -20))
    var point = Point(10, 20)
    println(++point)

    println(LocalDate.of(20203, 1, 1).plusDays(3))
    println(LocalDate.of(20203, 1, 1) + Days(3))
    println(LocalDate.of(20203, 1, 1) + 3.d + 3.m + 4.y)
}

data class Point(
    val x: Int,
    val y: Int,
) {
    fun zeroPointSymmetry(): Point {
        return Point(-x, -y)
    }

    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }

    operator fun inc(): Point {
        return Point(x + 1, y + 1)
    }
}

data class Days(
    val day: Long
)

data class Months(
    val month: Long
)

data class Years(
    val year: Long
)

operator fun LocalDate.plus(days: Days): LocalDate {
    return this.plusDays(days.day)
}

operator fun LocalDate.plus(months: Months): LocalDate {
    return this.plusMonths(months.month)
}

operator fun LocalDate.plus(years: Years): LocalDate {
    return this.plusYears(years.year)
}

val Int.d: Days
    get() = Days(this.toLong())

val Int.m: Months
    get() = Months(this.toLong())

val Int.y: Years
    get() = Years(this.toLong())
