package loops;

import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {

        /*
        get a positive number from user
        for that given number, create a star tree like following
        --->user enters --->5
        *
        **
        ***
        ****
        *****


         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive number" );
        int number = input.nextInt();
        String str = "*";//the bucket has on star already

        do{


            System.out.println(str);// print one star, then next step
            str = str.concat("*");// we want concat one more star so bucket become 2 stars
            number--;// then condition change, it will go down and check true or false

        }while (number > 0);// condition still true, go back line 28 print 1 star, and this star put in the bucket concat b
                             // become 3 stars, keep doing until condition false



    }
}
