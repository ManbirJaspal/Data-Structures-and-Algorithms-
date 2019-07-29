package com.trello.arrays;

public class charArray {

    public static void main(String[] args) {
        char arr[] = new char[3];

        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';

        //For Loop
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //for each Loop
        for(char k: arr) {
            System.out.println(k);
        }

        //while loop
        int j = 0;
        while(j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }

        //do While loop
        int p = 0;
        do {
            System.out.println(arr[p]);
            p++;
        }while(p < arr.length);
    }

}
