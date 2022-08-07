package com.demos.polymorphism;

public class Woman extends Human {
    @Override
    public void sayHello(Human guy) {
        System.out.println("Hi, lady");
    }
}
