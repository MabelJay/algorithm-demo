package com.demos.extendsDemo;

public class Fruit {

    public String name;

    public void taste() {
        System.out.println("delicious fruit");
    }

    public static void main(String[] args) {
        System.out.println("in fruit main method");
    }

    public Fruit(String name) {
        this.name = name;
        System.out.println("parent constructor executed");
    }

//    public Fruit() {
//        System.out.println("parent class no parameter constructor");
//    }
}
