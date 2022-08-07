package com.demos.extendsDemo;

public class HelloWorld {
    static int c;
    int d;

    public static void main(String[] args) {
        System.out.println("c=" + c);
        new HelloWorld().init();
    }

    public void init() {
        System.out.println("d=" + d);
    }
}
