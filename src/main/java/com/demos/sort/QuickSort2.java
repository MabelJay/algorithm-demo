package com.demos.sort;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 6, 9, 2, 5, 3, 7, 4, 8, 11};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return;

        sort(arr, 0, len - 1);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = arr[left];
            int i = left;
            int j = right;
            while (i < j) {
                while (i < j && arr[j] > pivot) {
                    j--;
                }
                arr[i] = arr[j];

                while (i < j && arr[i] < pivot) {
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = pivot;
            sort(arr, left, i);
            sort(arr, i + 1, right);
        }
    }
}
