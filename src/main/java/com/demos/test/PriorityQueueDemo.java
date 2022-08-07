package com.demos.test;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 7, 9, 10, 6};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int val : arr) {
            maxHeap.add(val);
        }

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
