package com.advanced.chapter7

fun main() {

}

abstract class Fish(val name: String)
class GoldFish(name: String) : Fish(name)

open class Cage7<T : Fish> {
    open fun printFish(t: T) {

    }
}

/**
 * 제네릭 상속. 함수 override 시 <T>로 자동 생성
 */
class Cage7Sub<T : Fish> : Cage7<T>() {

    override fun printFish(t: T) {
        super.printFish(t)
    }
}

/**
 * Generic을 명시적으로 상속. 함수 override 시 명시적인 타입으로 자동 생성
 */
class Cage7Concrete : Cage7<GoldFish>() {
    override fun printFish(t: GoldFish) {
        super.printFish(t)
    }
}
