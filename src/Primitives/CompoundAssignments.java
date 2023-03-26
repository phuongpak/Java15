package Primitives;

public class CompoundAssignments {

    public static void main(String[] args) {

        int cars = 2;
        System.out.println(cars);//2

        cars = cars + 1;
        System.out.println(cars + " number of cars after first purchase");//3
        cars +=1;
        System.out.println(cars + " number of cars after second purchase");//4

        //selling a car

        cars -= 1;
        System.out.println(cars + " after selling one car");

        //sharing cars with another person

        cars /= 2;
        System.out.println(cars + " after sharing with another person");
        cars /= 2;
        System.out.println(cars + " after sharing single car again");

        int count = 25;
        count %= 7;// count = count % 7; //4
        System.out.println(count);


    }
}
