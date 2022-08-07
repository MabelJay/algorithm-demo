package com.demos.singleton;

public class SingletonDemo2 {

    private static volatile SingletonDemo2 instance;

    private SingletonDemo2() {
    }


    public static SingletonDemo2 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo2.class) {
                if (instance == null) {
                    instance = new SingletonDemo2();
                }
            }
        }
        return instance;
    }
}
