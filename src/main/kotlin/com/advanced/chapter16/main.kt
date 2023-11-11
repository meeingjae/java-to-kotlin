package com.advanced.chapter16

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun main() {
    overrideLambdaWithObject()
    val stringUtils15: StringUtils15 = StringUtils15 { str -> str.uppercase().startsWith("A") }
    consumeStringUtil(stringUtils15)
    consumeStringUtil { str -> str.uppercase().startsWith("A") }

    //호출 가능 참조
    val addReference = ::add
    println(addReference)

    val p1 = Person16("name")
    val p1NameGetter = p1::name.getter // 바인딩 된 호출 가능 참조

}

fun overrideLambdaWithObject() {
    val stringUtils15: StringUtils15 = object : StringUtils15 {
        override fun predicate(str: String): Boolean {
            return str.uppercase().startsWith("A")
        }
    }
    stringUtils15.predicate("abc")
}

fun interface StringUtils15 {
    abstract fun predicate(str: String): Boolean
}

fun consumeStringUtil(stringUtils15: StringUtils15) {}

class Person16(val name:String)
