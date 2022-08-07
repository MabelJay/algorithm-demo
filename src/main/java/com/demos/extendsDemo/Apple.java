package com.demos.extendsDemo;

public class Apple extends Fruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.taste();
        System.out.println(apple.name);
        apple.name = "apple no.1";
        System.out.println(apple.name);
    }

    public Apple() {
        super("11");
        System.out.println("derived class constructor executed: " + name);
    }

    public void taste() {
        System.out.println("Good apple:");
//        super.taste();
//        System.out.println(name);
//        Fruit.main(null);
    }
}
