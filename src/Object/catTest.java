package Object;

public class catTest {
    public static void main(String[] args) {
       //we need an object from Cat class
       Cat tom = new Cat();

        System.out.println(tom.name);//if we do not assign any value
        //for name, it will take default and run it: null

        tom.name = "Tom";
        tom.age = 3;
        tom.color = "Black";

        System.out.println(tom.foodAmount);//20
        tom.foodAmount = 40;
        System.out.println(tom.foodAmount);//40

        //1.create a method that will just print out
        //"...Tom...is sleeping"
        //2.use this method in the test class

    //2.
        tom.sleep();//Tom is sleeping
        //create a new object
        Cat cat2 = new Cat();
        cat2.sleep();// null is sleeping

    tom.run();//it will run "tom is running" and return 3
        //is hidden in tom.run()
        int number = tom.run();//tom is running
       System.out.println(number);//3
        System.out.println("============");
        System.out.println(tom.run());

        //however many miles tom runs, give him 500 dollar per mile//

        System.out.println( tom.run()*500);//3*500 = 1500

//walk method

       // tom.walk("west");//run ok but will not see anything
        String message1 =  tom.walk("west");
        System.out.println(message1);//

        System.out.println(tom.walk("up"));//

       // System.out.println(tom.sleep());// method with void return type
        //cannot be called in System.out.println

//setColor method

        tom.setColor("blue");//this is set method only set on tom
        System.out.println(tom.color);//blue

        System.out.println(cat2.color);//null, we did not use set method for cat

//getColor method

      String colorTom = tom.getColor();
        System.out.println(colorTom);// blue, cuz we set color for tom is blue

        System.out.println(tom.color);//blue
        System.out.println(tom.getColor());//blue
        System.out.println("===========");


   //properties method



   String catProperties = tom.properties();//Tom-blue- 3- 40
        System.out.println(catProperties);//this line is returning
        //whatever return store in catProperties, it will return all


        tom.setAge(12);
        tom.getAge();// in 10 year is 22 age


        System.out.println("In 10 years, your age will be " + (tom.getAge() + 10));//return age





    }
}
