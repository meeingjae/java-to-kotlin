## Tips

* 연산자 오버로딩의 특징
    * `fun` 키워드 앞에 `operator` 키워드가 붙어있다
    * 함수의 이름과 파라미터가 정해져있다
    * 각 operator 함수마다 반환 가능한 타입이 다르므로, 확인해 보아야 한다
        * ex) `operator fun unaryMinus()`
            * 다른 타입 객체를 반환할 수 있다
            * 객체 앞에 '-' 키워드를 붙여 사용
                * ex) `-Point(10,10)`
        * ex) `operator fun inc()`
            * 반드시 같은 타입 객체를 반환해야 한다
            * ex) `++Point(10,10)`
        * ex) `operator fun invoke(a:XX,b:XX)`
            * ex) `operator(1,2)`
            * 인스턴스 이름을 함수처럼 사용할 수 있게 된다
    * [Operator 관련 Kotlin 공식 문서](https://kotlinlang.org/docs/operator-overloading.html)


