package Object;

public class Animal {

       //inside animal class, we can have some properties (name), color, ...
//instance variable, instance variable define/belong the object
        String name;
        String color;
        int age;
        int energyLevel;
        //when animal eats, energy level goes up to 100. when animal eating?
    //eat method


//new variable

        String gender = "Female";

public void eat(){
    energyLevel = 100;
    System.out.println("Energy level is " + energyLevel + "after eating");
        System.out.println(name + "  is eating");
        //AS LONG AS THIS METHOD RUN, IT WILL PULL THE 100

}

public void printInfo(){
    System.out.println(name + " - " + age + " - " + color + " - " + gender);

}
public void run(){
    //can i say energyLevel go down
    energyLevel -=20;
    System.out.println("After running, energy level of " + name + "is" + energyLevel);




}




}
