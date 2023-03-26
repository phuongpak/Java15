package oop.abstraction.abstraction2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


       //we cannot create Object from interface
        //CanSwim canSwim =  new CanSwim();

        Bird bird = new Bird();
        bird.eat();

        System.out.println(bird.TAIL);
        System.out.println(CanFly.WING);

        Dolphin dolphin = new Dolphin();
        dolphin.swim(3);

        System.out.println(dolphin.FIN);
        System.out.println(CanSwim.FIN);

        //IS THERE ANY OTHER WAY THAT I CAN STILL CREATE A DOLPHIN ObJECT

       // List list = new ArrayList(); no need
        CanSwim dolphin2 = new Dolphin();//because CanSwim is parents
        dolphin2.swim(4);

        Duck duck = new Duck();
        duck.fly();
        duck.landing(50);
        duck.swim(35);

        //IS THERE ANY OTHER WAY THAT I CAN STILL CREATE A Duck object

        CanFly duck1 = new Duck();
        CanSwim duck2 = new Duck();

        duck1.fly();
        duck2.swim(7);

        System.out.println("======");

        Duck duck3 = new Duck();
        duck3.run();//cuz the color is not assign so it shows : null running

        duck3.printInfo();




    }
}
