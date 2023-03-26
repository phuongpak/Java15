package oop.inheritance2;

public class Test {
    public static void main(String[] args) {

        Flower flower = new Flower("WHITE");

        Rose rose = new Rose();//no parameter cuz we us constructor in child class no parameter


        System.out.println(flower.color);//WHITE

        System.out.println(rose.color);//WHITE//INHERITANCE FROM PARENT

        Rose rose1 = new Rose("Yellow", "Small", 3.99);
        System.out.println(rose1.color);//Yellow


        flower.run(3);
        rose1.run(6);

    }
}
