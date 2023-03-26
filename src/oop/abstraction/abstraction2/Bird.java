package oop.abstraction.abstraction2;

public class Bird implements CanFly{

    //fly and landing method is because CanFly has it abstract

    public void fly(){

        System.out.println("Bird is in the air");
    }

    public void landing(double speed){

        System.out.println("Bird is landing with a speed of" + speed);
    }

    //extra more method, special function
    protected void eat(){

        System.out.println("Bird eats");
    }

    public void abcd(){
        System.out.println("$$$$$$$$");
    }
}
