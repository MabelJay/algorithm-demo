package com.demos.extendsDemo.executor;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {

    static class RunnableBody implements Runnable {
        public int id;

        public RunnableBody(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("begin to execute");
            System.out.println(this.id + " is executing");
            System.out.println("finish to execute");
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 8, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        Future<String> future = executor.submit(() -> System.out.println(System.currentTimeMillis()), "yes");
//        Future<String> future1 = executor.submit(new RunnableBody(001), "success");
        executor.shutdown();
        try {
            System.out.println(future.get());
//            System.out.println(future1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
