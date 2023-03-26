package IfStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        get a single letter from user
        when the letter from the user is
        "M" or "m" --> it is monday
        "T" or "t" --> it is tuesday
        "W" or "w" --> it is wednesday
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a single letter here");

        char letter = input.nextLine().charAt(0);///PAY ATTENTION!!!!!!
        //since we take char so has to do data type char, cannot use string method



        if(letter =='M' || letter == 'm'){
            System.out.println("It is monday");

        }

        if (letter == 'T' || letter == 't'){
            System.out.println("It is either tuesday or thursday");
        }

        if (letter =='w' || letter == 'W'){
            System.out.println("It is Wednesday");
        }

        //cover the cases when the incoming letter is not one of the expected letter



        if(letter != 'M'&& letter != 'm'&& letter !='t' && letter !='T' && letter !='w'&& letter!='W'){

            System.out.println("invalid entry");
        }

        //following code will give compile time error cuz there is no boolean in the if parentheses
        //int number = 1234;
        //if(number){
           // System.out.println("Hello World");

        // or if (number = 1234)//it is not equal sign, has to be ==





    }
}
