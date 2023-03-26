package oop.inheritance3;

public class Vehicle {
    /*
    ===================TASK===================
        -Vehicle
          Variables:
            protected  model;
            default year;
            public brand;

        -Car
          *extends Vehicle
          variables:
            model;
            engineType;
          Methods:
            Override move(); --> Car is moving
            Override accelerate(); --> return Integer and calls model from parent class

     */

    protected String model;
    int year;
    public String brand;

        /*
        Methods:
                    move(); --> vehicle is moving
                    stop(); --> return true, vehicle is stopping
                    protected start(); --> return true, vehicle is starting
                    default accelerate(); --> return <OneOfObject-Vehicle_Car>
                  Constructor: create a constructor to initilize instance variables
         */
    public void move(){
        System.out.println("vehicle is moving");
    }

    public boolean stop(){
        System.out.println("vehicle is stopping");
        return true;
    }

    protected boolean start(){
        System.out.println("vehicle is starting");
        return true;
    }

    Object accelerate (){
        System.out.println("Vehicle accelerate");
        //return new Vehicle("", 5,"");
        return 3;
    }

    //constructor
    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}
