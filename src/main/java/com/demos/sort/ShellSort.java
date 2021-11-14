package com.demos.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 10};
        shellSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shellSort(int[] arr) {
        int len = arr.length;
        for (int step = len / 2; step > 0; step /= 2) {
            int temp, j;
            for (int i = step; i < len; i++) {
                j = i;
                temp = arr[i];
                while (j - step >= 0 && arr[j - step] > temp) {
                    arr[j] = arr[j - step];
                    j -= step;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static int[] shellSort2(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;

        for (int step = len / 2; step > 0; step /= 2) {
            int temp, i;
            for (int j = step; j < len; j++) {
                temp = arr[j];
                i = j;

                while ((i - step) >= 0 && arr[i - step] > temp) {
                    arr[i] = arr[i-step];
                    i = i - step;
                }
                arr[i] = temp;
            }
        }
        return arr;
    }
}
