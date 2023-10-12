package com.advanced.chapter2;

public class JavaCoVariant {

    /**
     * Java의 공변 상태 체크 (String[] 과 Object[] 는 공변(co-variant) 하다
     * 위험한 코드 예시 (Runtime Exception)
     */
    public void coVariant() {

        String[] strs = new String[] { "a", "b", "c" };
        Object[] objs = strs;
        objs[0] = 1; // Runtime Exception
        // 이유 = objs 는 현재 String[]의 주소값을 참조하고 있기에 String[] 이라고 볼 수 있다
        // 하지만 Object[]와 String[] 은 공변하기에, Object[]로 선언한 objs에 int 값인 1을 넣어도 컴파일 에러가 발생하지 않는다
        // 하지만 Runtime에는 해당 코드가 String[0] = 1 과 같은 코드이기에, 런타임 에러가 발생한다
    }
}
