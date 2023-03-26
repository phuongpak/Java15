package scannerPractice;

import java.util.Scanner;

public class davidPractice {
    public static void main(String[] args) {

        /*
        David wants to deposit his money into his bank account
        he already got $200 in his account
        he got three paychecks (480,600, and 350)
        he can only deposit one paycheck at a time
        after he got his money in the ac.
        he bought a phone for $599 and headphone for $299
        calculate his final money in his acc.
        open a new class under scanner package and name it as moneyTransaction

         */

        Scanner david = new Scanner (System.in);
        double balance = 200;

        System.out.println("please enter your first paycheck ");
        double paycheck1 = david.nextDouble();
        balance = balance + paycheck1;

        System.out.println("please enter your second paycheck");
        double paycheck2 = david.nextDouble();
        balance += paycheck2;

        System.out.println("please enter your third paycheck");
        double paycheck3 = david.nextDouble();
        balance +=paycheck3;

        System.out.println(" enter phone price here");
        double phone = david.nextDouble();
        balance-=phone;

        System.out.println("enter your headphone price");
        double headphone = david.nextDouble();
        balance -= headphone;

        System.out.println("your final balance is "+ balance);





    }
}
