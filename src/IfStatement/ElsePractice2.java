package IfStatement;

import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {


        /*get a  integer number from user
        check and print out if the given number is positive number, negative number or zero

         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a integer number here");
        int number = input.nextInt();

        if(number == 0){
            System.out.println("the given number is zero");
        }else if (number > 0){
            System.out.println("the given number is positive");
        }else {
            System.out.println("the given number is negative");

        }
        //or we can do if < , if > and else for ==
        //if there is no curly bracket for else,it has to be multiples statements and
        // only first statement will be skip, show from second statement




    }
}
