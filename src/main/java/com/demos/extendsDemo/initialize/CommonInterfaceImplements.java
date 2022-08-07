package com.demos.extendsDemo.initialize;

public class CommonInterfaceImplements implements CommonInterface {

    public static void main(String[] args) {
        CommonInterface commonInterface = new CommonInterfaceImplements();
        commonInterface.eat();
        System.out.println(CommonInterface.num);
    }

    @Override
    public void eat() {
        System.out.println("implements method");
    }
}
