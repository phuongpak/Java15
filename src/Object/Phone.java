package Object;

public class Phone {

    String shape;
    String color;
    double price;
    boolean cover;

    public void call (long phoneNumber){
        System.out.println("I am calling >> "+ phoneNumber);
    }

    //constructor and want to initialize all instances variable

    public Phone(String shape, String color, double price, boolean cover){
        this.shape = shape;
        this.color = color;
        this.price =  price;
        this.cover =  cover;

    }





}
