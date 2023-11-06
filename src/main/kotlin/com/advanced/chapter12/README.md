## Tips

* Collection 순회 시 `Iterable`과 `Sequence`
  * 둘의 차이점은 `Iterable`은 stream이 진행될 때마다 계속해서 Collection을 생성한다
    * ex) 200만 -- filter --> 40만(생성) --map--> 40만(생성) --최종연산--> 결과
  * 반면 `Sequence`는 각 객체마다 stream을 수행한다
    * ex)
      * 1번객체 --filter --> 탈락 - 다음
      * 2번객체 --filter --> 통과 --map--> 통과
      * 3번객체 --filter --> 탈락 - 다음 
      * ... 마지막 최종연산
  * `Iterable` 은 매 stream 수행마다 새로운 객체 및 컬렉션을 생성하면서 모든 객체를 stream에 태우지만,
  * `Sequence`는 최종 연산 전까지 각 객체별로 stream을 돌린다
    * ex) `.take(10_000)` 는 별도로 카운트하고 있다가 만 번째 객체가 통과하면 그 이후 199만개의 객체는 스트림을 수행하지 않는다
  * `Sequence`는 대용량 데이터를 Stream 돌릴 떄 유리하다
  * `Iterable` 은 소용량 데이터에서 `Sequence`보다 5% 정도 성능이 좋다
  * 200만 건의 데이터에서 `Sequence`가 `Iterable`보다 100배 이상으로 성능이 좋다
* JMH
  * 코드 성능을 측정할 수 있는 도구 (lib) 이다
  * gradle 에 jmh 의존성 및 기능들을 명시하고 명령어로 수행
  * src 하위 jmh 패키지를 별도로 생성해서 테스트를 수행해야 한다
  * 결과는 report 형식으로도 나오고, 테스트 코드에서 print도 할 수 있다
  * 자세한 내용은 공문 혹은 강의 자료를 참고
  