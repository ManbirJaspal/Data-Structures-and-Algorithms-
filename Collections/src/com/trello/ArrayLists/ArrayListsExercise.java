package com.trello.ArrayLists;
import java.util.ArrayList;
import java.util.Iterator;


class Cars {
    String name;
    String make;
    int modelNumber;
    String color;

    Cars(String name, String make, int modelNumber, String color) {
        this.name = name;
        this.make = make;
        this.modelNumber = modelNumber;
        this.color = color;
    }
}

public class ArrayListsExercise {

    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        //Adding elements
        strList.add("Hello");
        strList.add("World");
        strList.add("Doing");
        strList.add("Great");
        strList.add("Much");
        strList.add("?");

        //removing Elements

        strList.remove("Much");

        System.out.println(strList);

        //Looping over ArrayList

        for (String s: strList) {

            System.out.println(s);

        }

        //Creating ArrayList of object cars

        ArrayList<Cars> list = new ArrayList<>();

        //get an Iterator object for ArrayList using iterator() method.

        Iterator itr = list.iterator();

        list.add(new Cars("Accent", "Hyundai", 2, "Red"));
        list.add(new Cars("Aviator", "Benz", 3, "Black"));
        list.add(new Cars("Accord", "Honda", 243, "White"));
        list.add(new Cars("Blasphemy", "Kia", 3432, "Pink"));
        list.add(new Cars("Blues", "Devils", 23333, "Neon Green"));
        list.add(new Cars("Blame", "Hound", 223342, "Brown"));

        //Looping using Iterator itr
        for(Cars c: list){
            System.out.println(c.color + ", " + c.modelNumber + ", " + c.make + ", " + c.name  );
        }
    }
}


