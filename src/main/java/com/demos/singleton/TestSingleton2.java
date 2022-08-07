package com.demos.singleton;

public class TestSingleton2 {

    static class ThreadBody implements Runnable {
        @Override
        public void run() {
            System.out.println("enter thread");
        }
    }

    public static void main(String[] args) {
        Singleton_1 instance1 = Singleton_1.getInstance();
        Runnable threadBody = () -> System.out.println(Thread.currentThread().getName() + "==" + (instance1 == Singleton_1.getInstance()));

        Singleton_2 instance2 = Singleton_2.getInstance();
        Runnable threadBody2 = () -> System.out.println(Thread.currentThread().getName() + "-2==" + (instance2 == Singleton_2.getInstance()));


        for (int i = 0; i < 10; i++) {
            new Thread(threadBody).start();
            new Thread(threadBody2).start();
        }
    }
}
