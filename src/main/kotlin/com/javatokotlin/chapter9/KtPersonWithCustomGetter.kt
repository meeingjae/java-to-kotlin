package com.javatokotlin.chapter9

class KtPersonWithCustomGetter(val name: String, var age: Int) {

    val nameWithUpperCase: String get() = this.name.uppercase()

    fun isAdult0(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean get() = this.age >= 20

    val isAdult2: Boolean
        get() {
            return this.age >= 20
        }
}