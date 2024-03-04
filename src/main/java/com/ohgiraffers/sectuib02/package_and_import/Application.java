package com.ohgiraffers.sectuib02.package_and_import;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        System.out.println(app.plusMethod(3,5));
    }
    public int plusMethod(int a, int b){
        return  a + b;
    }


}
