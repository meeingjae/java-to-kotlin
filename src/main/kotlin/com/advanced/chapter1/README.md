## Tips

* Generic
  * Kotlin의 Generic은 Java와 차이가 없다
  * 타입 파라미터로 특정 클래스에서 통용되는 타입을 제한하고자 할 때 사용
  * Generic을 사용하지 않으면 `as? X ?: A `와 같은 Safe Call + Elvis 연산자 사용으로 의도하지 않는 코드가 생성될 수 있다
    * Generic을 사용하면 complie 시점에 해당 클래스 내부에 타입 파라미터의 타입으로 모두 변환되어 컴파일 되기 떄문에 Type Safe 해지고, 불필요한 코드를 생성하지 않아도 된다는 장점이 있다
