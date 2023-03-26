package stringBasic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethod3 {
    public static void main(String[] args) {

        String str = "water";
        //StartsWith(); return boolean

        boolean result1 = str.startsWith("w");
        System.out.println( result1 );//true

        System.out.println(str.startsWith("water"));//true
        System.out.println(str.startsWith("ter"));//false

        //endsWith(); return boolean

        System.out.println(str.endsWith("r"));//true, it has to be in "" cuz string
        System.out.println(str.endsWith("abc"));//false

        /*
        ASK: get a string from User via scanner and:
        -print:
	     - first char
	    - last char
	    - index of second matching letter 'c'
	    - length of string
	     - index of x
	     - middle char
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string value");

         String userInput = scanner.nextLine();//we use nextLine so has to be string

        System.out.println(userInput.charAt(0));//first char
        System.out.println(userInput.charAt(userInput.length() -1));//last char

        System.out.println(userInput.indexOf('c', userInput.indexOf('c')+1));//second c index number
                                                    //cuz we need to know the first c index number

        System.out.println(userInput.length());//length

        System.out.println(userInput.indexOf('x'));// index of x

        System.out.println(userInput.charAt(userInput.length()/2));//middle char
        System.out.println("=====================");

        //contains();--->boolean

        str = "water";
        boolean b = str.contains("w");
        boolean b1 = str.contains("ter");

        System.out.println(b);//true
        System.out.println(b1);//true
        System.out.println(str.contains("ta"));//false

        System.out.println(str.startsWith("wat") != str.contains("ter"));//not equal true !=true , false

        //equals(); -->boolean

        System.out.println(str.equals("Water"));//false CUZ upper case W
        System.out.println(str. equals("WATER"));//false
        System.out.println(str.equals("water"));//true

        str += str.toUpperCase();

        System.out.println(str.toUpperCase());
        System.out.println(str.equals("WATER"));//false

        //equalsIgnoreCase(); boolean

        System.out.println(str.equalsIgnoreCase("WaTeR"));//TRUE
        System.out.println(str.equalsIgnoreCase("ater"));//false











    }
}
