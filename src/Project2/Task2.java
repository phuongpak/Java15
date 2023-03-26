package Project2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Write a program that will accept 5 digits number and will print reversed number at the end.
        example, 53876
        the output is 67835
        example2, 97352, output is 25379

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
        System.out.println("the reversed number is " + digit1 + digit2 + digit3 + digit4 + digit5);


    }
}
