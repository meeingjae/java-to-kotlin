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
