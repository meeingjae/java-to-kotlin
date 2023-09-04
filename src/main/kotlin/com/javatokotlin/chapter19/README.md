### Tips

* `typealias`
    * 별칭 같은 개념이다
    * 함수형 파라미터와 같이 특정 타입이 길어질 때, 별칭으로 정해줄 수 있다
        * ex) `typealias FruitFilter = (Fruit) -> Boolean`
* `import {} as {}`
    * 서로 다른 패키지에 있는 동일 이름의 클래스 혹은 함수를 사용할 때, ~~ as ~ 키워드로 구분할 수 있다
    * ex) 
    * ```
      import com.javatokotlin.a.ImportTest as ImportTestA
      import com.javatokotlin.b.ImportTest asImportTestB
* 구조 분해
  * `data class` 는 구조분해가 가능하다
  * ex) `val (name, age) = Person("abc",123)`
  * `data class`는 기본적으로 componentN 함수를 생성한다
    * 예를들면 `data class Person(val name:String, val age:Int)` 일 때
      * person.component1 은 name 이고
      * person.component2 는 age 다
      * 따라서 (name,age) 로 값을 초기화 하게 되면 위 componentN 함수를 호출해 초기화가 가능하다
  * `data class`가 아닌데 구조분해를 사용하고 싶다면 `componentN` 함수를 직접 구현해야 한다
    * `componentN` 함수는 연산자와 같기에 `operation` 키워드를 붙여서 작성해야 한다
* foreach 문에서의 `continue`, `break`
  * break 하고 싶은 경우, foreach 문을 `run {}` 내부에서 동작시키고 `return@run` 키워드로 break 수행한다
  * continue 하고 싶은 경우 foreach 문 내부에서 `return@foreach` 로 continue 수행한다
* `Label`
  * 코틀린에서는 특정 함수에 대한 라벨링이 가능하다
    * ex) `abc@ for(i in 1..100)`
    * `break@abc`
      * 라는 키워드를 수행하면 `abc@ 라벨이 붙은 for문`에 대해 `break`을 수행한다
  * 하지만 라벨로 인한 code jump는 추천하지 않는다
    * 코드가 다이나믹해지면서 코드 복잡도가 기하급수적으로 늘어날 수 있다
* `takeIf`
  * lambda 내부 내용이 true면 해당 값을 반환하고, 아니면 null을 반환한다
    * ex) `fruits.takeIf {fruit -> fruit.name=="사과"}`
* `takeUnless`
  * lambda 내부 내용이 false면 해당 값을 반환하고, 아니면 null을 반환한다
    * ex) `fruits.takeIf {fruit -> fruit.name=="사과"}`


