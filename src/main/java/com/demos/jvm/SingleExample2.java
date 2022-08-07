package com.demos.jvm;

public class SingleExample2 {

    private static volatile SingleExample2 singleExample;

    private SingleExample2() {

    }

    public static SingleExample2 getInstance() {
        if (singleExample == null) {
            synchronized (SingleExample2.class) {
                if (singleExample == null) {
                    singleExample = new SingleExample2();
                }
            }
        }
        return singleExample;
    }
}
