package com.company;
import java.util.Scanner;

public class devu_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 23:
                System.out.println("You are going to join job");
                break;
            case 60:
                System.out.println("You are going to get retrived");
                break;
            default:
                System.out.println("Enjoy your day");
        }

//        if (age>56){
//            System.out.println("You are experienced");
//        }
//        else if (age>46){
//            System.out.println("You are semi-experienced");
//        }
//        else if (age>36){
//            System.out.println("You are semi-semi-experienced");
//        }
//        else {
//            System.out.println("You are not experienced");
//        }


    }
}
