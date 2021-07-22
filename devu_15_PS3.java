package com.company;

import java.util.Locale;

public class devu_15_PS3 {
    public static void main(String[] args) {
        // 1. Write a Java program to convert a string to lowercase.
        String name = "I Am Devangi";
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        //2. Write a Java program to replace spaces with underscores.
        String rep = name.replace(" ", "_");
        System.out.println(rep);

        //3. Write a Java program to fill in a letter template which looks like below: letter = “Dear <|name|>, Thanks a lot”
        //Replace <|name|> with a string (some name)

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Devangi");
        System.out.println(letter);

        //4.Write a Java program to detect double and triple spaces in a string.

        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //5. Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”

        String myLetter = "Dear Devangi,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
