package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {


    /*
    create a method that will take a map as parameter
    this method will add message to each key as follows:

    "......is the best key"
     */
    public static void bestKey(Map<String, String> map){
        //map.keySet() get keys
        for( String key :map.keySet()){
            System.out.println(key + " is the best key");// //go to main and call it
            //extra question: store that key to a map
           // map.put(key + " is the best key",  map.get(key)   );//not correct, don't follow it

            //print out values in the same method
           System.out.println(map.get(key));//print out the values which are number of them
        }




    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println(map);
        map.put("Alex" , "7");
        map.put("david" , "6");
        map.put("messi" , "10");
        map.put("john" , "10");
        bestKey(map);//calling method after creating line 18
    }





}
