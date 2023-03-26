package IfStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedPractice2 {
    public static void main(String[] args) {
        /*
        task:
        ask for city
        if the city is -->chicago, then this person
        *what is your school name?
        if the school is techtorial -->you are lucky to have EFE!
        if the city is not Chicago --> please come to Chicago and visit us
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What city do you live now ?");//let user know what data to give
        String city = input.nextLine();//after create scanner, we create this line to use it
       //or we can use next line is city = city.to upper or lowercase

        if(city.equalsIgnoreCase("Chicago")) {

            System.out.println("what is your school name?");//use scanner one more time
            String school = input.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("you are lucky to have EFE");

            } else {
                System.out.println("please come to visit techtorial");
            }

        }else if(city.equalsIgnoreCase("Miami")){
            System.out.println("you should be attending campus");

        }else{
            System.out.println("please come to chicago and visit us");
        }

// LET SAY IF the city name is "Miami"-->you should be attending campus, do from line 34-35, or we can put all if from beginning
        //to 31 line, put all in between else if, no need to change name school cuz the second school is local nam
    }
}
