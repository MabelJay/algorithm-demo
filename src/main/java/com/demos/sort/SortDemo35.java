package com.demos.sort;

import java.util.Arrays;
import java.util.Random;

public class SortDemo35 {

    public static void main(String[] args) {
        int[] arr = getArr(10, 40);
        System.out.println(Arrays.toString(arr));
//        insertionSort(arr);
//        shellSort(arr);
//        bubbleSort(arr);
//        selectionSort(arr);
//        heapSort(arr);
//        mergeSort(arr);
//        quickSort1(arr);
        quickSort2(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr));
        System.out.println(binarySearch(arr, 11));
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void quickSort2(int[] arr) {
        if (arr == null || arr.length < 2) return;
        sort3(arr, 0, arr.length - 1);
    }

    public static void sort3(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = mediaOf3(arr, left, right);
            int i = left, j = right - 1;
            while (i < j) {
                while (arr[++i] < pivot) {

                }
                while (arr[--j] > pivot) {

                }

                if (i < j) swap(arr, i, j);
                else break;
            }
            swap(arr, i, right - 1);
            sort3(arr, left, i - 1);
            sort3(arr, i + 1, right);
        }
    }

    public static int mediaOf3(int[] arr, int left, int right) {
        int mid = (right - left) / 2 + left;

        if (arr[left] > arr[mid]) swap(arr, left, mid);
        if (arr[mid] > arr[right]) swap(arr, mid, right);
        if (arr[left] > arr[mid]) swap(arr, left, mid);

        swap(arr, mid, right - 1);
        return arr[right - 1];
    }

    public static void quickSort1(int[] arr) {
        if (arr == null || arr.length < 2) return;
        sort2(arr, 0, arr.length - 1);
    }

    public static void sort2(int[] arr, int left, int right) {
        if (left < right) {
            int i = left, j = right;
            int pivot = arr[left];
            while (i < j) {
                while (i < j && arr[j] >= pivot) {
                    j--;
                }

                arr[i] = arr[j];

                while (i < j && arr[i] <= pivot) {
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = pivot;
            sort2(arr, left, i);
            sort2(arr, i + 1, right);
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int[] tmpArr = new int[arr.length];
        sort1(arr, tmpArr, 0, arr.length - 1);
    }

    public static void sort1(int[] arr, int[] tmpArr, int left, int right) {
        if (left < right) {
            int mid = (right - left) / 2 + left;
            sort1(arr, tmpArr, left, mid);
            sort1(arr, tmpArr, mid + 1, right);
            merge(arr, tmpArr, left, mid + 1, right);
        }
    }

    public static void merge(int[] arr, int[] tmpArr, int leftIndex, int rightIndex, int rightEnd) {
        int leftEnd = rightIndex - 1;
        int num = rightEnd - leftIndex + 1;
        int tmpIndex = leftIndex;

        while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
            if (arr[leftIndex] < arr[rightIndex]) {
                tmpArr[tmpIndex++] = arr[leftIndex++];
            } else {
                tmpArr[tmpIndex++] = arr[rightIndex++];
            }
        }

        while (leftIndex <= leftEnd) {
            tmpArr[tmpIndex++] = arr[leftIndex++];
        }

        while (rightIndex <= rightEnd) {
            tmpArr[tmpIndex++] = arr[rightIndex++];
        }

        for (int i = 0; i < num; i++, rightEnd--) {
            arr[rightEnd] = tmpArr[rightEnd];
        }
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        int len = arr.length - 1;
        int beginIndex = (len - 1) / 2;

        for (int i = beginIndex; i >= 0; i--) {
            buildHeap(arr, i, len);
        }

        for (int i = len; i > 0; i--) {
            swap(arr, 0, i);
            buildHeap(arr, 0, i - 1);
        }
    }

    public static void buildHeap(int[] arr, int index, int len) {
        int l = 2 * index + 1;
        if (l > len) return;
        int cMax = l;
        int r = l + 1;

        if (r <= len && arr[r] > arr[l]) cMax = r;

        if (arr[cMax] > arr[index]) {
            swap(arr, index, cMax);
            buildHeap(arr, cMax, len);
        }
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void shellSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int j = step; j < arr.length; j++) {
                int temp = arr[j];
                int i = j - step;

                while (i >= 0 && arr[i] > temp) {
                    arr[i + step] = arr[i];
                    i -= step;
                }
                arr[i + step] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int j = 1; j < arr.length; j++) {
            int temp = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] > temp) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
        }
    }

    public static int[] getArr(int len, int maxVal) {
        int[] arr = new int[len];

        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(maxVal);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}
