package com.company;

public class devu_24_break_continue {
    public static void main(String[] args) {
        // Break and continue uusing loop
        for (int i =0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i == 2){
                System.out.println("Ending the loop");
                break;
            }

        }


        for (int j = 0; j<10; j++){
            System.out.println(j);
            if(j == 3){
                System.out.println("Ending the loop : ");
                continue;
            }
        }
    }
}
