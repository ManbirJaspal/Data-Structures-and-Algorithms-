package com.arrays;

public class Arrays_one {

    public static void main(String[] args) {
        int[] arr;

        arr = new int[5];

        arr[0] = 10;

        arr[1] = 2;

        for (int i = 0; i< arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i] );
        }

    }
}
