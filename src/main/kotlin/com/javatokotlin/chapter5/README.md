
### Tips

* `Statement`
  * 프로그램의 문장, 하나의 값으로 도출 되지 않는다
  * Java에서의 If문은 Statement이다. 값으로 도출되지 않는다
* `Expression`
  * 하나의 값으로 도출되는 문장
  * Kotlin에서의 if-else는 Expression이다. 즉 하나의 값으로 도출 될 수 있다
    * 위와 같이 사용이 가능하기에, Kotlin에서는 3항 연산자가 없다 (if-else로 대체)
* `범위 비교`
  * ex) score 값이 0부터 100 사이에 있다면?
    * Java
      * if(score >=0 && score <= 100) {}
    * Kotlin
      * if(score in 0..100) {}
* `Switch문`
  * `when()`
    * in 키워드 사용 가능
    * Expression으로 값을 도출할 수 있어 바로 return 가능
    ```
    return when(값) {
        조건부 -> 구분 or 값
        조건부 -> 구문 or 값
        else -> 구문 or 값
    } 
    
    return when(score) {
        10 -> "A"
        in 11..20 -> "B"
        else -> "C"
    } 
    ```
  
