package com.ohgiraffers.section01.method;

public class Application09 {

    public static void main(String[] args) {

        //필기. 기본형 인 경우
        int first = 1;
        int second = 3;
        Calculator app9 = new Calculator();
        app9.minNumberOf(first, second);

        System.out.println( app9.minNumberOf(first, second) );

        //필기. static 인 경우
        int max = Calculator.maxNumberOf( first, second);
        System.out.println(max);




    }

}
