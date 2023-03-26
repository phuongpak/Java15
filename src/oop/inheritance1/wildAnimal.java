package oop.inheritance1;

public class wildAnimal extends Animal{

    //after creating all animal in zoo class, now create one String color her

    String color = "Yellow";
    //bring eat method to this class so we change

    public void sleep(){
        System.out.println(color + " is sleeping");

    }
    @Override
    public void speak(){
        System.out.println("I can have two languages");
    }



}
