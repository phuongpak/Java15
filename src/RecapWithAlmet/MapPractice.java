package RecapWithAlmet;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    /*

    POSSIBLE INTERVIEW QUESTIONS:(DAY 42)


    1-Can you tell me about map and why do you use map in your project?

    -> Map is an awesome concept interface to be used in my project to share/store my data as "KEY AND VALUE"


    2-What is the connection between Collection and Map?


    ->They are all useful that I use in my project for different purposes.
    As I mentioned before SET is all about uniqueness
                          LIST is all about duplication if it is needed
                          MAP is all about KEY AND VALUE

      SHOW OFF: did you know that there is a good explaination for the connection that i realized when i was working on Map,
       i checked the feature of KEY and feature of VALUE.
       -KEY acts like the Set Feature. it means it only accepts unique data
       -VALUE acts like the List Feature.it means it accept duplicate as well

    3-What is the type of Map and different between them?

    -->to be honest, i didn't like the map at the beginning because it seemed so complicated but after
    i learned the beauty of sub-types which are:
                    -HashMap -->it stores randomly
                    -LinkedMap ->it stores insertion
                    -TreeMap -> is my favorite to do ascending order.

    4-Synchronization? can you give examples and what do you know about it usage in java?
        // (pronounce: (sit) syn/chro nization), EXAMPLE, EFE AND 3 STUDENTS

       IN JAVA ->FIRST COME FIRST SERVER -->IN AUTOMATION --WAIT TIMES
        *--> It executes any actions one by one (one after another)
        **--> We have two most common concepts in java use Synchronization
                => HASHTABLE   -->STRING BUFFER
        *** -->Synchronized system is *******THREAD-SAFE***** and *******SLOWER*******
        *** -->Non-Synchronized system is *****NOT THREAD SAFE****FASTER****
                 -->LIST, MAP,SET,STRING BUILDER


(DAY 42)
     */
    public synchronized void run() {
        System.out.println("hello");
    }

    public void run2() {
        System.out.println("hi");
    }
    /*
    HOMEWORK:

    String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
        TASK:I want you get the output of total item for each:
        -->Apple=3,Banana=2,Orange=2,Strawberry=1,Cherry=1
        TIPS:You can use a method(map) containsKey
        TIPS:If condition
     */

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Cherry", "Orange"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            if (map.containsKey(fruits[i])) {
                map.put(fruits[i], map.get(fruits[i]) + 1);

            } else {
                map.put(fruits[i], 1);
            }

        }

        System.out.println(map);
//        for(String item : fruits){
//            if(map.containsKey(item)){
//                map.put(item,map.get(item) + 1);
//            }else{
//                map.put(item,1);
//            }
//
//        }
//        System.out.println(map);
//
//    }


    }
}

