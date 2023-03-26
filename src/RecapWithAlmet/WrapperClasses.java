package RecapWithAlmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- What is Wrapper Class?

       --> Wrapper class --> It is a process to convert data into different forms

    2- How many ways of wrapper classes do you know?

    Note: Avoid using numbers for any options. like there are 2 ways of doing conversion. or there are 8 type of primitive data

    -->AutoBoxing
        conversion data from Primitive to OBJECT (AUTOMATICALLY)

    -->Unboxing
      -->Conversion data from OBJECT TO PRIMITIVE


    NOTE: THE REASON WE USE WRAPPER CLASS TO MAKE A CONVERSION DATA INTO FORMAT THAT WE NEED
    (parsing, Object ...etc)

     */
    public static void main(String[] args) {

        int number = 10; //primitive data

        List<Integer>  numbers = new ArrayList<>();//only store OBJECT
        numbers.add(number);//add primitive in and it turns to object
        System.out.println(numbers.get(0).hashCode());//show the location of this element
        //numbers.get(0).//AUTOBOXING  --> AUTOMATICALLY IT HAPPENS
        //IN HERE I JUST ADDED PRIMITIVE INTO LIST AND IT TURNED
        //BY ITSELF OBJECT

        //UNBOXING: CONVERSION OBJECT TO PRIMITIVE,.... LIKE PARSING ( THE MOST COMMON WAY)

        String str = "1234";//This is OBJECT

        int exampleNumber = Integer.parseInt(str);//static method, to check: click on command+  parseInt
                                                    //exampleNumber is primitive
        System.out.println(exampleNumber);








    }
}
