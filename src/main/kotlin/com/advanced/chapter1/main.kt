package com.advanced.chapter1

fun main() {
    val cage = Cage()
    cage.put(GoldFish("골드피쉬"))
    val godFish: GoldFish = cage.getFirst() as? GoldFish ?: throw IllegalArgumentException("")

    val cage2 = Cage2<GoldFish>()
//    cage2.put(RedFish("레드피쉬")) // error
    cage2.put(GoldFish("골드피쉬"))
    val goldFish = cage2.getFirst()
}
