package com.demos.extendsDemo.animal;

public class Dog extends Animal {
    static {
        System.out.println("in dog static block");
    }

    public String gender;
    public String name;

    public Dog() {
        this.name = "dog no.1";
        System.out.println("in dog constructor");
    }

    @Override
    public void nonStaticPrint() {
        System.out.println("in dog non static method");
    }

    public static void staticPrint() {
        System.out.println("in dog static method");
    }
}
