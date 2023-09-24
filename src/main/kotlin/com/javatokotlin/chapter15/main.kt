package com.javatokotlin.chapter15

fun main() {
    printArray()
    printArray2()

    val list = emptyList<String>()
    val list2 = emptyList<Int>()
    printNumbers(emptyList()) // 타입 추론 가능
    printList()
    printMap()
}

fun printArray() {
    val array = arrayOf(100, 200)
    for (i in array.indices) {
        println("$i , ${array[i]}")
    }
}

fun printArray2() {
    val array = arrayOf(100, 200)
    array.plus(300)
    for ((i, value) in array.withIndex()) {
        println("$i , $value")
    }
}

fun printNumbers(list: List<Int>) {

}

fun printList() {
    val list = arrayListOf(1, 2, 3)
    for ((idx, value) in list.withIndex()) {
        println("$idx + $value")
    }
}

fun printSet() {
    val set = setOf(1, 2, 3)
    for ((idx, value) in set.withIndex()) {
        println("$idx + $value")
    }
}

fun printMap() {
    val map = mutableMapOf<Int, String>()
    map[1] = "abc"
    map[100] = "bcd"

    for ((key, value) in map.entries) {
        println("$key + $value")
    }

    val map2 = mapOf(1 to "abc", 100 to "aassdd")
    for ((key, value) in map2.entries) {
        println("$key + $value")
    }
}
