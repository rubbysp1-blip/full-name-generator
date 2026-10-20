package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter you name: ");
        String fullName = input.nextLine();

        printName(fullName);
        printNameSplit(fullName);
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
            middleName = inputName.substring(firstSpace + 1);
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


        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
    }
}
