package com.demos.jvm;

import java.util.HashSet;
import java.util.Set;

public class SingletonVerify {

    public static void main(String[] args) {
        SingletonDemo demo1 = SingletonDemo.getInstance();
        SingletonDemo demo2 = SingletonDemo.getInstance();

        System.out.println(demo1 == demo2);

        SingletonDemo2 demo3 = SingletonDemo2.getInstance();
        SingletonDemo2 demo4 = SingletonDemo2.getInstance();
        System.out.println(demo3 == demo4);

        SingletonExample1 singletonExample1 = SingletonExample1.getInstance();
        SingletonExample1 singletonExample2 = SingletonExample1.getInstance();
        System.out.println(singletonExample1 == singletonExample2);

        SingleExample2 singleExample1 = SingleExample2.getInstance();
        SingleExample2 singleExample2 = SingleExample2.getInstance();
        System.out.println(singleExample2 == singleExample1);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                int hashCode = SingleExample2.getInstance().hashCode();
//                System.out.println(hashCode);
                set.add(hashCode);
            }).start();
        }

        System.out.println(set.size() + "=" + set);
    }
}
