package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello world");
//        int num1, num2, num3, sum;
//        num1 = 4;
//        num2 = 5;
//        num3 = 6;
//        sum = num1 + num2 + num3;
//        System.out.println(sum);
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        double d = scan.nextDouble();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }
}