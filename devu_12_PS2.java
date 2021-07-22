package com.company;
import java.util.Scanner;

public class devu_12_PS2 {
    public static void main(String[] args) {
        // 1. What will be the result of the following expression:  float a = 7/4 * 9/2
//        float a = 7/4 * 9/2;
//        System.out.println(a);

        //2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        // 3. Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(num>10);

        //4.  Write the following expression in a java program:  (v^2-u^2)/2as
        int v = 4;
        int u = 6;
        int a = 3;
        int s = 1;
        int k = (v*2-u*2)/(2*a*s);
        System.out.println(k);


        //5. Find the value of 'a' in expression given below :  int x = 7 ;  int a = 7*49/7 + 35/7
        int x = 7;
        int b = 7*49/7 + 35/7;
        System.out.println(b);

    }
}
