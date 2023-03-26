package HomeWork3;

import java.util.Scanner;

public class printDivisible {
    public static void main(String[] args) {

    /*
            Using a scanner the user is asked to provide starting and ending numbers.
        Print how many numbers are divisible by 3 and 5 between starting number and ending number.


        EXAMPLE:
        First number: 5
        Second number: 65
        Output:
        4          //-> Because between 65 and 5 there are only 4 number divisible by 3 and 5 which
        //-> are 15 30 45 and 60 but in this task please do not print anything else just the
        // count of number which are divisible by 3 and 5.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a starting number");
        int startingNumber = scanner.nextInt();
        System.out.println("enter an ending number");
        int endingNumber = scanner.nextInt();



//or we can do for each loop
        int count = 0;
        for(;startingNumber < endingNumber; startingNumber++){
        if(startingNumber%3==0 && startingNumber % 5 ==0){
        count ++;
   }
    }
        System.out.println(count);

    }
}
