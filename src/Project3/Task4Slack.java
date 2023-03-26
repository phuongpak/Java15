package Project3;

import java.util.Scanner;

public class Task4Slack {
    public static void main(String[] args) {
        /*
        Write a program to check whether an entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         */
//how to make user only type one, they cannot type the second letter



        Scanner input = new Scanner(System.in);
        System.out.println("enter one character here ");
        String letter = input.next();

        if(letter == letter.toLowerCase()){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }








    }
}
