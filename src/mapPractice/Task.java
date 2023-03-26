package mapPractice;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Map<String, Integer> data1 = new HashMap<>();
        data1.put("A", 1);
        data1.put("B", 26);
        data1.put("C", 30);
        data1.put("D", 5);

        //LargeNumberFinder(data1);//HAS TO STORE, IF PRINT WITHOUT STORE, CANNOT SEE ANYTHING

        List<Integer> list1 = LargeNumberFinder(data1);
        System.out.println(list1);


    }
    //////////////////

    /*
    create a method that will get a map as parameter
    given map as parameter should be Map< String,Integer>
    This method will find all values from the given map
    this method will return if the value is greater than 25
    this method will return those greater numbers as a list
     */


    public static List<Integer> LargeNumberFinder (Map<String, Integer> map){
        List<Integer> list = new ArrayList<>();
      // Collection<Integer> value = map.values();//2,4,27,56 check every number if it is greater than 25
        for(Integer number: map.values()){

            if(number > 25){
                list.add(number);
            }
        }

        return list;

    }




}
