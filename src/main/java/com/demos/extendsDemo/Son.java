package com.demos.extendsDemo;

public class Son extends Father {

    public static int B = A;

    static {
        System.out.println("A in son class:" + A);
    }

    public Son() {
        System.out.println("A in son constructor method:" + A);
    }

    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father();
        System.out.println(A);
        System.out.println(B);
        // 执行顺序：父类的静态赋值->父类的静态代码块->子类的静态赋值->子类的静态代码块->父类的构造方法->子类的构造方法

        System.out.println(new Son().getClass().getClassLoader());
        System.out.println(new Son().getClass().getClassLoader().getParent());
        System.out.println(new Son().getClass().getClassLoader().getParent().getParent());
    }
}
