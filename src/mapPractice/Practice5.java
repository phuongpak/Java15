package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice5 {


    /*
    String str = "Soccer is the best sport";

    count numbers of each letter from the given String
    S - 1 : key - value//reach out letter and value also
    o - 1
    c - 2
    e - 1
    r - 1
    ....
    t - 3
    explain: create map,every single letter from String is key, each key attaches its value
    if we play them using for loop only one time, they will show only count 1 cho each letter: map.put(str1, 1);
    first, take every single letter and store into string
    use map

     */


    public static void main(String[] args) {

        String str = "Soccer is the best sport";

        HashMap<String, Integer> map = new HashMap<>();//create a new map to put data in

        for (int i = 0; i < str.length(); i++) {

            String str1 = "" + str.charAt(i);//store letters into str1 String
            if ( map.containsKey(str1) ){
                map.put( str1, map.get(str1) + 1 );//(map.get(str1) + 1) return value, if it  is there, increase 1
            } else {

                map.put(str1, 1);//other one just count 1

            }

        }

        System.out.println(map);


    }
}

