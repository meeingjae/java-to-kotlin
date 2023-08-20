## Tips

* `위임 객체`
    * 위임 객체는 반드시 `getValue`, `setValue` 함수를 구현해야 한다
    * 위임 객체에 `ReadOnlyProperty<>` , `ReadWriteProperty<>` 를 구현하도록 하면 getValue, setValue 의 메소드 시그니쳐를 알지 못해도 구현이 조금 더 쉬워진다
        * 위 인터페이스는 익명 함수로도 사용이 가능하다
            * ex) `val name:String by object : ReadOnlyProperty<Person3, String> { override fun getValue(... ...){} }`
    * 만약 위임 객체의 프로퍼티 네임과 같이 리플렉션 데이터를 기준으로 위임 객체를 제한하고 싶다면?
        * ex) 프로퍼티 이름이 `name`인 녀석만 `XXXDelegate` 위임 객체를 사용하게 하고 싶다면?
            * 정답은 객체 --> 위임객체 사이에 `위임객체Provider`를 만든다
                * 위임객체Provider는 위임 객체를 반환하고, 호출하는 대상 프로퍼티 정보를 리플렉션으로 받아, Exception을 발생시킬 수 있다
        * 위임객체 Provider 만들기 어렵지?
            * 그래서 `PropertyDelegateProvider` 라는 인터페이스가 있다 ㅎㅎ 이것의 구현체로 만들면 됨 !
* `위임 클래스`
    * 상속보단 합성
    * 인터페이스를 구현하고, 상위 클래스르 상속받도록 구현하여 중복 코드를 제거할 수 있음
        * ex) `class GreenApple(val apple:Apple) : Fruit by apple { override val .... } `
  