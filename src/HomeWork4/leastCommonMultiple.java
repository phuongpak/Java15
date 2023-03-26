package HomeWork4;

import java.util.Scanner;

public class leastCommonMultiple {
    public static void main(String[] args) {
        /*
            Please find the LCM(least common multiple) of two given integers.

    NOTE:  The LCM of two integers is the smallest positive integer
    that is perfectly divisible by both the numbers (without a remainder).
    Please look at example carefully.
    EXAMPLES:
    Input 1: 72
    Input 2: 120
    Output : 360

    Input 1: 24
    Input 2: 60
    Output : 120
         */
    //multiples of 72 are 72, 72 x 2 , 72 x3...
        //multiples of 120 are 120 x 1, 120 x2,.....
        //2 120 > 120
        //3 9 -> 9
        //3 7> 21 , we do not need to look for the bigger number than 7
        //6 12 --> 12
        // number1 and number2 are given above. Please find LCM for these two numbers.

        //first, need to find bigger number, using ternary operation

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int number1 = s.nextInt();
        System.out.println("Enter the number 2");
        int number2 = s.nextInt();

    int biggerNum = number1 > number2? number1:number2;
    for( ; ; biggerNum++){//use for loop , we do not have any condition
        if(biggerNum % number1 == 0 && biggerNum % number2 ==0){
            System.out.println(biggerNum);//when I find the number can divide == 0, we break the loop
            break; // number1 and number2 are given above. Please find LCM for these two numbers.


        }
        }

    }
}
