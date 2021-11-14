package com.demos.others;

public class HashDemo {

    public static void main(String[] args) {
        System.out.println("hash value is: " + hash("world", 13));
    }

    public static int hash(String key, int tableSize) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }
        hashVal = hashVal % tableSize;
        if (hashVal < 0) {
            hashVal += tableSize;
        }

        return hashVal;
    }
}
