package com.demos.polymorphism;

public class Man extends Human {
    @Override
    public void sayHello(Human guy) {
        System.out.println("Hi, gentleman");
    }
}
