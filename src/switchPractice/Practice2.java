package switchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        /*
        get an integer number from user
        if the number is 1 --> It is IT department"
        2 ----> It is HR department
        3---> Help Desk
        4---> Accounting
        cover for invalid choices as well

         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer number");
        int number = input.nextInt();

        switch(number){
            case 1:
                System.out.println("It is IT department");
                break;
            case 2:
                System.out.println("It is HD department");
                break;
            case 3:
                System.out.println("It is Help desk");
                break;
            case 4:
                System.out.println("Accounting");break;
            default:
                System.out.println("invalid choices");

        }





    }
}
