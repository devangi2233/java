package com.company;

public class devu_09_associativity {
    public static void main(String[] args) {
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        int z = (x-y)/2;
        System.out.println(z);

        int b = 4;
        int c = 2;
        int a = 1;
        int k = (b*b - (4*a*c))/(2*a);
        System.out.println(k);

    }
}
