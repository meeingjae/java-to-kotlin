
### Tips

* 단항 연산자, 산술 연산자, 비교 연산자, 논리 연산자는 Java와 동일하다
* Kotlin에서 객체를 비교할 때, 비교 연산자를 사용하면 자동으로 `compareTo()` 메서드를 호출한다
* 동등성과 동일성
  * 동등성 = 두 객체의 `값`이 같은가
  * 동일성 = 완전히 `동일한 객체`인가 (주소값이 같은가)
  * Kolin에서는
    * 동일성에 `===` 사용 (주소이 같니?)
    * 동등성에 `==` 사용 (값이 같니?)
      * `equals()`
* 기본적으로 Lazy 연산 제공
  * if(a() || b()) 에서 a 함수가 true면 b 함수를 호출하지 않는다
* in / !in
  * 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다
* a..b
  * a부터 b까지의 범위 객체를 생성
* a[i]
* a[i] = b
* 연산자 오버로딩
  * Kotlin에선 객체마다 연산자를 직접 정의할 수 있다
  * `toString()` 을 재정의
* 
