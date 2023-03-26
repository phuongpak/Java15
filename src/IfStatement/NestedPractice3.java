package IfStatement;

import java.util.Scanner;

public class NestedPractice3 {
    public static void main(String[] args) {

        /* do you know java
        testing tool - selenium
        APT testing
        SQL
        --> HIRED<--
        -->WE NEED SOMEONE WHO KNOWS JAVA!

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome ! Do you know any coding language ? yes/no");
        String answer = input.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("Do you know selenium ? yes/no");

            String selenium = input.nextLine().toLowerCase();
            if (selenium.equals("Yes")) {

                System.out.println("Do you know API testing?");

                String api = input.nextLine().toLowerCase();
                if (api.equals("Yes")) {
                    System.out.println("Do you know SQL ? yes or no");

                    String sql = input.nextLine().toLowerCase();
                    if (sql.equals("yes")) {
                        System.out.println("you are hired");

                    } else {
                        System.out.println("Please learn SQL");
                    }


                } else {
                    System.out.println("please learn Selenium");
                }


            } else {
                System.out.println("Please learn coding language first");
            }
        }
    }


}










