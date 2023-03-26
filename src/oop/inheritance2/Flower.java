package oop.inheritance2;

public class Flower {
    //Flower class is parent class

    String color;
    String size;
    double price;

  //create constructor//it will have problem so we also need to create constructor in child class

    public Flower(String color){
        this.color = color;
    }
//create another constructor
    public Flower(String color, String size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Number run(int miles){
        System.out.println("Flower is running to the Spring");
        return miles * 100;
    }




}
