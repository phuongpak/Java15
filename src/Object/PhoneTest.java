package Object;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("What shape of phone are you looking for ?");
        String answer =  scanner.next();

        Phone firstPhone = new Phone(answer,"Blue",799, true);

        System.out.println("rectangle".equalsIgnoreCase(firstPhone.shape));
        firstPhone.call(123456789l);

    //create a method to check price of phone
        //if the price is under my budget, I will buy it

        double budget = 1000;
        //compare budget with firstPhone price
        System.out.println( budget > firstPhone.price);
        priceCheck(firstPhone,budget);

    }

    public static void priceCheck(Phone phone,double limit){
       if(phone.price < limit ){
           System.out.println("this is in your budget " + phone.color);
       }


    }



}
