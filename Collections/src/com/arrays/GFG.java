package com.arrays;

 class Student {

    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class GFG {

    public static void main(String[] args) {
        Student[] arr;

        arr = new Student[5];

        arr[0] = new Student(1001, "sunny");
        arr[1] = new Student(1002, "nlasy");
        arr[2] = new Student(1054, "sunnsdfsdfy");
        arr[3] = new Student(1006, "sungggny");
        arr[4] = new Student(1007, "shhhunny");

        for (int i = 0; i <arr.length; i++) {
            System.out.println("Roll no. : " + arr[i].roll_no + " name: " + arr[i].name);
        }

    }
}


