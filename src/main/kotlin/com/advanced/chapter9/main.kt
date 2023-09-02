package com.advanced.chapter9

import kotlin.reflect.KProperty

fun main() {
    val person9: Person9 = Person9()
        .also { println("인스턴스화 완료") }

    println(person9.name)
}

class Person9 {
    var name: String by LazyInitProperty {
        Thread.sleep(2000)
        "김밍재"
    }
}


class LazyInitProperty<T>(val init: () -> T) {
    private var _value: T? = null
    private val value: T
        get() {
            if (_value == null) {
                _value = init()
            }
            return _value!!
        }

    operator fun getValue(refClass: Any, property: KProperty<*>): T {
        return value
    }

    operator fun setValue(refClass: Any, property: KProperty<*>, s: T) {
        this._value = s
    }
}
