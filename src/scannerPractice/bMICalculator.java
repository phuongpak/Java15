package scannerPractice;

import java.util.Scanner;

public class bMICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);///create name is Scanner
        System.out.println("we are about to calculate BMI for you, please enter your weight in kgs");

        double weight = scanner.nextDouble(); //take the name scanner
        System.out.println("Can you also enter your height in meters?");

        double height = scanner.nextDouble();// take the name scanner

        double bim = weight /(height * height);
        System.out.println("Your BMI result is " + bim);



    }
}
