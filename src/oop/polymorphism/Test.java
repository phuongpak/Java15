package oop.polymorphism;

public class Test {
    public static void main(String[] args) {

       ATM atm = new ATM();//reference site = value site
       atm.deposit();
       atm.checkInfo();
       atm.withdraw();

        System.out.println("-----------");

        Branch branch = new Branch();
        branch.deposit();//Deposit at BRANCH: get the one that closer to object
        branch.loan();
        branch.creditCard();//
        System.out.println("************");

        Bank bank = new Bank();
        bank.deposit();//call method during run time

        bank.openBranch();
        bank.loan();
        bank.creditCard();//come from branch

        System.out.println("$$$$$$$$$$$$");

        //
        ATM atm1 = new Branch(); // parent-child relationship super class and sup class
        //left side is deciding to call method from ATM
        //so we only 3 method to call atm1 from ATM class
        //we cannot see method from Branch class
        //we cast it

        ( (Branch)atm1 ).loan();
//WE USE INTERFACE SO WE DO NOT NEED TO CAST
        Money money = new ATM();
        Money money1 = new Branch();
        Money money2 = new Bank();

        money.deposit();//pick up deposit from AMT CLASS AND NO NEED TO CAST
        money1. loan();//
        //money2.openBranch();//red. we do not have openBranch in interface class
        //we can cast

        ( (Bank)money2 ).openBranch();


    }
}
