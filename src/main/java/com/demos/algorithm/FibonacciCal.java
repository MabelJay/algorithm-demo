package com.demos.algorithm;

import java.util.Arrays;

public class FibonacciCal {
    public static void main(String[] args) {
        // 1,1,2,3,5,8,13
        long curTime = System.currentTimeMillis();
        System.out.println(new FibonacciCal().fib(40));
        long endTime1 = System.currentTimeMillis();
        System.out.println("total spend: " + (endTime1 - curTime));

        System.out.println(new FibonacciCal().fib2(40));
        long endTime2 = System.currentTimeMillis();
        System.out.println("method2 spend: " + (endTime2 - endTime1));

        System.out.println(new FibonacciCal().fib3(40));
        System.out.println("method3 spend: " + (System.currentTimeMillis() - endTime2));

        System.out.println(new FibonacciCal().fib4(40));
    }

    // first method
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // second method
    public int fib2(int n) {
        if (n <= 0) return n;
        if (n == 1 || n == 2) return 1;

        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
//        System.out.println(Arrays.toString(arr));
        return arr[n - 1];
    }

    public int fib4(int n) {
        if (n <= 0) return n;
        if (n == 1 || n == 2) return 1;
        int preToLast = 1, pre = 1;
        for (int i = 3; i <= n; i++) {
            int temp = pre + preToLast;
            preToLast = pre;
            pre = temp;
        }
        return pre;
    }

    // third method
    public int fib3(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;

        int[][] base = {{1, 1}, {1, 0}};

        int[][] res = matrixPower(base, n - 2);

        return res[0][0] + res[1][0];

    }

    public int[][] matrixPower(int[][] matrix, int n) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }

        int[][] tmp = matrix;
        for (; n != 0; n >>= 1) {
            if ((n & 1) == 1) {
                res = multiplyMatrix(res, tmp);
            }
            tmp = multiplyMatrix(tmp, tmp);
        }
        return res;
    }

    public int[][] multiplyMatrix(int[][] matrix, int[][] matrix2) {
        int[][] res = new int[matrix.length][matrix2[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    res[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        return res;
    }
}
