package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you name");

        System.out.println("First Name: ");
        String firstName = input.nextLine();

        System.out.println("Middle Name: ");
        String middleName = input.nextLine();

        System.out.println("Last Name: ");
        String lastName = input.nextLine();

        System.out.println("Suffix: ");
        String suffix = input.nextLine();

        printFullName(firstName, middleName, lastName, suffix);

    }
    public static void printFullName(String firstName, String middleName, String lastName, String suffix){

        System.out.printf("%s %s %s %s", firstName, middleName, lastName, suffix);
    }

}
