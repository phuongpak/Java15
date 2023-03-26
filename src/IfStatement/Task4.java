package IfStatement;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        get the amount of purchase from user as dollar amount
        when the amount is $1000  or more--> give user 20% of discount and show final payment amount after discount
        less than $1000 --> give user 5% discount and show final payment amount after discount applied

         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the amount of purchase");

        double money = input.nextDouble();
        int money1 = 1000;//or we dont need to have this line

        System.out.println("what is your state?");
       input.nextLine();//because we use the nextDouble line 17 as double data, so we need to have different line for string
       String state = input.nextLine();
        double tax = 0;

        if(state.equalsIgnoreCase("tx")||state.equalsIgnoreCase("texas")){

         tax = money * 0.045;

        }else{
            tax = money * 0.10;
        }

        if(money >= money1){

            double discount1 = money * 0.2;
            money = (money -discount1) + tax;
            System.out.println("your final payment after 20 % discount will be " +  money);



        }else{
            double discount2 = money * 0.05;
            money = (money - discount2) + tax;
            System.out.println("your final payment after 5 % discount will be "+  money);
        }

        /*charge some tax
        if shopping is happening in the state of tx
        charge 4.5 % tax and add it to the final payment
         */
        // do it together with task over







    }
}
