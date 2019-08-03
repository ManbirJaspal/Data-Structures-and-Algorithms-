package com.trello.ArrayLists;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit) {
            System.out.println("Enter a choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstruction();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print List.");
        System.out.println("\t 2 - To add.");
        System.out.println("\t 3 - To modify.");
        System.out.println("\t 4 - To remove.");
        System.out.println("\t 5 - To search.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter grocery item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Please enter grocery item number to modify: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);

    }

    public static void removeItem() {
        System.out.print("Please enter grocery item number to remove: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    public static void searchForItem() {
        System.out.print("Please enter grocery item to search: ");
        String searchItem = scanner.nextLine();

        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our groceryList");
        } else {
            System.out.println(searchItem + " doesnt exist in shopping list");
        }
    }
}
