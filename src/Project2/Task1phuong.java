package Project2;

import java.util.Scanner;

public class Task1phuong {

    public static void main(String[] args) {
        /* 578432
        multiplication : 6720
        sum: 29

         */

        Scanner number = new Scanner(System.in);

        System.out.println("please enter your digit number");
        int givenNumber = number.nextInt();

        int digit1 = givenNumber % 10;
        System.out.println(digit1);

        int number2 = givenNumber/10;
        System.out.println(number2);

        int digit2 = number2 %10;
        System.out.println(digit2);

        int number3 = number2/10;
        System.out.println(number3);

        int digit3 = number3 % 10;
        System.out.println(digit3);

        int number4 = number3/10;
        System.out.println(number4);

        int digit4 =  number4%10;
        System.out.println(digit4);

        int number5 = number4/10;
        System.out.println(number5);

        int digit5 = number5 %10;
        System.out.println(digit5);

        int digit6 = number5/10;
        System.out.println(digit6);

        int digitMultiple = digit1 * digit2*digit3 *digit4 *digit5*digit6;
        int sumDigits = digit1 + digit2 + digit3 + digit4 + digit5 +digit6;

        System.out.println(" Multiplication of all digit is " + digitMultiple);
        System.out.println(" The sum of al digits is " + sumDigits);

















    }
}
