package HomeWork4;

import java.util.Scanner;

public class highestCommonFactor {
    public static void main(String[] args) {
        /*
            Write a java program to find HCF (Highest Common Factor) of two numbers.

    Test Data :
    Input 1: 24
    Input 2: 28
    Expected Output : 4  -> Because HCF of 24 and 28 is 4
    Input 1: 75
    Input 2: 45
    Expected Output : 15  -> Because HCF of 75 and 45 is 15



    NOTE : Highest Common Factor means biggest common divident of two number.

         */
        //we need to find common divident for both of these numbers
        //we need to find the biggest one



        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = input.nextInt();
        System.out.println("enter second number");
        int number2 = input.nextInt();

       int smallerNum = number1 > number2 ? number2 : number1;
       //common biggest divident for both of these number cannot be bigger than smaller number
        //ex, 24 and 28, common biggest number cannot be bigger than 24
        //
        for(; smallerNum > 0; smallerNum--){
            if(number1 % smallerNum == 0 && number2 % smallerNum == 0){
                System.out.println(smallerNum);
                break;
            }
        }


    }
}
