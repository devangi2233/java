package com.company;

public class devu_26_arrays {
    public static void main(String[] args) {
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 93;
        marks[3] = 95;
        marks[4] = 56;
        System.out.println(marks[4]);
       // System.out.println(marks[5]); throws an error

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];

        // 3. Declaration, memory allocation and initialization together
        int[] marks1 = {34, 70, 80, 50, 58};
        System.out.println(marks[1]);
    }
}
