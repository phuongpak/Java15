package oop.inheritance1;

public class Zoo {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        System.out.println(animal1.color);//null -->orange

        wildAnimal wild = new wildAnimal();//wild is child of parent so can access all variable
        System.out.println(wild.color);//null


        Lion lion = new Lion();
        System.out.println(lion.color);//lion inherit color and anything from wildAnimal have
        //wildAnimal inherit all Animal public access modifier, if private, different

        System.out.println("+++++++++++++");
        lion.color = "Brownish";
        System.out.println(lion.color);//Brownish


        DomesticAnimal domestic = new DomesticAnimal();
        System.out.println(domestic.color);//orange

        Cat cat = new Cat();
        System.out.println(cat.color);//orange



        //after method

        animal1.eat();
        wild.eat();
        domestic.eat();
        lion.eat();
        cat.eat();

        animal1.name ="Father";//only animal1 , individual name given
        System.out.println(animal1.name);//Father
        System.out.println(wild.name);//null


        animal1.eat();//Father  is eating


        lion.name ="Simba";
        lion.eat();//Simba  is eating
        System.out.println("=============");

        //call sleep method

        animal1.sleep();//orange is Sleeping
        wild.sleep();//orange...after create method sleep in Wild class, orange become yellow sleeeping

    animal1.speak();
    wild.speak();
    lion.speak();
        //after create play method in Domestic class
        System.out.println(domestic.hasToy);//

        System.out.println(cat.hasToy);//

        domestic.play();
        cat.play();

        System.out.println("==============");
        System.out.println(domestic.name);
        System.out.println(cat.name);
        System.out.println("-------------");

        domestic.name = "Jerry";
        cat.name = "Tom";

        domestic.play();
        cat.play();





    }
}