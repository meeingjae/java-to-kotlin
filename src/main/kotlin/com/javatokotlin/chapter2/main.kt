package com.javatokotlin.chapter2

fun main() {
    val abc: String = "ABC"
    startWith0(abc)
    startWith1(abc)
    startWith11(abc)
    startWith2(abc)
    startWith22(abc)
    startWith3(abc)
    startWith33(abc)
    startWith4(abc)
    startWith5(abc)

    val person: Person = Person("notnullName", null)

//    startWith0(person.getNullableName()) // nullable 한 것을 이해한다
    startWith0(person.getNotNullName())

    val nullable: String? = null
//    nullable.length // nullable하기에 불가능
    nullable?.length // 해당 변수가 null이 아니면 해당 코드 실행, null이면 해당 코드 전체가 null이 된다
    nullable?.length ?: 3 // 해당 변수가 null이 아니면 해당 코드 실행, null이면 해닽 코드의 값이 3이 된다, 엘비스 연산자라고 부름
}

fun startWith0(str: String): Boolean { // str이 null이 아니기에 바로 함수 호출 가능
    return str.startsWith("A")
}

fun startWith1(str: String?): Boolean { //nullable
    if (str == null) {
        throw IllegalArgumentException("null입니다")
    }

    return str.startsWith("A")
}

fun startWith11(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null입니다")
}

fun startWith2(str: String?): Boolean? { // nullable
    if (str == null) {
        return str
    }
    return str.startsWith("A")
}

fun startWith22(str: String?): Boolean? {
    return str?.startsWith("A") // safe Call은 null이면 그 결과 자체가 null이 된다
}

fun startWith3(str: String?): Boolean { // 리턴 값 not null
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startWith33(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith4(str: String?): Boolean {
    str?.startsWith("A") ?: return false
    return true
}

fun startWith5(str: String?): Boolean {
    return str!!.startsWith("A") //nullable 이지만 절대 null이 아님을 컴파일러에게 알려준다, null이 들어오면 NPE 뜬다
}
