package oop.inheritance1;

public class DomesticAnimal extends Animal{

    boolean hasToy;


    protected void play(){
        System.out.println(name + " is playing");
        //go to zoo class
    }


    int jump(){
        System.out.println("D is jumping");
        return 7;
    }

    public DomesticAnimal hunt(){
        System.out.println("D is hunting");
       // return new DomesticAnimal();
        //return new DomesticAnimal object as data
        //or we can create this object and return
        DomesticAnimal tom = new DomesticAnimal();
        return tom;
    }



}
