package Object;

public class Cat {


    String name; // declared an instance variable
    String color;
     int age;
     int foodAmount = 20;//declared and initialized an instance variable
//1.
public void sleep(){

    System.out.println(name + " is sleeping");//
}
//create a run method that will return an integer number that
    //indicating how many miles user run

public int run() {

    System.out.println(name + "  is running");
    return 3;// 3 is example


}

//create a method that will return a String value
// ---->"....Tom ..... is walking to....west"(destination).
    //destination should come from parameter()


public String walk(String destination){




    return name + " is walking to "+ destination;


}
//create a method that initialize color of the cat(give value to color)
//it does not say to return anything so use void
public void setColor(String color1){
    //if we name: color, still ok then it is local just belong to this method


    color = color1;

}

// create a method that will return color of cat
    //if any method returning any instance value, use get..()
public String getColor(){
    return color;

}
//create method that will print and return all properties of cat
    //means all instance variable(name, color, age, foodAmount)

    public String properties(){
//we can also use Object datatype
        System.out.println(name + "-" + color +"- " +age +"- " + foodAmount );

    return "*****"+name + "-" + color +"- " +age +"- " + foodAmount;

    }

    //set the age of cat, get(return) the age of cat by using method
    //once you use method (MEAN IN THE TEST CLASS)
    // to get age of cat, print out "
    //"in 10 years, your age will be...."


    public void setAge(int age1) {
       age = age1;
    }

    public int getAge(){
        return age;
    }





}
