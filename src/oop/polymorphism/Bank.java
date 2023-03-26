package oop.polymorphism;

public class Bank extends Branch {

    public void deposit(){
        System.out.println("deposit at Bank");
    }

    public void loan(){
        System.out.println("loan from Bank up to 5M");
    }

    public void openBranch(){
        System.out.println("Bank to Branch opening");
    }
}
