package com.demos.extendsDemo.differentSingleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton2 {

    private static final AtomicReference<Singleton2> INSTANCE = new AtomicReference<>();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        Singleton2 singleton2 = INSTANCE.get();
        if (singleton2 == null) {
            singleton2 = new Singleton2();
            if (INSTANCE.compareAndSet(null, singleton2)) {
                return singleton2;
            }
        }
        return singleton2;
    }
}
