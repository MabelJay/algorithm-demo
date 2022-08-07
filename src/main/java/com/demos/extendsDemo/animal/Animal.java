package com.demos.extendsDemo.animal;

public class Animal {
    public String name;
    public int age;

    public Animal() {
        this.name="animal no.1";
        System.out.println("animal constructor");
    }

    static {
        System.out.println("in animal static block");
    }

    public static void staticPrint() {
        System.out.println("in animal static method");
    }

    public void nonStaticPrint() {
        System.out.println("in animal non static method");
    }
}
