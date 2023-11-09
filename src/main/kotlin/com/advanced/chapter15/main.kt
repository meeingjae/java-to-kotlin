package com.advanced.chapter15

fun main() {
    test(3) { println("hello") }

    iterate15(listOf(1, 2, 3, 4, 5)) { num ->
        if (num == 3) {
            return //비지역적 리턴
            // 원래 람다식에선 리턴을 사용할 수 없지만, inline 함수로 선언한 람다 구현체에선 비지역적 리턴을 사용할 수 있다
        }
    }

    iterate152(listOf(1, 2, 3, 4, 5)) { num ->
        if (num == 3) {
//            return //비지역적 리턴 불가능 (crossinline 키워드 떄문)
            // 원래 람다식에선 리턴을 사용할 수 없지만, inline 함수로 선언한 람다 구현체에선 비지역적 리턴을 사용할 수 있다
        }
    }

    val person: Person15 = Person15("name")
    println(person.upperName)
}

inline fun test(times: Int, noinline exec: () -> Unit) {
    for (i in 1..times) {
        exec()
    }
}

inline fun iterate15(nums: List<Int>, exec: (Int) -> Unit) {
    for (num in nums) {
        exec(num)

    }
}

inline fun iterate152(nums: List<Int>, crossinline exec: (Int) -> Unit) {
    for (num in nums) {
        exec(num)

    }
}

class Person15(val name: String) {
    inline val upperName: String
        get() = this.name.uppercase()
}
