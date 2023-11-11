## Tips

* `SAM` (Single Abstract Method)
    * Java에서는 SAM을 가지는 interface는 본문에서 람다로 그 값을 표현할 수 있다
    * Kotlin에서는 SAM을 가지는 interface를 인스턴스화 할 때, object 키워드를 명시하거나, interface명을 앞에 명시해 주어야 람다로 인스턴스화가 가능하다 (Java와는 다르다)
    * `SAM`을 파리미터로 받는 `function`이 있을 경우, `SAM`을 인스턴스화 하지 않고, 그 자리에 람다 식만 사용해줘도 코틀린 컴파일러가 어떤 `SAM`을 구현하는지 인지할 수 있다
        * 이를 `암시적인 SAM 인스턴스화` 라고 부르는데, 이는 암시적이기에 의도하지 않은 `SAM`이 호출 될 수 있다
    * `Kotlin`에서 `SAM` 인터페이스를 생성하고 싶다면 `fun interface XXX` 키워드로 인터페이스를 생성하면 된다
        * ex) `fun interface KtString{ fun predicate(str:String): Boolean }`
* `Reference`
  * 호출 가능 참조
    * `::` 키워드로 사용 
    * ex) `val getterRefernece = person::name.getter` 
      * person의 name 프로퍼티에 대한 getter를 참조한다
    * Java의 Reflection은 함수형 결과값을 반환하는 반면에
    * Kotlin Reflection은 `코틀린 리플렉션 객체`를 반환한다


