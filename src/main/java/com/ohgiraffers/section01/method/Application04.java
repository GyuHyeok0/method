package com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args) {

        Application04 app4 = new Application04();
        app4.testMethod("조평훈", 20,'남');

    }

    public void testMethod(String name, int age, final char gender){

        System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + "성별은 " + gender + "입니다." );
        return;
    }

}
