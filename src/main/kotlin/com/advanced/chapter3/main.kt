package com.advanced.chapter3

fun main() {

    val cage: Cage<Fish> = Cage<Fish>()
    val gCage: Cage<GoldFish> = Cage<GoldFish>()

    // 공변성
    // 자식객체의 데이터를 받아 사용할 수 있다.
    // 자식 객체는 데이터 생산자 역할만 할 수 있다
    cage.moveFrom(gCage)
    // 반 공변성
    // 부모 객체의 데이터를 받아 해당 부모 데이터에 내 데이터를 넣을 수 있다
    // 내가 생산자 역할이고, 파라미터의 부모 데이터는 내 데이터를 소비하는 소비자 역할이다
    gCage.moveTo(cage)
}

abstract class Fish(val name: String)
class GoldFish(name: String) : Fish(name)
class RedFish(name: String) : Fish(name)

class Cage<T> {
    val list: MutableList<T> = mutableListOf()

    fun moveFrom(other: Cage<out T>) {
        this.list.addAll(other.list)
    }

    fun moveTo(other: Cage<in T>) {
        other.list.addAll(this.list)
    }
}
