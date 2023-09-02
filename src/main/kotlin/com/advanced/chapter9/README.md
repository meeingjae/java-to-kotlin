## Tips

* 위임 패턴 (delegate 패턴)
  * `by lazy {}` 키워드는 기본적으로 위임 패턴을 사용한다
    * 위임 대상이 되는 기본적인 class는 `class Lazy` 이다
    * `Lazy` 클래스는 기본적으로 `operator fun getValue`와 `operator fun setValue`를 가져야 한다
    * 한 마디로 `by lazy` 키워드를 사용하면 해당 프로퍼티와 Lazy 클래스를 이어줘서
    * `get property` 호출 시 `Lazy.getValue()`를 호출하고, `set property` 호출 시 `Lazy.setValue()` 함수를 호출하게 된다
    * 따라서 위 필수 함수를 구현하면 `Lazy` 함수를 직접 구현할 수 있다
