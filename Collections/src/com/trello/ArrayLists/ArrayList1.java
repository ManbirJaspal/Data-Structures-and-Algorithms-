package com.trello.ArrayLists;
import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

       ArrayList<String> stringList = new ArrayList<>();
       ArrayList<String> stringList2 = new ArrayList<>();

       //Adding to List
        stringList.add("abc");
        stringList.add("efg");
        stringList.add("hello");
        stringList.add("World");
        stringList.add("Beautiful");

        stringList2.add("abc");
        stringList2.add("efg");
        stringList2.add("hello");
        stringList2.add("World");
        stringList2.add("Sucks");


        System.out.println(stringList);
        System.out.println(stringList2);

        //Removing from List

        stringList.remove("abc");
        System.out.println(stringList);

        //Get method

        System.out.println(stringList.get(2));

        //remove common elements between two lists


        stringList2.removeAll(stringList);
        System.out.println(stringList2);
        System.out.println(stringList);

        //REtain method

        stringList.add("abc");
        stringList.add("efg");
        stringList.add("hello");
        stringList.add("World");
        stringList.add("Beautiful");

        stringList2.add("abc");
        stringList2.add("efg");
        stringList2.add("hello");
        stringList2.add("World");
        stringList2.add("Sucks");


        stringList.retainAll(stringList2);

        System.out.println(stringList);



    }
}
