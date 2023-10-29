package com.javatokotlin.chapter9

class KtPersonWithFactoryConstructor(val name: String, var age: Int) {

    constructor(age: Int) : this("defaultName", age)

    companion object {
        fun personWithDefault(): KtPersonWithFactoryConstructor {
            return KtPersonWithFactoryConstructor(30)
        }
    }
}