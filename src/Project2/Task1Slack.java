package Project2;

import java.util.Scanner;

public class Task1Slack {
    public static void main(String[] args) {
        /*
        Write a Java program that takes two numbers as input and display the product of two numbers. (use scanner)
        test data:
        input first number: 25
        input second number: 5
        output: 25 x 5 =125

         */

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first number here");

        int number1 = input.nextInt();
        System.out.println("Please enter the second number");
        int number2 = input.nextInt();

        int result = number1 * number2;
        System.out.println(" The product of two number is " + result);







    }
}
