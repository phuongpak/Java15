package HomeWork4;

import java.util.Scanner;

public class replaceWitha {
    public static void main(String[] args) {
        /*
                Using the scanner user is asked to provide a string value.
        Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
        Look at example below carefully

        For example:
        Input: Success
        Output:
        "auccess"//use substring from 1 and add a
        "aaccess"
        “aaacess”
        "aaaaess"
        "aaaaass"
        "aaaaaas"
        "aaaaaaa"
        “aaaaaaa”
         */
        Scanner input =  new Scanner (System.in);
        System.out.println("enter a string value");

        String str = input.nextLine();//success
        String a =  "a";

        for(int i = 1; i <= str.length(); i++){


            System.out.println(a + str.substring(i));
            a+="a";
        }










    }
}
