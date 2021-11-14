package com.demos.others;

public class Gcd {

    public static void main(String[] args) {
        System.out.println(gcd(1989, 1590));

        System.out.println(pow(2, 62));
    }

    // 欧几里得算法得到最大公因数
    public static long gcd(long num1, long num2) {
        while (num2 != 0) {
            long rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num1;
    }

    // 幂运算
    public static long pow(long x, long n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (isEven(n)) {
            return pow(x * x, n / 2);
        } else return pow(x * x, n / 2) * x;
    }

    private static boolean isEven(long x) {
        return x % 2 == 0;
    }
}
