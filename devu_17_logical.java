package com.company;

public class devu_17_logical {
    public static void main(String[] args) {
        System.out.println("For logical AND ..");
        boolean a = true;
        boolean b =true;
        boolean c = true;
        if (a && b && c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For logical OR..");
        if (a || b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
