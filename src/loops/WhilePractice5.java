package loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {


        /*
        get a positive number from user
        and create a multiplication table for given number for up to 10
        6----6*1 6, 6*2 = 12, 6*3.......,6*10 = 60
         */


        Scanner input = new Scanner (System.in);
        System.out.println("please enter a positive number");
        int number = input.nextInt();

        int number1 = 1;

        //number*number1

        while (number1<=10){
            int result = number*number1;
            System.out.println(result);
            System.out.println(number +" * " + number1 +" = " + number*number1);
            number1++;

        }





    }
}
