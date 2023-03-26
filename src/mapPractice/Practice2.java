package mapPractice;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap();

        map.put(10, "Alex");
        map.put(20, "Sam");
        map.put(30, "Tom");

        System.out.println(map);//print in different order: {20=Sam, 10=Alex, 30=Tom}

        map.get(30);//tom , () is key

        map.put(20, "Vitaly");//if the key is existing on the map, the value will be updated

        System.out.println(map);//{20=Vitaly, 10=Alex, 30=Tom}

        map.put(40,"Natalie");
        map.put(50,"Natalie");
        map.put(60,"Natalie");
        map.put(70,"Natalie");

        System.out.println(map);//{50=Natalie, 20=Vitaly, 70=Natalie, 40=Natalie, 10=Alex, 60=Natalie, 30=Tom}

        //can I only reach out key or value every single one by one
        // how to reach out all values individually?

        System.out.println(map.get(10)); //Alex
        System.out.println(map.get(20)); //Vitally
        System.out.println(map.get(30));//Tom
        //...dynamic
        //how can I have all keys on hand ?

       // map.keySet();//return all the keys from the map and come as set
        Set<Integer> keys = map.keySet();//store the keys set in the set
        System.out.println(keys);//[50, 20, 70, 40, 10, 60, 30]
        //from the set above, we reach out every single values

        for(Integer key : keys){
            System.out.println("values : " + map.get(key)  );
        }

        System.out.println("+++++++++++++++++++");

        for(Integer item : map.keySet()){
            System.out.println("+ values: " + map.get(item));


        }

        //reach out values
        //value();

       Collection<String> values =  map.values();
        System.out.println(values);////[Natalie, Vitaly, Natalie, Natalie, Alex, Natalie, Tom]

        for(String value : values){
            System.out.println("* " +  value + " *");
        }


        //replace()

        map.replace(40, "XXX");
        System.out.println(map);

        map.replace(90, "YYYY");
        System.out.println(map);

        map.replace(70,"Natalie","Jenny");
        System.out.println(map);

        //map has size -->size()

        map.size();
        System.out.println  (  map.size()  );

        //containKey()

        map.containsKey("Mustfa");
        System.out.println(map.containsKey("Mustfa"));//false




        //containsValue()

        System.out.println( map.containsValue("1000") );//false
        System.out.println("=================");

        System.out.println(map.containsKey("10"));//false cus key is supposed to be Integer but now is String
        System.out.println(map.containsKey(Integer.parseInt("10")));//convert to String and print out true
        System.out.println("=================");

        //isEmpty


        //clear

        map.clear();//clear it first
        System.out.println(map.isEmpty());//then ask empty or not -->true











    }
}
