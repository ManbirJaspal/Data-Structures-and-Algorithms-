package com.trello.arrays;

public class Arrays {

    public static void main(String[] args) {
        //Way 1
        int arr[] = {1,2,3};
        //Way 2
        int arr2[] = new int[]{1,2};
        //Way 3
        int arr3[] = new int[3];

        arr3[0] = 4;
        arr3[1] = 5;


        //Looping

        //For Loop

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //For each loop

        for(int n: arr) {
            System.out.println(n);
        }

        //While loop
        int j = 0;
        while(j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }

        //Do while Loop
        int k = 0;
        do {
            System.out.println(arr[k]);
            k++;
        } while(k < arr.length);



    }






}
