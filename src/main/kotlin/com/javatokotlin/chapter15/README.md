### Tips

* 배열
  * `indice` 키워드로 배열 max 인덱스 값을 얻을 수 있다
    * ex) `for (i in array.indices) {}`
  * `withIndex()` 함수로 배열의 인덱스와 그 값을 한번에 얻을 수 있다
    * ex) `for ((i, value) in array.withIndex() {}`
* 컬렉션
  * 불변과 가변이 있다
    * 불변은 초기화 이후 엘리먼트를 추가, 삭제할 수 없다
  * 초기화 시 불변/가변을 반드시 지정해야 한다
  * Java와 Kotlin을 섞어 사용할 때 주의사항
    * Java에서 Kotlin의 Collection을 사용할 땐, 불변 컬렉션을 수정할 수 있고, non-null인 컬렉션에 null을 넣을 수 있다
    * Kotlin에서 Java 컬렉션을 가져갈 때는 플랫폼타입을 주의해야 한다
    * Map 초기화
      * `val map = mapOf(1 to "abc", 100 to "qqwwee)`
      * `map[1] = "abc`
      * `map[150] = "qqwee`
  * emptyCollection 을 선언할 땐 타입 추론이 불가능하다면 반드시 명시적으로 타입을 작성해 주어야 한다
    * ex) `val list = emptyList<Int>()`
