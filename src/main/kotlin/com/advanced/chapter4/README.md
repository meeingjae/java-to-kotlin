## Tips

* 변성을 주는 위치
  * `declaration site`
    * 클래스 정의 부분에서 변성을 주는 방법
      * ex) `class Cage<out T> {}`
      * 클래스 정의에 `in`,`out` 키워드를 붙히면
        * 해당 클래스는 데이터를 생산만 하거나, 소비만 하거나 둘 중 하나를 하게 되는데
        * 일반적인 경우 위와같은 클래스를 존재하기 어렵다. 따라서 잘 쓰이지 않는다
          * 사용되는 곳
            * `in` = Comparable<in T>
              * 데이터를 생산만 가능
            * `out` = List<out T>
              * kotlin에선 모든 Collection이 기본적으로 Immutable하기에, 소비만 가능
  * `use site`
    * 클래스 사용 부분에서 변성을 주는 방법
      * ex) `fun addAll(other:Cage<out T>) {}`

