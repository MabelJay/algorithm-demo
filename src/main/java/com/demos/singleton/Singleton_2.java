package com.demos.singleton;

public class Singleton_2 {
    private static volatile Singleton_2 instance;

    private Singleton_2() {

    }

    public static Singleton_2 getInstance() {
        if (instance == null) {
            synchronized (Singleton_2.class) {
                if (instance == null) {
                    instance = new Singleton_2();
                }
            }
        }
        return instance;
    }
}
