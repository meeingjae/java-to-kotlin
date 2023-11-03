### Tips

* 확장 함수
  * Kotlin은 Java와 100% 호환 되는 것을 목표
  * Java의 클래스에 특정 함수만 추가해서 사용하고 싶은 요구가 생김
  * `this` 키워드로 대상 함수 멤버 변수에 접근 가능
    * ex) Java의 `String.java ` 에 추가적인 method를 정의하고 싶다 이거임
    * 확장함수 선언
      * ex) `fun String.lastChar(): Char {}`
      * 와 같이 클래스.함수명 으로 확장 함수를 만들 수 잇음
    * 대상 클래스의 캡슐화를 고려하여 `public`으로 선언 된 프로퍼티 및 함수만 사용 가능
  * 확장 함수와, 기존 함수의 시그니쳐가 동일하면 `멤버함수가 먼저 호출`된다
  * 상속 관계에서의 확장 함수?
    * B : A() 일 때
    * val a : A = A() = A의 확장함수 호출
    * val a : A = B() = A의 확장함수 호출
    * val a : B = B() = B의 확장함수 호출
  * Java에서는 확장함수를 static method처럼 사용 가능하다
    * ex) StringUtil.lasChar()
* 중위 함수(infix 함수)
  * `infix` 키워드로 명시
    * ex) `infix fun Int.add2(other:Int):Int {}`
      * `3 add2 4`
* inline 함수
  * `inline` 키워드 명시
  * 함수 복붙과 같은 느낌
  * `inline` 키워드로 명시 된 함수를 샤용하는 곳을 보면
    * 함수 내부 코드가 호출한 곳으로 그대로 옮겨가 적용되어 있다
      * byte 코드 변환 시 확인 가능
  * 함수를 파라미터로 호출할 때 오버헤드를 줄일 수 있다
  * 하지만 무분별하게 사용하면 안되고, 반드시 성능 측정이 동반되어야 한다
* 지역 함수
  * 함수 안에 함수
  * ```fun create() {
          fun validate(){}
          validate()
          validate() }```
