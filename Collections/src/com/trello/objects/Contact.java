package com.trello.objects;

public class Contact {
    int phoneNumber;
    String address;
    String firstName;
    String lastName;

    Contact(int phoneNumber, String address, String firstName, String lastName) {
        this.address = address;

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

        Contact arr[] = new Contact[2];
         arr[0] = new Contact( 678677071 ,"2451 lalal #41422", "Sunny", "Jaspal" );
         arr[1] = new Contact( 323239, "232323 jones street", "Sahib", "Jaspal");

         //for Loop
         for(int i = 0; i < arr.length; i++) {
             System.out.println("Contact " + i + ": \n First Name: " +  arr[i].firstName + "\n Last Name: "
                                + arr[i].lastName + "\n Address: " + arr[i].address + "\n Phone Number: "
                                + arr[i].phoneNumber);
         }
        // for Each Loop
        for (Contact s: arr) {
            System.out.println("First Name: " +  s.firstName + "\n Last Name: "
                    + s.lastName + "\n Address: " + s.address + "\n Phone Number: "
                    + s.phoneNumber);
        }

        //while Loop
        int j = 0;
         while(j < arr.length) {
             System.out.println("Contact " + j + ": \n First Name: " +  arr[j].firstName + "\n Last Name: "
                     + arr[j].lastName + "\n Address: " + arr[j].address + "\n Phone Number: "
                     + arr[j].phoneNumber);
             j++;
         }

         //Do while loop
        int k = 0;
        do {
            System.out.println("Contact " + k + ": \n First Name: " +  arr[k].firstName + "\n Last Name: "
                    + arr[k].lastName + "\n Address: " + arr[k].address + "\n Phone Number: "
                    + arr[k].phoneNumber);
            k++;
        }while(k < arr.length);
    }
}
