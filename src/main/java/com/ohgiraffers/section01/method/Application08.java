package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출 할 수 있다.
            필기.
                static 메소드 호출
                클래스명. 메소드명(); <- 이런 방식으로 호출한다.
         */

        int first = 10;
        int second = 30;
        System.out.println( Application08.sumTwoNumbers(first,second));

//         필기. 스테틱은 코드가 실행 될때 공간을 만들기 때문에 미리 공간을 만들 필요가 없다.
//         필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다.
        System.out.println(sumTwoNumbers(20,30));




    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;

    }

}
