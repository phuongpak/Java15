package HomeWork4;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        /*
        Write a Java program to check whether a given number is an armstrong number or not.
NOTE:
An Armstrong number, also known as narcissistic number,
is a number that is equal to the sum of the cubes of its own digits.

For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
Look at examples below carefully.

Test Data :
Input a number: 153
Expected Output :153 is an Armstrong number

Input a number: 230
Expected Output : 230 is not an Armstrong number

         */
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int reserve = number;
        // Find out if the number above is an Armstrong number.
        // i need to find evey digit of this number and sum of these digits
        //find all digit: number % 10 = last digit
        //number/10 = remove last digit
        //when the result of division is 0, stop
        //ex, 156, 156 % 10 --> 6 ...156 /10 --> 15
        //15 % 10 = 5, 15/10 = 1

        int sum = 0;

        for ( ;number > 0; number=number/10){//156 % 10 take 6 first,
            // then update condition 156/10 take 15 then use 15 %10 take 5

           int digit = number%10; //last digit
           //need to find cute of digit
            int cute = digit * digit * digit;
            sum += cute;
       }

    if(sum == reserve){
        System.out.println(reserve + " is an Armstrong number");
    }else{
        System.out.println(reserve + " is not an Armstrong number");
    }











    }
}
