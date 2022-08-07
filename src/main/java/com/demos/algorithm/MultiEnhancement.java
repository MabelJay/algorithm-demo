package com.demos.algorithm;

public class MultiEnhancement {

    public static void main(String[] args) {
        // calculate 2^16

        long startTime = System.currentTimeMillis();
        System.out.println(new MultiEnhancement().cal1(2, 63));
        System.out.println("method1 spend: " + (System.currentTimeMillis() - startTime));
        long endTime = System.currentTimeMillis();
        System.out.println(new MultiEnhancement().cal2(2, 63));
        System.out.println("method2 spend: " + (System.currentTimeMillis() - endTime));
        long endTime2 = System.currentTimeMillis();
        System.out.println(Math.pow(2, 63));
        System.out.println("standard method spend: " + (System.currentTimeMillis() - endTime2));
    }

    public long cal1(int n, int m) {
        if (n == 0 || n == 1) return n;
        long res = n;
        for (int i = 1; i < m; i++) {
            res *= n;
        }
        return res;
    }

    public long cal2(int n, int m) {
        if (n == 0 || n == 1) return 0;
        long res = 1;
        long temp = n;
        for (; m != 0; m >>= 1) {
            if ((m & 1) == 1) {
                res *= temp;
            }
            temp *= temp;
        }
        return res;
    }
}
