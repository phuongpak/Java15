package oop.inheritance2;

public class Rose extends Flower{

        String color;





    //if there is constructor in parent classs, we must call that constructor in child class
    public Rose(){
        super("Red");//whatever parameter in () parent constructor class
        //THIS IS COLOR FOR PARENTS
    }

    //we do not need to inheritance all constructors from parent, one is good if we do not need more

    public Rose(String color, String size, double price){
        //super("yellow");either passing value in parameter or
        super(color,size,price);//for parent
        this.color = color;

    }

    @Override
    public Integer run(int miles){
        System.out.println("Rose is happy to run");
        return miles + 1;

    }



}
