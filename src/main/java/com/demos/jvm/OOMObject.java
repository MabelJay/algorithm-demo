package com.demos.jvm;

import java.util.ArrayList;
import java.util.List;

public class OOMObject {
    public byte[] placeholder = new byte[1024 * 64];

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(100);
            list.add(new OOMObject());
        }
        System.gc();
        System.out.println("done");
        Thread.sleep(10000);
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
        System.gc();
    }
}