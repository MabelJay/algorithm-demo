package com.demos.algorithm;

public class FibCalculate {

    public static void main(String[] args) {
        int n = 5;
//        System.out.println(fib(n));
        System.out.println(fibonacci(n));
    }

    public static int fib(int n) {
        if (n <= 1) return 1;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) return 1;
        int last = 1;
        int nextToLast = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = last + nextToLast;
            nextToLast = last;
            last = temp;
        }
        return last;
    }
}
