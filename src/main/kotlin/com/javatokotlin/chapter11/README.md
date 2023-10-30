### Tips

* 가시성 제어
    * `protected`
        * Kotlin의 `protected`는 단순 같은 패키지일때 접근이 가능하지 않다
        * `protected`는 본인 클래스 및 자식 클래스에서만 접근 가능하다
            * 그 이유는 Kotlin에서의 package라는 개념이 가시성 제어를 목적으로 두지 않고, namespace를 관리하기 위한 용도로만 사용되기 때문이다
    * `internal`
        * Java의 `default`와 유사하다
        * `internal`은 같은 모듈 내에서 접근이 가능함을 의미한다
    * `public`
        * kotlin의 기본 접근 제어자
* `.kt` 파일의 접근 제어
    * 파일 내에 변수, class, function을 모두 정의할 수 있다
        * `public`
            * 파일 내 어디서든 접근 가능
        * `protected`
            * 파일 내에서 접근 가능
                * 파일 최상단에서는 접근 불가
        * `internal`
            * 같은 모듈
        * `private`
            * 파일 내부
* 기본 생성자에 public이 아닌 다른 접근 제어를 하고 싶다면 접근 제어자 뒤에 `constructor` 키워드를 명시해야 한다
    * ex) class A protected constructor() {}
* 유틸성 함수를 정의할 땐, 파일의 최상단에 정의하면 좋다
    * Java 코드로 디컴파일 해보면 `public static final` 클래스로 변환된다
    * Java 코드에서 해당 함수를 가져다 쓸 때 `static` 함수처럼 호출이 가능하다
        * ex) Stringutils.method()
* 클래스 생성자에 접근 제어자를 지정하면, `getter`, `setter`도 동일한 접근 제어자의 영향을 받는다
    * Custom Getter, Setter를 통해 `getter`, `setter`에 대한 접근 제어를 별도로 수행할 수 있다
* `internal` 은 java byte code로 변경 되면 `public`으로 인식 된다
* Java에서 kotlin 파일을 가져다 쓸 때, `protected`, `internal` 키워드 사용에 유의하자. (Java와 매커니즘이 다르기 때문)