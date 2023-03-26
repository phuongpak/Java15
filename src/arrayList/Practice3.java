package arrayList;

import java.util.ArrayList;
import Object.*;

public class Practice3 {
    public static void main(String[] args) {


        ArrayList<Integer> zipcodes = new ArrayList<>();

        zipcodes.add(540);
        zipcodes.add(600);
        zipcodes.add(404);
        zipcodes.add(202);

        System.out.println(zipcodes);//[540, 600, 404, 202]

        for(Integer code :zipcodes){
            //if we use Object code instead of Integer. then we type code. : it will show all object type
            System.out.println(code + 10);//regular numbers but object type
        }
        System.out.println("**********");

        for(Object code: zipcodes){
            System.out.println(code);
        }
        System.out.println("++++++++++++");

        ArrayList list1 = new ArrayList();
        list1.add("Diana");//it is ok because this is object type so we can have integer and string in the array
        list1.add(123);
        list1.add(true);

        System.out.println(list1.get(0).toString().toUpperCase());
        System.out.println(list1.get(1).toString().equals("123"));

//contains

        System.out.println(zipcodes.contains(540));//true
        System.out.println(zipcodes.contains(100));//false

       boolean b =  zipcodes.isEmpty();//false

        list1.clear(); //make it empty
        System.out.println(zipcodes.isEmpty());//true
        //after doing the task below, create this
        System.out.println(test2(zipcodes));//

        ArrayList mixedType = new ArrayList();

        mixedType.add(8);
        mixedType.add("test");
        mixedType.add(true);
        mixedType.add(5.6);
        mixedType.add('r');

        Cat cat = new Cat();
        Flower flower = new Flower();

        mixedType.add(cat);






    }
    //create a method that will take an ArrayList as parameter
    //it will generate message for each item from the list
    //it will store and "return those message" ( mean datatype is string) as an ArrayList

    public static ArrayList<String> test2 (ArrayList<Integer> list){

        ArrayList<String> messages =  new ArrayList<>();
        for(Integer number :list){
            messages.add("hi" + number);
        }

        return messages;//this is return type String


    }




}
