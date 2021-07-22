package com.company;

import java.util.Scanner;

public class devu_07_PS1 {
    public static void main(String[] args) {
        // Write a program to sum three numbers in Java.
        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.println(sum);

        //    Write a program to calculate CGPA using marks of three subjects (out of 100)
        float sub1 = 98;
        float sub2 = 97;
        float sub3 = 99;
        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.println(cgpa);

    // Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("Hello " + a  + " have a good day!");

    // Write a Java program to convert Kilometers to miles.
        double kiloMeters,miles;
        double conversionFactor = 1.609344;
        System.out.println("Enter distance value in Kilometers : ");
        Scanner input = new Scanner(System.in);
        kiloMeters = input.nextDouble();
        miles = kiloMeters / conversionFactor;
        System.out.println("The distance in Miles : " + miles);

    // Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());



    }

}
