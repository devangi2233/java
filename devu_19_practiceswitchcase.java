package com.company;
import java.util.Scanner;
public class devu_19_practiceswitchcase {
    public static void main(String[] args) {
        //1. What will be the output of this program:
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }

        //2 . Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Maths : ");
        int m = sc.nextInt();
        System.out.println("Enter Your marks in Java   : ");
        int j = sc.nextInt();
        System.out.println("Enter your marks in DBMS : ");
        int d = sc.nextInt();
        System.out.println("Total marks : ");
        int t = m + j + d;
        System.out.println(t);
        System.out.println("percentage : ");
        float p = t * 100/300;
        System.out.println(p);
        if (p>=40 && m>=33 && j>=33 && d>=33 ){
            System.out.println("Congratulations, You have been promoted");
        }
        else {
            System.out.println("sorry,You are fail");
        }

        //4 . Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

            //5. Write a Java program to find whether a year entered by the user is a leap year or not.
            System.out.println("Enter the year : ");
            int year = sc.nextInt();
            if ((year % 4 == 0) && (year % 100 !=0) || (year %400 == 0)){
                System.out.println("Specified year is a leap year");
            }
            else {
                System.out.println("Specified year is not a leap year");
            }

            // 6.
        System.out.println("Enter the website : ");
            String website = sc.next();
            if (website.endsWith(".org")){
                System.out.println("This is organizational website : ");
            }
            else if(website.endsWith(".com")){
                System.out.println("This is comercial website");
            }
            else if(website.endsWith(".in")){
                System.out.println("This is an Indian website");
            }



        }

    }


