package HomeWork3;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {

    /*
    User will enter two string values using scanner.
If both string length is same, concatenate them together. Then, print the result.
If both string length is not same, omit the last chars from the longer string so it will be the same
length as the shorter string. After making both strings the same length,
concatenate them and print the result.

EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhon"
EXAMPLE-2:
String 1: "Cable"
String 2: "Mic"
Output: "CabMic"

     */


        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = s.next();

        System.out.println("Enter string 2");
        String str2 = s.next();
        // Please don't change anything on the lines above.
        // Which str is longer?
        boolean condition = str1.length() <= str2.length();
        // This condition will be true if the str1 is shorter than str2.
        //  This condition will be false if the str2 is shorter than str1.
        if (condition){
            System.out.println(str1 + str2.substring(0,str1.length()));//concat to string after the longer one cut the last char
            //substring(0,str1.length())--> cut from 0 inclusive and want to get the same length of str1
            //for ex, str1 = cell, str2 = phone, want to get length of str = 4, str2 length has to cut to str1 length
        }else {
            System.out.println(str1.substring(0,str2.length()) + str2);
        }







    }
}
