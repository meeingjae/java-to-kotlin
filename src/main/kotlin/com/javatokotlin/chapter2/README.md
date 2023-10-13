

### Tips

* Kotlin에서는 null일 수 있는 타입을 완전히 다른 타입으로 간주한다 (`?` 키워드가 붙은 타입)
* safe Call
  * `?.`
    * ex) str?.
    * null이 아닐 경우에 수행해줘 
* 엘비스 연산자
  * `?:`
  * 엘비스 연산자는 early return에도 사용할 수 있다
* nullable 이지만, 절대 null이 아니야 !!
  * `!!` 키워드
* Koltin 코드에서 Java 클래스를 끌어다 쓰는 경우엔 `@Nullable`, `@NotNull` 어노테이션(Jetbrain)을 이해한다
  * `@Nullable`, `@NotNull` 과 같은 어노테이션이 없다면, 코들린이 null 관련 정보를 알 수 없기에 Runtime Exception이 발생할 수 있다
    * 이를 플랫폼 타임이라고 부른다
      * 플랫폼 타입 : 코들린이 null 관련 정보를 알 수 없는 타입
