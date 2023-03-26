package IfStatement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have your driver license? yes/or");
        String answer= input.next();



        if(answer.equalsIgnoreCase("yes") ){
            System.out.println("you are great");
        }else{
            System.out.println("DMV is next door, please visit");
        }



    }
}
