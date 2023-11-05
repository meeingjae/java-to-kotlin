## Tips

* 상속 관계의 의미
  * 상속은 상위 타입이 들어가는 자리에, 하위 타입이 대신 위치할 수 있다
    * ex) `class Cage(animal:Animal) , --> val cage = Cage(Fish())`
  * 무공변 퀴즈 !
    * `GoldFish` 클래스는 `Fish` 클래스의 하위 클래스이다
    * 그렇다면 `Cage<GoldFish>` 클래스는 `Cage<Fish>` 클래스의 하위 타입일까?
      * 정답은 No! 두 클래스는 아무 관계도 아니다
      * 이 것을 `무공변` 이라고 한다
      * 한 마디로 `Cage<T>` 는 무공변 하다
  * Effective Java - 배열보단 리스트를 사용하라
    * 배열은 타입에 공변하고, 리스트는 타입에 무공변 하기에, 리스트가 더 Type Safe 하다
  * 그렇다면 `Fish` <-- `GoldFish` 의 관계가 `List<Fish>` <-- `List<GoldFish>` 의 관계로 이어지게 하려면 어떻게 해야할까?
