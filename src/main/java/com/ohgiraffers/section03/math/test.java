package com.ohgiraffers.section03.math;

public class test {

    public static void main(String[] args) {

        int height = 5;
        int width = 10;
        System.out.println(test.methodA(height,width));

        test test1 = new test();
        test1.methodB(height,width);
        


    }

    public static int methodA(int first ,int second ){

        return (first + second) * 2 ;

    }

    public void methodB(int first, int second){

        System.out.println( (first + second) * 2 );

    }

}
