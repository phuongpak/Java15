package IfStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
         /*
        task:
        ask user to give you an integer number between 1 and 5
        print out day name for related number
        ex, input -->1 --> monday
        2 --> tuesday
        3--> wednesday
        ..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an number between 1 and 5");
        int number = input.nextInt();

       if(number == 1){
           System.out.println("It is monday");
       }
       if(number == 2){
           System.out.println("It is tuesday");

       }
        if(number == 3){
            System.out.println("It is wednesday");

        }
        if(number == 4){
            System.out.println("It is thursday");

        }
        if(number == 5){
            System.out.println("It is Friday");

        }
        if(number > 5 || number < 1){
            System.out.println("There is no matching day for your entry");

        }
        /*
        task:
        get a string from user and check if the given string starts with letter 'h'
        and the length of the string is more than 10
        print--> "This is what I am looking for!"
         */
        System.out.println("please enter a string");
        input.nextLine();//or scanner  = new scanner() it works
        String str = input.nextLine();

        if(str.startsWith("h") && str.length() > 10 ){
            System.out.println("This is what I am looking for!");


        }














    }
}
