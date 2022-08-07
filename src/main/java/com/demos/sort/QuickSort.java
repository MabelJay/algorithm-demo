package com.demos.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 6, 9, 2, 5, 3, 7, 4, 8, 11};
        int[] arr = {4, 2, 1, 6, 8, 5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return;

        sort(arr, 0, len - 1);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left <= right) {
            int pivot = media3(arr, left, right);

            int i = left, j = right - 1;
            while (i < j) {
                while (arr[++i] < pivot) {
                }
                while (arr[--j] > pivot) {
                }

                if (i < j) {
                    swap(arr, i, j);
                } else {
                    break;
                }
            }
            swap(arr, i, right - 1);
            sort(arr, left, i - 1);
            sort(arr, i + 1, right);
        }
    }

    private static int media3(int[] arr, int left, int right) {
        int center = (left + right) / 2;
        if (arr[left] > arr[center]) {
            swap(arr, left, center);
        }
        if (arr[right] < arr[left]) {
            swap(arr, left, right);
        }
        if (arr[right] < arr[center]) {
            swap(arr, right, center);
        }

        swap(arr, center, right - 1);
        return arr[right - 1];
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
