### Tips

* `Scope Function`
  * 스코프 펑션이란 함수의 일시적인 영역을 생성해서 코드를 좀 더 간결하게 만드는 데 사용
    * ex) `let`
    * `let`, `run`, `also`, `apply`
      * 모두 확장함수
      * `let`,`run` 은 람다의 결과를 반환한다
      * `also`,`apply`는 객체 그 자체를 반환한다
        * 람다 내부에서 그 어떤 조작과 호출이 이루어져도 해당 구문이 끝날 때는 `also`,`apply`를 호출한 객체 그 자체를 반환한다
      * `let`,`also`는 람다 내부에서`it` 을 사용한다
        * `it`은 생략이 불가능한 대신, 다른 이름을 붙일 수 있다
          * ex) `person.let { it.age }`
          * ex) `person.let { it -> it.age }`
          * ex) `person.let { p -> p.age }`
      * `run`,`apply`는 람다 내부에서 `this`를 사용한다
        * `this`는 생략이 가능한 대신, 다른 이름을 붙일 수 없다
          * ex) `person.run { this.age }`
          * ex) `person.run { age }`
      * `let`,`also`는 파라미터로 값을 받는다
        * ex) `let((T) -> R)`
      * `run`,`apply`는 파라미터로 값의 확장함수를 받는다
        * ex) `run(T.() -> R)`
        * 확장 함수는 본인 자신을 this로 표현하고, 생략이 가능하다는 특성 존재
    * `with`
      * 확장함수가 아니다
      * `this` 키워드로 객체 내부 접근 가능하며, `this` 키워드 생략이 가능하다
      * ex) `with(person) {println(name) println(age)}`

* `let` 용도
  * non-null 값에 대해서만 code block을 실행하고자 할 때 
  * 하나 이상의 함수를 call chain 결과로 사용할 때
  * 일회성으로 제한된 영역에 변수를 선언하고자 할 때
* `run` 용도
  * 객체 초기화와 반환 값 계산을 동시에 할 때
    * ex) `val person:Person = Person("name",123").run(personRepository::save)`
      * 수행 시, 객체 생성 후 -> DB 저장 후 -> DB에 저장 된 객체가 `val person`에 할당 된다
    * 객체 생성 후 필수적으로 특정 값을 `set` 해줘야 할 때도 사용할 수 있다. (객체 그 자체를 반환하기 떄문에)
    * 생성자가 너무 길어지게 되는 경우, 생성자를 간략하게 하고, `run` 내부에서 나머지 필드를 set 해주면 코드가 좀 더 깔금해지기도 한다
* `also` 용도
  * 객체를 수정하는 로직이 call chain 중간에 필요한 경우
  * ex) `arrayOf(1,2,3).also{println(it+1)}.add(4)`
* `with` 용도
  * 특정 객체를 다른 객체로 변환해야 하는데 모듈간의 의존성 때문에 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
  * ```
    val fruitDto = with(Fruit("사과 {")) {
        FruitDto(this.name, this.price)
    } 
* `Scope Function`의 단점
  * 가독성이 안좋다
    * 숙련된 코틀린 개발자만 이해가 가능한 코드가 될 수 있다
    * 디버깅이 어렵다
    * 숙련도에 따라 수정이 어려울 수도 있다

