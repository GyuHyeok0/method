package com.ohgiraffers.section03.math;

public class Application01 {

    public static void main(String[] args) {

        /* 필기.
            API 란?
            Application Programming Interface 는 응용프로그램에서 사용할 수 있도록,
            운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
            쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능을 JDK 를 설치하면
            사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스) 들을 의미한다.
            더 쉽게 말하면 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 말한다.
         */

        System.out.println("-7 의 절대값 : " + java.lang.Math.abs(-7));

        System.out.println("10과 20중 더 작은 것은 : " + Math.min(10, 20));

        System.out.println( Math.PI ); // 원주율

        System.out.println( Math.random() ); //랜덤숫자

    }
    
}
