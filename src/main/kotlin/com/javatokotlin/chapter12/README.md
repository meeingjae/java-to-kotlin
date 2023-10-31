### Tips

* 정적 타입
    * Kotlin에서 `static` 변수 및 함수를 선언하고자 하면, `companion object` 키워드를 사용해야 한다
        * `companion object` 내에서 `const` 키워드를 붙히면 컴파일 시점에 값이 할당 된다. (`const` 키워드가 없으면 runtime)
        * `companion object` 는 하나의 객체로 간주되기에 이름을 붙힐 수도 있고, 특정 인터페이스를 구현할 수도 있다
* `singleton` 클래스를 생성하고자 할 때, `object` 키워드로 해당 클래스를 정의한다
    * ex) `object MingjaeSignleTon() {}`
* 익명 클래스를 구현하고자 한다면 `object 키워드를 사용한다
    * ex) `moveSomething(object : Movable { override fun move(){} } )`
