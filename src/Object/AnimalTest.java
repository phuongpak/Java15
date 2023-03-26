package Object;

import JavaFirst.HelloWorld;

import java.sql.SQLOutput;

public class AnimalTest {

    public static void main(String[] args) {

        //want to reach out the name of animal we created in class animal

        Animal animal1 = new Animal();
        System.out.println(animal1);//Object.Animal@5a39699//in the object packet, we have animal store

        System.out.println(animal1.name);//null,, default when we do not have any value cuz we did not give any name for
        //other class animal

        System.out.println(animal1.color);//null , string type
        System.out.println(animal1.age);//0 , cuz integer type

        animal1.name = "Simba";
        System.out.println(animal1.name);//Simba

        animal1.color = "white";
        System.out.println(animal1.color);//white

        animal1.age =2;
        System.out.println(animal1.age);//5

        System.out.println("=============");


        //create another object;
        //initialize all instance variable by using new object
        //print out those new value

//if create new object--> it will get default so the line 36 = 0 default
        Animal cat = new Animal();
        System.out.println(cat.age);//0 default
//give value to object
        cat.age = 3;
        cat.name = "Ginger";
        cat.color = "Orange";
        System.out.println(cat.age);
        System.out.println(cat.color);
        System.out.println(cat.name);

        System.out.println(animal1.gender);
        System.out.println(cat.gender);

        cat.gender = "male";
        System.out.println(cat.gender);
        System.out.println("==========");

        cat.eat();//it prints whatever inside the class Animal that we created
        animal1.eat();//reaching out the same

        System.out.println("***********");

        //create a method that will print out all properties of every animal
        //we need to create in animal class

        cat.printInfo();
        animal1.printInfo();
        System.out.println("***********");
//brand new animal
        Animal dog =  new Animal();
        System.out.println(dog.energyLevel);//0, but want to see 100

        dog.eat();//this will find the method is eat method,
        // what inside in eat method, energyLevel = 0(without line 20 show 100)
        //nam + is eating = null is eating cuz no name

        System.out.println(dog.energyLevel);//100
        System.out.println("?? cat energy" + cat.energyLevel);//100

        //create a run method//create syntax public void run()
        //when an animal runs
        //it will use 20 points of energy
        //implement the logic and show leftover energy
        //include name of the animal in the method to let user know who is running

        cat.run();//80
        cat.run();//60
        cat.run();//40 then cat hungry, feed her

        cat.eat();//energy 100 again

        /////
        Shape helper = new Shape();
        helper.perimeterCalculator(12,17);//want to change anything then has to go back to the shape class
        //to change it, hold the name  command on computer and click on the name perimeterCalculator
        // then it will take to that class


        //want to reach out to helloWord class

        HelloWorld abc = new HelloWorld();
        


        //I want to have a random number so that i can add 1000 to it in this class
        //first, create object

        Student student = new Student();
       int number =  student.hourCreator();
        System.out.println(number + 1000);











    }
}
