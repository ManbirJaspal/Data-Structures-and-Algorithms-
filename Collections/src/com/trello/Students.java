package com.trello;

public class Students {

    public static void main(String[] args) {

        Student st1 = new Student("sahib", 123);
        Student st2 = new Student( "sunny", 345);

        System.out.println("Student 1: " + st1.name + ", " + st1.rollno + "\n Student 2: " + st2.name + ", " + st2.rollno);
    }


}

class Student {

    String name;
    int rollno;

    Student( String name, int rollno) {
        this.rollno = rollno;
        this.name = name;
    }

}

