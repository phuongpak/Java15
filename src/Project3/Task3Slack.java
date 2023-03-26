package Project3;

import java.util.Scanner;

public class Task3Slack {
    public static void main(String[] args) {

    /*
    A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
     If employee has been working more than 10 years, company will give 10% bonus.
        If Employee has more than 15 years, they will get 20% bonus.
        Ask user for their salary and year of service and print the net bonus amount.

     */

        Scanner input = new Scanner(System.in);
        System.out.println("How much is your salary ?");
        double salary = input.nextDouble();
        System.out.println("How long have you worked here ?");
        double yearOfService = input.nextDouble();

        if (yearOfService > 5 && yearOfService <=10) {
            double netBonus1 = salary * 0.05;
            System.out.println("your net bonus will be " + netBonus1);
        }else if (yearOfService > 10 && yearOfService <=15) {
            double netBonus2 = salary * 0.1;
            System.out.println("your net bonus will be " + netBonus2);

        }else if (yearOfService > 15) {
                    double netBonus3 = salary * 0.2;
                    System.out.println("your net bonus will be " + netBonus3);

                } else {
                    System.out.println("you need to work more");
                }


            }
        }


