package com.demos.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton2);

        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();
        System.out.println(singleton3 == singleton4);

        System.out.println("start multi-thread verify...");

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton1.getInstance() == singleton1);
                System.out.println(Singleton2.getInstance() == singleton4);
            }).start();
        }
    }
}
