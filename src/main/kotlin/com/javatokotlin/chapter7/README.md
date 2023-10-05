### Tips

* try catch finally 구문은 문법적으로는 동일하다
    * Kotlin에서는 try catch가 expression이라 return이 가능하다
* Kotlin에서 모든 예외는 Unchecked Exception이다
    * 즉 try catch를 사용하지 않아도 된다 (사용하지 말라는 말은 아니다)
* Kotlin에서 try with resources 구문이 없다. 대신 코틀린의 언어적 특징을 활용해 close를 호출해준다 (use {a -> a.xx()})
