package com.demos.test;

public class Test {

    private static Person person = new Person("12", 12);

    public Test() {
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();


        System.out.println(Test.person==Test.person);
    }
}
