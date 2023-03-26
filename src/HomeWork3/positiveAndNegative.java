package HomeWork3;

import java.util.Scanner;

public class positiveAndNegative {
    public static void main(String[] args) {

    /*
            Using scanner user provided an integer number.Please write a code that
        prints whether it is positive or negative.

        Example
        Input number:
        35
        Output:
        positive
        Input number:
        -3
        Output:
        negative
     */

        Scanner scan = new Scanner (System.in);
        System.out.println("please enter an integer number");
        int number = scan.nextInt();

        if(number > 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }


    }
}
