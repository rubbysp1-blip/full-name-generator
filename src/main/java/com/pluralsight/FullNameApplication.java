package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you name");

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Suffix: ");
        String suffix = input.nextLine();

        printFullName(firstName, middleName, lastName, suffix);

    }
    public static void printFullName(String firstName, String middleName, String lastName, String suffix){

        String firstName1 = firstName.trim();
        String middleName1 = middleName.trim();
        String lastName1 = lastName.trim();
        String suffix1 = suffix.trim();

        String fullName = "";

        if (!firstName1.isEmpty()){
            fullName += firstName1;
        }
        if(!middleName1.isEmpty()){
            fullName += " " + middleName1;
        }
        if(!lastName1.isEmpty()){
            fullName += " " + lastName1;
        }
        if(!suffix.isEmpty()){
            fullName += ", " + suffix1;
        }

        System.out.print("Full Name: " + fullName);


//        if(middleName.isEmpty()){
//            System.out.printf("------------------------\n" +
//                    "Full Name: %s %s %s", firstName1, lastName1, suffix1);
//        }else if(suffix.isEmpty()){
//            System.out.printf("------------------------\n" +
//                    "Full Name: %s %s %s", firstName1, middleName1, lastName1);
//        }else{
//            System.out.printf("------------------------\n" +
//                    "Full Name: %s %s %s %s", firstName1, middleName1, lastName1, suffix1);
//        }





    }

}
