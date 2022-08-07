package com.demos.extendsDemo.differentSingleton;

import java.util.concurrent.*;

public class SingletonTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
 /*       ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            Future<String> future = executorService.submit(() -> System.out.println(Singleton1.getInstance().hashCode()), "done");
            System.out.println(future.get());
        }
        executorService.shutdown();
*/
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        for (int i = 0; i < 10; i++) {
//            Future<String> future = executor.submit(() -> System.out.println(Singleton3.getInstance().hashCode()), "done");
            Future<String> future = executor.submit(() -> System.out.println(Singleton4.INSTANCE.hashCode()), "done");
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}
