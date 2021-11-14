package com.demos.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 53, 58, 97};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int len = arr.length - 1;
        int beginIndex = (len - 1) >> 1;

        // build max heap
        for (int i = beginIndex; i >= 0; i--) {
            buildMaxHeap(arr, i, len);
        }

        for (int i = len; i > 0; i--) {
            swap(arr, 0, i);
            buildMaxHeap(arr, 0, i - 1);
        }

    }

    public static void buildMaxHeap(int[] arr, int index, int len) {
        int lIndex = (index << 1) + 1;
        int rIndex = lIndex + 1;

        int cMax = lIndex;
        if (lIndex > len) return;
        if (rIndex <= len && arr[rIndex] > arr[lIndex]) {
            cMax = rIndex;
        }
        if (arr[cMax] > arr[index]) {
            swap(arr, cMax, index);
            buildMaxHeap(arr, cMax, len);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
