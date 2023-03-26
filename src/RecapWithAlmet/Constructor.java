package RecapWithAlmet;

import java.sql.SQLOutput;

public class Constructor {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- What is constructor and what do you do with it?

    ->It is a way to initialize instance variableS.
     -> it is a way to assign value for object features.

    2-Can you tell me the difference between constructor and method?

    CONSTRUCTOR:                                            METHOD:
    -No return type                                 -it must have return type
    -it must have same name of class                - it may or may not have same name of class


    3-Can you make constructor static, final and private?
  SHOW OFF: UI --> SINGLETON PATTERN DESIGN --> W USE CONSTRUCTOR PRIVATE TO PREVENT OTHER CLASSES TO ACCESS THE DRIVER
   --> THE ANSWER: YOU CANNOT MAKE THE CONSTRUCTOR STATIC, FINAL, OR PRIVATE (EXCEPTION - SINGLETON PATTERN DESIGN)

    4-What is difference between this, this(), super, super() ?

    this -> is a keyword which refer to instance variable/methods of class
    this() -> refers to constructor from same class

    super -> is a keyword which refers to parent instance variables/method of class
    super() -> refers to the parent constructor from different class


     */

    String brand ="Porsche";
    int wheel = 4;
    int door = 2;
    public Constructor(String brand){
        this.brand = brand;
    }

    public Constructor(int door){
        this.door = door;
        System.out.println("I am running");
    }

    //overloading constructor
    public Constructor(String brand, int wheel){
        this(4);//you call this constructor in other constructor, must be first line
        this.brand = brand;
        this.wheel = wheel;
    }



    public static void main(String[] args) {
        // Constructor Porshe314 = new Constructor();//IT did not ask anything in (), mean we have default constructor
        Constructor Porshe314 = new Constructor("Porshe314");
        System.out.println(Porshe314.brand);

        Constructor example = new Constructor("BMW", 3);
        System.out.println(example.door);
        System.out.println(example.wheel);


    }

}
