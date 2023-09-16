package com.javatokotlin.chapter3

fun main() {

    // Kotlin은 명시적 캐스팅이 필요하다
    var number1 = 1
    val number2: Long = number1.toLong()

    convert(Person(123, "mingjae"))
    printName(Person(123, "name"))

    val multiLine: String = """
        this is minjae
        minjae is good man
        hi ~
        my number is ${number1}
    """.trimIndent()

    println(multiLine)

    val chatT: Char = multiLine[1]
    val chatH: Char = multiLine[2]
}

fun printName(obj: Any?) {
// ${변수} 키워드로 사용 가능
    if (obj is Person) {
        println("${obj.name}")
    }
}

fun convert(obj: Any?) {
    // is 키워드 사용 가능.
    if (obj is Person) {
        obj.age
        obj.name
    }
    // is 키워드 앞에는 ! 키워드 사용 가능
    if (obj !is Person) {
        throw IllegalArgumentException("Person이 아닙니다")
    }

    // as 키워드로 인스턴스 캐스팅 가능
    // as? 키워드를 사용하면 Safe Call로 사용 가능하다. as? 키워드 사용시 아닐 경우 null이므로, 엘비스 연산자를 사용할 수 있다
    val person = obj as? Person ?: Person(111, "default name")
    println(person.name)
}
