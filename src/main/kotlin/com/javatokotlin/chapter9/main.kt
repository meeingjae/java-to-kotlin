package com.javatokotlin.chapter9

fun main() {
    val ktPersonWithFactoryConstructor: KtPersonWithFactoryConstructor =
        KtPersonWithFactoryConstructor.personWithDefault()
    println("${ktPersonWithFactoryConstructor.name} ${ktPersonWithFactoryConstructor.age}")

    val ktPersonWithCustomGetter: KtPersonWithCustomGetter = KtPersonWithCustomGetter("abc", 123)
    println(ktPersonWithCustomGetter.isAdult)
    println(ktPersonWithCustomGetter.isAdult2)
    println(ktPersonWithCustomGetter.nameWithUpperCase)

    val ktPersonWithCustomField: KtPersonWithCustomField = KtPersonWithCustomField("name", 123)
    println(ktPersonWithCustomField.fieldName)
}