package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter you name: ");
        String fullName = input.nextLine();

        //Method without using split function
        printName(fullName);

        //Using split in just one method
        printNameSplit(fullName);

        //Using the split function in three different methods
        System.out.println("---------------------");
        printFirstName(fullName);
        printMiddleName(fullName);
        printLastName(fullName);
    }

    public static void printName (String fullName) {
        String inputName = fullName.trim();

        int firstSpace = inputName.indexOf(" ");
        int lastSpace = inputName.lastIndexOf(" ");

        String firstName = "";
        String middleName = "";
        String lastName = "";

        if(firstSpace == lastSpace){
            firstName = inputName.substring(0, firstSpace);
            lastName = inputName.substring(firstSpace + 1);
        }else{
            firstName = inputName.substring(0, firstSpace);
            middleName = inputName.substring(firstSpace + 1, inputName.lastIndexOf(" "));
            lastName = inputName.substring(lastSpace + 1);
        }

        System.out.println("-----------------------------\n" +
                "First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);


    }
    public static void printNameSplit(String fullName){

        String name = fullName.trim();
        String[] nameSplit = name.split(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";

        if(nameSplit.length == 2){
            firstName = nameSplit[0];
            lastName = nameSplit[1];
        }else{
            firstName = nameSplit[0];
            middleName = nameSplit[1];
            lastName = nameSplit[2];
        }

        System.out.println("--------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }

    public static void printFirstName(String fullName){
        String name = fullName.trim();
        String[] nameSplit = name.split(" ");
        String firstName = nameSplit[0];

        System.out.println("First Name: " + firstName);
    }

    public static void printMiddleName(String fullName){
        String name = fullName.trim();
        String[] nameSplit = name.split(" ");
        String middleName = "";

        if (nameSplit.length == 3){
            middleName = nameSplit[1];
        }

        System.out.println("Middle Name: " + middleName);
    }

    public static void printLastName(String fullName){
        String name = fullName.trim();
        String[] nameSplit = name.split(" ");
        String lastName = "";

        if(nameSplit.length == 2){
            lastName = nameSplit[1];
        }else{
            lastName = nameSplit[2];
        }

        System.out.println("Last Name: " + lastName);
    }
}
