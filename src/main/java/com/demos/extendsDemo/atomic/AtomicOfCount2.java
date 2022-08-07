package com.demos.extendsDemo.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicOfCount2 {

    private static final AtomicReference<Integer> count = new AtomicReference<>(1);

    private static void increment() {
        int val = count.get();
        count.compareAndSet(val, val + 1);
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            Future<String> future = executorService.submit(AtomicOfCount2::increment, "done");
            System.out.println(future.get());
        }

        System.out.println(count);
        executorService.shutdown();
    }
}
