package loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        /*
        use do-while to solve
        get to positive integer numbers from user and find the sum of the range
        ex, 2-7 --> 3 + 4 + 5 + 6 = 18
         */


        Scanner input = new Scanner(System.in);

            System.out.println("enter two positive integer numbers here");
            int number1 = input.nextInt();
            int number2 =  input.nextInt();
            number1 = number1+1;// if number is 2, start from 3,
            int sum = 0;


            do{
                sum = sum + number1;
                number1++;

            }while(number1< number2);
        System.out.println(sum);



    }
}
