package Project2;

import java.util.Scanner;

public class Task1Group {
    public static void main(String[] args) {

        /* write a program that will accept only 6 digit numbers like 578432 and find multiplication
        of all digits and sum of all digits
        multiplication of all digits is  6720
        the sum of all digits is 29

         */
        Scanner number = new Scanner (System.in);

        System.out.println("Please enter your 6 digits numbers");
        int givenNumber = number.nextInt();

        int digit1 = givenNumber % 10;
        System.out.println(digit1);
        givenNumber = givenNumber/10;

        int digit2 = givenNumber %10;
        System.out.println(digit2);
        givenNumber = givenNumber/10;

        int digit3 = givenNumber%10;
        System.out.println(digit3);

        givenNumber =  givenNumber/10;
        int digit4 = givenNumber % 10;
        System.out.println(digit4);


        givenNumber =  givenNumber/10;
        int digit5 = givenNumber % 10;
        System.out.println(digit5);

        givenNumber =  givenNumber/10;
        int digit6 = givenNumber % 10;
        System.out.println(digit6);

        System.out.println("Multiplication of all digits is " + (digit1 * digit2 * digit3 * digit4* digit5*digit6));
        System.out.println("The Sum of all digit is " + (digit1 + digit2 + digit3 + digit4+ digit5 + digit6));

    }
}
