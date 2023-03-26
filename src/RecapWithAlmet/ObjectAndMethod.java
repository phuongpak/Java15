package RecapWithAlmet;

public class ObjectAndMethod {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What do you know about Object ? and tell me couple method of it?

    -->Always go from general to deep:
    answer: Object is a representation of the class(blueprint)--> for ex, Human is class, blueprint is DNA, CARS etc...
            There are some useful methods of object that I use to perform some actions in my project
    first method *-> equals --> comparison of two objects values.
                **->toString --> it is a way to make the data into String format(Array.toString)
               ***->HashCode --> it gives you the location of data



    2-What is the difference between Object and Class?

    Class: is a blueprint/template which you can create as many as you want
    Object: is a representation of class/member-->Instance of class(INSTANCE = OBJECT)

    Class:  It is declared with " Class " keyword
    Object: It is declared with " New " keyword

    3-How do you initialize the instance variable?

    -->there are actually some commons ways to initialize the instance variable
        -> constructor:
        -> Method(getter and setters)
        ->Object
        -> Directly declare and initialize

    4- what is the difference between local and instance variable?

    Instance variable :                                                    local variable:
    -definitely belongs to class                                            - it belongs to blocks
    -it has default values (null, 0, 0.0, false)                            - No default values ( has to assign or initialize value)
    -It can have Access modifier(private, public,protected                  - no, we cannot have access modifier
    default(it is not a keyword)



     */
    //example: we have human class with these instance variable

    private String name ="Ahmet";
   protected int age =31;
    String eyeColor = "black";
    String nationality;

    //constructor is a way to initialize the instance variable
    public ObjectAndMethod(String name, int age, String eyeColor, String nationality) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }

    public void run( int speed){
       // int number;
       // System.out.println(number);//local variable cannot have default value, we have to initialize it
        //public int number --> you cannot use access modifiers for local variable
        int number = 1;
        System.out.println(number);
        System.out.println(speed);
    }






    public static void main(String[] args) {

        ObjectAndMethod maleHuman = new ObjectAndMethod("MeHmet", 35,"brown" ,"kaeoi");//object --> representation of class
                                                            //Instance of class


        System.out.println(maleHuman.name);// show mehmet , not ahmet cuz reassign value(overriding value)
        System.out.println(maleHuman.age);//31 //assign value directly
        maleHuman.age = 32;
        System.out.println(maleHuman.age);//32//assign value with object

        System.out.println(maleHuman.nationality);//null. it gives default value
        maleHuman.nationality ="Turkey";
        System.out.println(maleHuman.nationality);//Turkey
      //  System.out.println(maleHuman.number);//there is no direct call for local variable




    }




}
