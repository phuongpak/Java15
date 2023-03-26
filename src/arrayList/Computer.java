package arrayList;

public class Computer {
    /*
      Create a computer class under Arraylist package
      -have instance field of: brand, price, color, screenSize
      -create one constructor to initialize all instance variables
      -create a test class: store 4 computer object in an arraylist
      -show properties of each computer from the list
       */

    String brand;
    double price;
    String color;
    double screenSize;


    public Computer(String brand,double price,String color,double screenSize){
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;


    }

    public String toString(){

        return "Computer {"+ brand + " - " + price + " - " +
                color + " - " + screenSize + "}";

        }

}
