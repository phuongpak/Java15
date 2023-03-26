package Primitives;

import java.sql.SQLOutput;

public class RemainderPractice3 {

    public static void main(String[] args) {

       int numberOfCars = 10;

       int numberOfPartners = 3;

       //how many cars each person will get?

        int eachPerson =  numberOfCars / numberOfPartners;// store value in variable eachperson
        System.out.println(eachPerson);

        //how many cars will be left over?

       int leftOverCars =  numberOfCars % numberOfPartners;

        System.out.println(leftOverCars);

        /* tv, 465 dollars --> each months pay 50 dollar --> find last month' payment

       */

        int priceOfTv = 465;
        int paymentEachMonth = 50;
        int lastMonthPayment = priceOfTv % paymentEachMonth;
        System.out.println(lastMonthPayment);//15 dollar leftover
        System.out.println(priceOfTv/paymentEachMonth);// 9 times payments

        // tv2 = 465.50
         double tv2 = 465.50;
         double eachMonth2 = 50;

        System.out.println(tv2 % eachMonth2);




    }


}

