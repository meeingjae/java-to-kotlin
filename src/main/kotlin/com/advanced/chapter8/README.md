## Tips

* `lateinit`
    * 객체를 인스턴스화 하는 시점과, 객체를 초기화 하는 시점을 분리하고 싶을 때
    * 초기화 로직이 여러 군데 있을 수 있다
        * ex) 테스트 코드에서 전역변수로 Person 을 선언한 후, 각각의 테스트에서 초기화 후 사용하고 싶을 때
    * `lateinit`의 동작 원리
        * `lateinit`으로 선언 된 변수는 컴파일 시점에 `nullable` 한 취급을 받는다
            * 단, 해당 프로퍼티에 접근할 때, 해당 프로퍼티가 `null`이면 Exception을 발생시킨다
    * `lateinit`은 primitive type에 사용할 수 없다
        * (kotlin) Int => (Java) int
        * (kotlin) Int? => (Java) Integer
        * (Kotlin) Long => (Java) long
        * (Kotlin) Long? => (Java) Long
        * Java의 non-null인 primitive type이 코틀린의 non-null인 Int,Long 등등과 대응한다
            * 따라서 필드를 `nullable`로 취급해야 하는 `lateinit`은 primitive type (Int,Long ...) 에 선언할 수 없다
        * 또한 Runtime에 값을 변경할 수 있어야하기에 `var` 키워드로 명시해줘야한다
* 프로퍼티의 lazy 로딩
  * not good practice
    * 객체를 초기화 할 때, 쓰일지도, 안쓰일지도 모르는 필드를 초기화 하는 비용이 클 떄(Network I/O 와 같은?) 지연 초기화 하는 방법이 있다
    * 바로 ` backing property`를 선언하는 것
      * `backing property`는 초기화를 위한 추가 변수를 선언하는 것으로 보통 `nameAbc` -> `_nameAbc` 으로 선언하는 것이 컨벤션이다
      * 선언 후 `nameAbc`에 대한 `customGetter`에서 lazy 로직을 적용한다
  * good practive
    * `by lazy {}` 함수를 선언한다
      * 위와 동일하게 동작하지만 `backing property`를 추가로 선언해주지 않아도 되어, 코드가 간결해진다
      * `by lazy` 함수는 프로퍼티가 최초 `get` 될 때 한 번만 수행 된다.
        * Thread Safe 하다
    * 초기화를 Get 호출 전으로 지연
    * 초기화 로직은 변수 선언과 동시에 한 곳에만 위치할 수 있다
  
