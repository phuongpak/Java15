package IfStatement;

public class ElsePractice {
    public static void main(String[] args) {

        int money = 100;

        //if your money is more than 100, you can get an item

        if (money > 100){

            System.out.println("I can buy an item");

        }else{
            System.out.println("I cannot buy one item");///the condition returning false so take else statement, the if statement block
        }

        money = 1001;
        if (money>100){
            System.out.println("I can buy");
        }else{
            System.out.println("I cannot buy");
        }

        /*ask user if they have driver license
        if the answer is 'yes'--> you are great
        if the answer is something else -->DMV is next door, please visit!
         */














    }
}
