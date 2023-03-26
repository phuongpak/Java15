package Project3;

import java.util.Scanner;

public class Task1Slack {

    public static void main(String[] args) {
        /*
        Take three numbers from the user and print the greatest number.
		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87
         */

        Scanner input = new Scanner(System.in);

        System.out.println("please enter first number");
        double number1 = input.nextDouble();

        System.out.println("please enter second number");
        double number2 = input.nextDouble();

        System.out.println("please enter third number");
        double number3 = input.nextDouble();

        if(number1 > number2 && number1 > number3){
            System.out.println("The greatest number is " + number1);
        } else if(number2 > number1 && number2 > number3){
            System.out.println("The greatest number is " + number2);

        }else {
            System.out.println("The greatest number is " + number3);
        }


    }

}
