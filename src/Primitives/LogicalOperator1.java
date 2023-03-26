package Primitives;

import java.sql.SQLOutput;

public class LogicalOperator1 {
    public static void main(String[] args) {
        //travel --> passport, ticket (need both together)

        //yes, i have passport, no i haven't
        boolean passport = true;
        boolean ticket = true;

        boolean travel = passport && ticket;
        System.out.println(" Can travel ? " + travel);//true

        boolean passport1 = false;
        boolean ticket1 = true;

        boolean travel1 = passport1 && ticket1;
        System.out.println(" Can travel ? " + travel1);//true

        //party --> dressCode and age
        boolean dressCode = true;
        boolean age = true;
        boolean party = dressCode && age;
        System.out.println(" Can go to  party ? " + party);


        //there is an event for kids and they allow if the age of child is between 12 and 16 ( range)
        //how many variable needs?

        int kidAge = 15;
        int lowerLimit = 12, upperLimit = 16;
        boolean happyToPlay = kidAge > lowerLimit && kidAge < upperLimit;
        System.out.println(happyToPlay);

        //parent want to come together for a family dinner
        //but kids who are age of 12  (inclusive) to 18 (exclusive) do not want to go with them
        //adults and younger kids are together
        // 5 years old with parents or not?

        int kidAge1= 5;//any age can change from 12-18
        int lowerLimit1 = 12, upperLimit1 = 18;

       boolean withAdult =  kidAge1 <= lowerLimit1 ||  kidAge1 >= upperLimit1;
        System.out.println(withAdult);//

        // || OR NOW

        // want to buy something, using cash or card

        boolean cash = false, card = true, buy;

        buy = cash || card;
        System.out.println( " Buy " + buy);

        //travel >> need to have ID ( passport or government Id), visa, ticket, money (more than $5000)

        boolean passport2 = true, govID = true, visa1 = true, ticket2 = ticket;
        double myMoney = 1000, moneyLimit = 5000;

        boolean result1 = passport2 || govID;
        boolean resultMoney = myMoney > moneyLimit;
        boolean result2 =  result1 && visa1 &&ticket2 &&resultMoney;

        boolean fly = (passport2 || govID) && visa1 && ticket2 && (myMoney > moneyLimit);
        System.out.println("can fly " + fly); // false cuz money is 1000, if mymoney is 5001 then is true

        System.out.println( true || false && false);// true
        System.out.println(true && false ||false); //false
        System.out.println((true ||false) && false); //false

        System.out.println( 'B' + 2 == 3 * 'C' || !true && 'C' < 'B' /3);
        // do == first then compare, 'C' < 'B' /3 is false, 'B' + 2 == 3 * 'C' is false













    }
}
