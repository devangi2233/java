package com.company;

public class devu_29_PS6 {
    public static void main(String[] args) {
        //1. Create an array of 5 floats and calculate their sum.
        float[] marks = {45.7f, 67.3f, 56.8f, 80.9f, 60.9f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        //2. Write a program to find out whether a given integer is present in an array or not.
        int[] num = {78, 90, 50, 30, 45, 60, 79};
        int num1 = 60;
        boolean isInArray = false;
        for (int element : num) {
            if (num1 == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }

        //3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        System.out.println("The value of average mark is  "+ sum/marks.length);
        //4. Create a Java program to add two matrices of size 2x3.
        int  [][] mat1 = { {1,2,3},{4,5,6 }};
        int [][] mat2 = {{3,5,8},
                         {2,9,4}};

        int [][] result = {{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for (int j=0;i<mat1[i].length;j++){
                System.out.format("setting");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

    }
}


