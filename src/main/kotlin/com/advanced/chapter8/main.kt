package com.advanced.chapter8

fun main() {

    val person = Person8()
    val person2 = Person8()
    person.name = "abc"
    println(person.getName())
//    println(person2.getName()) // error - name 프로퍼티 초기화 필요
}

class Person8 {
    lateinit var name: String

    fun getName(): String {
        return this.name
    }
}

class Person82 {
    private var _name:String? = null
    val name:String
        get() {
            //이전에 초기화가 한번 수행되었다면 해당 if문을 스킵한다
            if(_name == null) {
                //비용이 큰 특정 로직
                Thread.sleep(2000)
                this._name = "초기화 데이터"
            }
            // 초기화가 끝난 로직은 not null로 호출된다
            return _name!!
        }

    val lazyName:String by lazy {
        Thread.sleep(2000)
        "초기화 데이터"
    }
}
