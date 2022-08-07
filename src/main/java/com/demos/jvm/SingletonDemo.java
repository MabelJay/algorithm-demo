package com.demos.jvm;

//懒汉单例模式
public class SingletonDemo {

    private static final SingletonDemo instance = new SingletonDemo();

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        return instance;
    }
}
