package Ternary;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /*
        ask user for favorite fruit
        strawberry, mango,apple,grape, banana
       "we have your favorite fruit...."
       "Sorry! we do not your favorite fruit.....(name)"
         */

        Scanner input = new Scanner (System.in);
        System.out.println("what is your favorite fruit ?");
        String fruit = input.nextLine().toUpperCase();

        switch(fruit){
            case "MANGO":
            case " APPLE" :
            case "GRAPE":
            case "BANANA":
            case "STRAWBERRY" :

               System.out.println("We have your favorite fruit " + fruit);
               break;
            default:
                System.out.println("Sorry! we do not your favorite fruit" + fruit);


        }





    }
}
