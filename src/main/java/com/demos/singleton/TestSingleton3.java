package com.demos.singleton;

public class TestSingleton3 {

    public static void main(String[] args) {
        SingletonDemo1 demo1 = SingletonDemo1.getInstance();

        Runnable runnable = () -> {
            System.out.println(demo1.hashCode() == SingletonDemo1.getInstance().hashCode());
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        SingletonDemo2 demo2 = SingletonDemo2.getInstance();

        Runnable runnable1 = () -> System.out.println(SingletonDemo2.getInstance().hashCode() == demo2.hashCode());
        for (int i = 0; i < 10; i++) {
            new Thread(runnable1).start();
        }
    }
}
