package oop.finalPractice;

public class Shirt {

   // double price = 11.99;//it is changeable
   //CANNOT CHANGE IF WE HAVE final and the name is all uppercase
    final double PRICE = 11.99;
    String color;
    String size;

    public void sale(){
        System.out.println("Sale");
    }


    static final public void dye(){
        System.out.println("Changing color of SHIRT");
    }
//WE CAN OVERLOADING BUT CANNOT OVERRIDING
    final static public void dye(final String color){
        System.out.println("Changing color of SHIRT to " + color);
   //color = "blue": // it will not let you change it
    }

    @Override
    protected void finalize()  {
        //this finalize coming from the library of java
        System.out.println("*********");
    }
}
