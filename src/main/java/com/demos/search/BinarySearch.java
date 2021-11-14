package com.demos.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 10};
        System.out.println("num index is: " + binarySearch(arr, 1));
    }

    // arr is a sorted array, if targetNum is in this arr, then return it's index,else return -1
    public static int binarySearch(int[] arr, int targetNum) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > targetNum) {
                high = mid - 1;
            } else if (arr[mid] < targetNum) {
                low = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
