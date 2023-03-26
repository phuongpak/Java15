package RecapWithAlmet.OOP;

public abstract class AbstractPractice1 {


    public AbstractPractice1(){};//THIS IS CONSTRUCTOR

    //this is abstract class//is a ghost class// cannot create Object

    public static String name;//we have instance variable, and instance variable can have access modifier


    //can create getter and setter to let extends class to access method


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AbstractPractice1.name = name;
    }

//    public static void run(){
//        System.out.println("hello, i am running");//under abstract class, we can have regular methods
//    }

    //main reason to have abstract class is to have abstract methods

    public abstract void dismiss();//abstract does not have body

    public abstract void speak();





}
