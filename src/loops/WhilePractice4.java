package loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        you/user have $100
        ask user how much is the spending amount
        if the spending amount is less than balance keep asking user and let him/her to spend more
        if the spending amount is greater than the balance --> y"you do not have enough money to spend!"

         */


        Scanner input = new Scanner (System.in);
        int money = 100;
        System.out.println("I have $100 to spend.How much do you want to spend?");
        int spend = input.nextInt();

        while(money > 0){

            money = money - spend;//this is update condition
            if(money > 0){
                System.out.println("your balance is " + money +"how much do you want to spend more ?");
                spend = input.nextInt();
            }else{
                System.out.println("your balance is "+ money + " after this spending .You don't have enough money now");
            }



        }





    }
}
