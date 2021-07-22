package com.company;

public class devu_27_arrays_method {
    public static void main(String[] args) {
        int [] marks = {90, 70, 40, 30};
        float [] mark1 = {98.7f, 60, 40.8f , 98.9f, 43};
        String [] student = {"Devangi", "komal"};
        System.out.println(student.length);
        System.out.println(marks.length);
        System.out.println(mark1[0]);

        // Displat the array(for loop
        System.out.println("Printing using for loop");
        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //reverse order
        System.out.println("Printing using for loop in reverse order");
        for (int i =mark1.length - 1 ; i>=0; i--){
            System.out.println(mark1[i]);

        }

        // display the array (for each loop)
        System.out.println("Printing using for each loop");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
