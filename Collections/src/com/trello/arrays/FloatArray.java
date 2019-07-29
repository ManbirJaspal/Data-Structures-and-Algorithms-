package com.trello.arrays;

public class FloatArray {

    public static void main(String[] args) {
        float[] farr = {1.2f, 1.3f, 1.4f};

        //for loop
        for(int i = 0; i < farr.length; i++) {
            System.out.println(farr[i]);
        }

        //for each loop
        for(float f: farr) {
            System.out.println(f);
        }

        //while loop
        int j = 0;
        while(j < farr.length){
            System.out.println(farr[j]);
            j++;
        }

        //do while loop
        int k = 0;
        do {
            System.out.println(farr[k]);
            k++;
        }while (k < farr.length);
    }
}
