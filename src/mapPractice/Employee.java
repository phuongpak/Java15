package mapPractice;

import java.util.HashMap;
import java.util.Random;

public class Employee {

    /*
            -create an employee class with instance variables of name, city, age, id
        -create one constructor to initialize instance variables
        -create a method to generate random  employee id and use this id for employee
        -create employeeTest class and
        -create 4 employee object in the test class and store them in a map
        -while storing employees in the map, use their ids as Key
        -create a method to print only employee names from map
     */

    String name, city;
    Integer age;
    Integer id;

    public Employee(String name, String city, Integer age){
        //we do not need id in parameter cuz the task ask for random id
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator();

    }
// -create a method to generate random  employee id and use this id for employee
    public Integer idGenerator(){


        Random random = new Random();
       return random.nextInt(100000);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
