package com.company;
import java.util.Scanner;

public class devu_23_for_loop {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }

        // Write a program to print first n odd numbers using a for loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println(2*i+1);
        }
    }
}
