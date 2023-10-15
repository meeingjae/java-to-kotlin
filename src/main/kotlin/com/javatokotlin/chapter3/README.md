
### Tips

* Kotlin은 명식적 캐스팅이 기본이다
* Java의 `instanceOf` 키워드는 코틀린의 `is` 키워드로 대체가 가능하다.
  * 반대로 `!is` 키워드도 사용이 가능하다
* Kotlin은 `as` 키워드로 인스턴스 캐스팅이 가능하다
  * ex) `val person = obj as Person`
* Koltin의 데이터 타입
  * Any
    * Java의 Object와 같은 역할
    * 모든 객체 최상위 타입
    * 모든 Primitive Type의 최상위 타입도 Any이다
    * Any 자체로는 null을 표현할 수 없어 그럴 땐 Any? 를 사용해야한다
  * Unit
    * Java의 Void와 같은 역할
    * FP에서 Unit은 단 하나의 인스턴스를 갖는 타입을 의미한다
  * Nothing
    * 함수가 정상적으로 끝나지 않았음을 표현하는 역할 (함수의 반환타입)
    * 무조껀 예외를 반환하는 함수, 무한 루프 함수 등
* String interpolation / String indexing
  * Kotlin에선 `${변수}` 키워드로 스트링에 변수를 직접 포함시킬 수 있다
  * 여러 줄에 걸친 String 표현 시 `""" """.trimIndent()` 큰 따옴표 3개 키워드 사용 가능
  * `[]` 키워드로 String의 특정 인덱스에 있는 Char 값을 가져올 수 있다
    * ex) val character: Char = str[1]
