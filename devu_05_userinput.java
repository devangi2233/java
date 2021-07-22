package com.company;
import java.util.Scanner; // importing the scanner class

public class devu_05_userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in); // Creating an object named "sc" of the Scanner class.
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();  // method to read from the keyboard
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is : ");
        System.out.println(sum);
        int x = 15; int y = 4;
        int result = x / y;
        System.out.println(result);



    }
}
