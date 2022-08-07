package com.demos.extendsDemo.cal;

public class Son extends Father {

    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.name);
        father.eat();
    }

    @Override
    void eat() {
        System.out.println("son is eating");
    }
}
