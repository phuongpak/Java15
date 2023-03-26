package Project4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max
number. Write a java code that will calculate the sum of
numbers between the range of min and max and those that
can only be divided by 3 and 11.
(min and max numbers are included)

Example:

0, 120 -> 33 + 66 + 99 = 198
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("enter a min number");
        int min = scan.nextInt();
        System.out.println("enter a max number");
        int max = scan.nextInt();

        int sum = 0;

        for(int i =  min; i <= max; i++){
            if(i % 3 == 0 && i % 11 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of numbers is : " + sum);


    }
}
