package oop.polymorphism;

public class Branch extends ATM{

    //OVERRIDE ONE OR ALL METHODS

    public void deposit(){
        System.out.println("Deposit at BRANCH");
    }

    //GO GET SOME LOAN
    public void loan(){
        System.out.println("Branch loan is up to 500k");
    }

    public void creditCard(){
        System.out.println("Card from Branch");
    }




}
