package com.demos.extendsDemo;

public class Father {

    public static int A = 10;

    static {
        A = 20;
        System.out.println("A in Father class:" + A);
    }

    public Father() {
        A = 30;
        System.out.println("A in Father Constructor method: " + A);
    }
}
