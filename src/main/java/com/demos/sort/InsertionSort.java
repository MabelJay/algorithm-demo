package com.demos.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 9, 7};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;

        int temp, i;
        for (int j = 1; j < len; j++) {
            temp = arr[j];
            i = j - 1;

            while (i >= 0 && arr[i] > temp) {
                arr[i + 1] = arr[i];
                i--;
            }

            arr[i + 1] = temp;
        }
        return arr;
    }
}
