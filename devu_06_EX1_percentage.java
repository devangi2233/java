package com.company;

import java.util.Scanner;

public class devu_06_EX1_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DBMS I marks : ");
        int dbms = sc.nextInt();
        System.out.println("Enter Maths marks    : ");
        int maths = sc.nextInt();
        System.out.println("Enter Python marks   : ");
        int PP = sc.nextInt();
        System.out.println("Enter OOP marks      : ");
        int oop = sc.nextInt();
        System.out.println("Enter WP marks        : ");
        int wp = sc.nextInt();
        int sum =  dbms + maths + PP + oop + wp ;
        System.out.println("Total marks : ");
        System.out.println(sum);
        float percentage = ((sum * 100)/500);
        System.out.println("Percentage is : ");
        System.out.println(percentage);

    }
}
