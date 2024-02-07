package com.ohgiraffers.section03.math;

public class test {

//    public static void main(String[] args){
//        int num = 12345;
//        int result = method(num);
//        System.out.println(result);
//    }
//    public static void method(int bet){
//
//        return bet * 3;
//
//    }

    public static void main(String[] args) {
        int num = 12345;
        test app1 = new test();

        app1.method(num);
    }

    public void method(int bet) {

        int result = bet * 3;
        System.out.println("메소드 실행 결과: " + result);
    }





}
