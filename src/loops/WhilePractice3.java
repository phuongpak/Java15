package loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {

        /*
        get number from user and find the positive divisor of the given number
        user 10 --> find which number that 1o can divide ex, 1,2,5,10
         */


        Scanner input =  new Scanner(System.in);
        System.out.println("please enter a number");

        int number = input.nextInt();
        int divisor = 1;
//number%divisor == 0
       while(divisor<=number){
          // number%divisor == 0
           if(number%divisor == 0) {
               System.out.println(divisor);
           }

           divisor++;
       }




    }
}
