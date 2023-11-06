## Tips

* 위임 객체
  * `notNull()`
    * 이전 챕터에서 `primitive 타입`은 `lateinit`이 불가능하다고 했다.
      * 이를 가능하게 하는 방법은 없을까?
        * 있다. 정답은 `by notNull()` 위임 객체를 할당하는 것
        * ex) `var age:Int by notNull()`
          * age 프로퍼티는 primitive 타입이지만 `lateinit`과 동일하게 동작한다
          * 만약 초기화하지 않고 사용하면 `IllegalStateException` 떨어지니 조심
  * `observable`
    * `initialValue` 와 `onChange 함수`를 인자로 받는다
      * 초기값과 setter가 호출되었을 때 호출할 함수를 인자로 받는다
      * ex) `var name:String by observable("초기이름") { _ , 이전값 , 현재값 -> println(이전값) println(현재값)`
  * `vetoable`
    * observable 과 유사한 구조이다
    * `initialValue`와 `onChange 함수`를 인자로 받는다
    * `onChange 함수`의 반환 값이 Boolean이다.
      * `onChange 함수` 내부에서 oldValue,newValue 로 어떠한 연산 값이 Boolean일 때 사용한다
  * `this::프로퍼티`
    * 같은 클래스 내부에서 하나의 프로퍼티를 다른 프로퍼티에 위임하고자 할 때 사용
    * 리펙토링 혹은 Deprecated 시 사용하면 유용하다
      * ex) `@Deprecated val name:String  val newName:String by this::name`
        * 위 코드는 name을 호출해도 name이 호출되고, newName을 호출해도 name이 호출된다
        * 모든 작업자가 name을 newName으로 리펙토링이 완료 되었을 때, `by this::name` 키워드를 해제하면 유용하다
  * `by Map`
    * 우리가 아는 그 Map이 맞다
    * 키워드를 명시하면 해당 키 값으로 `get` 해온다
      * ex) `val name:String by fishMap`
        * 위 코드는 `val name:String = fishMap.get("name")` 을 수행한 것과 동일한 결과를 가진다
        * 한마디로 Map을 Delegate 객체로 사용하겠다는 문이다

