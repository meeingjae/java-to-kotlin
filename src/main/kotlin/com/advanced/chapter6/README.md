## Tips

* `star projection`
    * 해당 파라미터에 어떤 타입이 들어있을 지 모른다는 의미
        * ex) `if (data is List<String>)` --> error. 이유 = Generic은 Runtime에 `소거`되기 때문에 String 타입의 List인 지 알 수 없다
            * `if (data is List<*>)` --> 가능. 이유 = String의 List인지는 알 방법이 없지만, 최소한 List 타입이라는 것은 알 수 있다
            * 따라서 위와 같은 경우 `List`의 funtion을 사용할 수 있다. (최소한 List라는 것은 확인이 가능하기에)
            * 따라서 꺼내쓸 땐 `Any?` 와 같이 모든 타입을 커버할 수 있게 꺼내야 하고
            * 데이터를 집어넣는 것은 하지 말아야 한다. (어떤 타입인 지 Runtime에 모르기 때문에)
* 확장 함수에서 Generic을 사용하고자 하는 경우?
    * Generic은 Runtime에 모두 소거된다. 그렇다면 Generic으로 선언한 확장함수들은 사용이 불가능하겠네?
        * 정답 = Yes. 선언 된 함수 내부 Generic이 모두 소거되기 때문에 코드가 정상적이지 않다
    * 그렇다면 Generic을 살리면서 확장 함수를 정의하고자 할 때는?
        * `inline` + `refied` 키워드를 이용하자
            * ex) `inline fun <refied T> List<*>.hasAnyInstanceOf() : Boolean {return this.any { it is T}`
          * `inline` 키워드로 컴파일 시점에 해당 확장함수를 호출부분에 그대로 구현하기에 타입을 알 수 있다
          * `refied` 키워드는 `inline` 선언 된 `fun` 내에서만 사용이 가능하다. 
          * `inline` 키워드와 `refied` 키워드를 함께 사용하면 Runtime에 Type 정보를 알 수 있다
