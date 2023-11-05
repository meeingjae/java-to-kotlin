## Tips

* Generic을 클래스에서 정의하고, 함수에서 재정의 하는 경우 Generic이 override 된다
    * 이를 `타입 파라미터 쉐도잉` 이라고 한다
        * Generic 쉐도잉은 위험한 코드가 될 수 있다
            * 이유는 Generic으로 선언 된 객체를 생성할 때 정해진 타입과
            * 함수를 호출할 때 정해지는 타입이 다르기에
            * `Cage<GoldFish>` 로 선언했지만 재정의한 함수에서 `Cage<Carp>`가 들어갈 수 있음을 의미한다
            * 따라서 컴파일 시엔 문제가 안되지만, 런타임시에 문제가 될 수 있다
    * 안전한 코드를 위해서 Generic을 함수에서 재정의 하는 행위는 하지 않아야 한다
        * ex) `class A<T:Animal>{ fun <T:Animal> addAll() {} }` --> 런타임 에러 발생 가능
* `Generic의 상속의 두가지 방법`
    * (1) 상위 클래스와 동일한 Generic 제약 조건을 가지도록 한다
        * ex)
            ```
            class A(T:Fish)
            class B(T:Fish) : A<T>() {}

    * (2) Concrete 하게 타입을 명시해준다
        * ex)
            ``` 
          class A<T:Fish>()
          class B : A<GoldFish>() {}
          ```
