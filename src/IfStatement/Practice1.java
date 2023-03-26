package IfStatement;

public class Practice1 {
    public static void main(String[] args) {

        int money = 100;

        int item$ = 250;//was 5o then change 250 if item is 250m condition is the statement in the {} not show
        System.out.println("First Print before if statement");

        if(money > item$){

            System.out.println("You are buying the item");


        }
        System.out.println("Another print AFTER if statement");

        int item2 = 99;

        if (money > item2){

            System.out.println("I am buying item2");

        }
        //you have another option as using your credit card if the money is not enough

        boolean cc = true;//compare below, false || true -> true
        if (money >item$ || cc == true){

            System.out.println("you are using 2 different option to buy ITEM");

        }
        /*
        task:
        ask user to give you an integer number between 1 and 5
        print out day name for related number
        ex, input -->1 --> monday
        2 --> tuesday
        3--> wednesday
        ..
         */


    }
}
