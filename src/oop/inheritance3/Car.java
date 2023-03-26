package oop.inheritance3;

public class Car extends Vehicle{

    //it will have red line if we don't create constructor

    public Car(){
        super("Camry" , 2023,"Toyota" );
    }


        /*
        -Car
                  *extends Vehicle
                  variables:
                    model;
                    engineType;
                  Methods:
                    Override move(); --> Car is moving
                    Override accelerate(); --> return Integer and calls model from parent class

         */
    String model;
    String engineType;



    @Override
    public void move() {
        System.out.println("Car is moving");
        super.move();

    }

    @Override
   protected Vehicle accelerate() {
        System.out.println("Car is accelerating");
       // return new Vehicle("",5,"");//this for return type Object
        //if want to return Car : (Car) (new Vehicle (",5,"));//casting car
        System.out.println(super.model);
        this.model = super.model;
        System.out.println(model);
        return new Vehicle("",5,"");

    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Y", 2023,"Tesla");
        vehicle.move();//from Vehicle parent class
       // vehicle.accelerate();//return 3 is a large object, if we want to store it int the bucket, we create
        Object i = vehicle.accelerate();
        System.out.println(i);//return type is object, so we cannnot put *5 in ()

        //we want to return String, INTEGER so we cast object
        String str =(String) vehicle.accelerate().toString();
        str = str.concat("*****");
        System.out.println(str);
        Integer i1 = (Integer)vehicle.accelerate();
        System.out.println(i1 * 5);//now we can have *5 now cuz it is Integer

        int i2 = (Integer) vehicle.accelerate();
        System.out.println(i2 +10);

        System.out.println("==============");

        Car car = new Car();
        car.move();

        System.out.println("**************");
        car.accelerate();

        Vehicle v = car.accelerate();//we check right side is return  Vehicle by clicking on accelerate then we store it
        System.out.println(v);//oop.inheritance3.Vehicle@5a39699c //it returning a new vehicle

        System.out.println(v.model);
        System.out.println(v.year);

       //Car car1 = (Car) car.accelerate();
        //System.out.println(car1.year);




    }
}
