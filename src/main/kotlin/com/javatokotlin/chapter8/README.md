### Tips

* Kotlin 함수
    * 함수 내부 body가 하나의 값으로 간주되는 경우 block(`{}`) 을 없앨 수 있다
    * 함수 파라미터에 기본 값을 명시해줄 수 있다.
        * ex. `fun abc(a:Int = 3)`
    * 함수를 호출하는 부분에서 파라미터를 명시적으로 지정해줄 수 있다
        * ex. `repeatUnit.repeat2(str = "abc", withNewLine=true)`
    * 가변 인자를 사용할 수 있다
      * 가변 인자를 포함하는 함수의 파라미터는 `vararg` 키워드를 사용한다
        * ex. `fun abc(vararg abc:String)`
      * 함수 호출 시 콤마(,) 로 구분 된 값을 직접 넣을 수 있다
        * ex. `abc("a","b","c")`
      * 함수 호출 시 배열을 그대로 넣고자 한다면 변수 앞에 스프레드 연산자(*)를 붙여줘야 한다
        * ex. `abc(*arrayOf("a","b","c"))`