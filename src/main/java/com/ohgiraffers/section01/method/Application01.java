package com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름에 대해 이해
            필기.
                메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         */

        System.out.println("main() 메소드 시작됨...");

        /* 목차.1. 작성한 메소드를 호출하는 부분을 작성한다.
        *   필기
        *       메소드 호출방법
        *       클래스명 사용할 이름 = new 클래스명();
        *       사용할 이름. 메소드명();
        * */

        Application01 app1 = new Application01();
        app1.methodK();

        System.out.println("main() 메소드 시작됨...");



    }

    public void methodK() {

        System.out.println("methodA () 등장~");

        methodB();

        System.out.println("methodA () 퇴장~");

    }

    public void  methodB() {

        System.out.println("methodB() 새롭게 탄생");

        System.out.println("methodB() 이젠 안녕");

    }

}