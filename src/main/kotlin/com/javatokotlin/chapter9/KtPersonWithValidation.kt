package com.javatokotlin.chapter9

class KtPersonWithValidation(val name: String, var age: Int) {
    init {
        if (age < 0) throw IllegalArgumentException("age는 0보다 작을 수 없습니다. input:${age}")
    }
}