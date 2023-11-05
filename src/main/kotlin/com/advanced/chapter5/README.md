## Tips

* `Generic 제약`
  * 클래스 선언부에 Generic 제약을 걸 수 있다
    * ex) `class Cage<T> (val animal:T) where T : Animal, T : Comparable<T>`
      * 위 예시에서 `T` 타입은 `Animal` 의 하위 타입이어야하고 (행동이 Animal로 제한), Comparable 자기자신을 구현하고 있어야 한다는 제약을 걸 수 있다
    * Generic 제약으로 `T : Any` 를 선언해주면 null 값을 방지할 수 있다. (null은 Any의 하위 타입이 아니기 때문이다)
      * ex) `class Cage<T : Any>`
        * `val cage:Cage<Animal?>()` --> 에러. - null은 Any 타입의 하위 타입이 아니기에 컴파일 에러
* `Generic 함수` 
  * `fun <타입> 함수이름() : 반환타입 {}` 으로 Generic 함수 선언 가능하다
    * ex) `fun <T : Comparable<T>> Iterrable<T>.sorted(): List<T> {}`
      * `T`는 `Comparable`을 구현하고 있어야 하며. Iterrable의 sorted 함수를 확장 함수로 구현하는데 반환타입은 List<T> 이다
  * Generic 함수를 사용하면, 유연한 코딩이 가능해진다
    * ex) hasInterSection (교집합 함수) 를 확장함수로 구현하고자 할 때
      * Generic으로 선언하면 String,Int,Long과 같은 모든 타입에 동일한 함수를 선언하지 않아도 된다
      * 
