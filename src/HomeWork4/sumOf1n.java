package HomeWork4;

import java.util.Scanner;

public class sumOf1n {
    public static void main(String[] args) {
        /*
            Write a program to calculate the sum of following series where n is input by user.
    1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    Please just print out the result.


    Please look at the examples below carefully
    EXAMPLES
    Input  : 2
    Output : 1.5  -> Because 1+1/2 =1.5

    Input : 4
    Output: 2.083333333333333 -> Because 1+1/2+/1/3+1/4 = 2.083333333333333

    NOTE: Please use double variable.

         */
        Scanner input =  new Scanner(System.in);
        System.out.println("enter numbers of term of series");
        int number = input.nextInt();
        //or we can use
        //int number = new Scanner(System.in).nextInt();
        //i is going from 1 to n
   double result = 0;
    for( double i = 1; i <= number; i++){

            result += 1/i;

        }
        System.out.println(result);
    }

    }


