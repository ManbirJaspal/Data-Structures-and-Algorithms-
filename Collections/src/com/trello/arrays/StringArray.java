package com.trello.arrays;

public class StringArray {

    public static void main(String[] args) {

        String[] sarr = {"Hello", "whaddup", "ki haal chal"};

        //for loop
        for(int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }

        //for each loop
        for(String s: sarr) {
            System.out.println(s);
        }

        //while loop
        int j = 0;
        while(j < sarr.length){
            System.out.println(sarr[j]);
            j++;
        }

        //do while loop
        int k = 0;
        do {
            System.out.println(sarr[k]);
            k++;
        }while (k < sarr.length);
    }

}
