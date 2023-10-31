package com.javatokotlin.chapter12

fun main() {

    Person.Factory.newBaby("신생아 이름")
    Person.newBaby("신생아 이름")
    println(PersonSingleTon.age)
    PersonSingleTon.age += 100
    println(PersonSingleTon.age)

    moveSomething(object : Movable {
        override fun move() {
            println("익명 클래스로 움직여요~")
        }

        override fun fly() {
            println("익명 클래스로 날아요~")
        }

    })
}

fun moveSomething(movable: Movable) {
    movable.move()
    println("지금은 moveSomething 함수 내부에요~")
    movable.fly()
}
