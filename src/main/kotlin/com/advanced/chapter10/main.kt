package com.advanced.chapter10

import kotlin.properties.Delegates

fun main() {
    val map:Map<String,Int> = mapOf("abc" to 123 , "bcd" to 234)
    val abc:Int by map
    println(abc)
}

class Person {
    var name: Int by Delegates.notNull<Int>()
    var newName: Int by this::name
    var address: String by Delegates.observable("초기화 주소입니다") { _, old, new ->
        println("기존 값 : ${old}, 변경 값 : ${new}")
    }
    var addressBoolean: String by Delegates.vetoable("초기 주소") { _, old, new ->
        old == new
    }
}
