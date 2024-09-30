package com.ps;
import java.util.Scanner;
public class FullNameApplication {

    public static Scanner scanny = new Scanner(System.in);
    public static void fullNameGenerator(){
        String firstName, middleName, lastName, suffix;
        System.out.println("First name: ");
        firstName = scanny.nextLine();
        firstName = firstName.trim();
        System.out.println("Middle name: ");
        middleName = scanny.nextLine();
        middleName = middleName.trim();
        System.out.println("Last name: ");
        lastName = scanny.nextLine();
        lastName = lastName.trim();
        System.out.println("Enter suffix if you have one:  ");
        suffix = scanny.nextLine();
        suffix = suffix.trim();
        System.out.println(firstName + " " + middleName + " " + lastName +", "+ suffix);
    }
    public static void main(String[] args) {
        fullNameGenerator();

    }
}
