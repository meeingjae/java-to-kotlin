package com.javatokotlin.chapter9

class KtPersonWithSecondConstructor(val name: String, var age: Int) {
    constructor(name: String) : this(name, 1)
}