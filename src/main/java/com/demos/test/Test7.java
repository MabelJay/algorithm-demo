package com.demos.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test7 {
    public static void main(String[] args) {
        Account account = new Account(1000);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(15, 20, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        for (int i = 0; i < 5; i++) {
            executor.execute(new Thread());
        }
    }
}
