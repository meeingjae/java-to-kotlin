package com.javatokotlin.chapter9

class KtPersonWithCustomField(name: String, var age: Int) {
    var fieldName = name
        get() = field.uppercase() // field = 예약어, 자기 자신을 의미힌다. (무한 루프 방지), backing field 라고 부른다
        set(value) {
            field = value.uppercase()
        }
}