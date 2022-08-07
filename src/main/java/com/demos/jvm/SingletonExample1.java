package com.demos.jvm;

public class SingletonExample1 {
    private static final SingletonExample1 singletonExample = new SingletonExample1();

    private SingletonExample1() {

    }

    public static SingletonExample1 getInstance() {
        return singletonExample;
    }
}
