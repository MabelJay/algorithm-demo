package com.demos.extendsDemo.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOfCount {
    private static AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            Future<String> future = executorService.submit(() -> count.incrementAndGet(), "done");
            System.out.println(future.get());
            System.out.println(count);
        }
        executorService.shutdown();
    }
}
