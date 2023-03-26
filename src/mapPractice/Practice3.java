package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice3 {
    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<>();
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        TreeMap<String,Integer> tree = new TreeMap<>();

        hash.put("pepsi", 2);        linked.put("pepsi", 2);           tree.put("pepsi", 2);
        hash.put("coke", 5);         linked.put("coke", 5);            tree.put("coke", 5);
        hash.put("tea", 4);          linked.put("tea", 4);             tree.put("tea", 4);
        hash.put("lemonade", 6);      linked.put("lemonade", 6);         tree.put("lemonade", 6);
        hash.put("water", 8);        linked.put("water", 8);             tree.put("water", 8);

        System.out.println(hash);    System.out.println(linked);          System.out.println(tree);
        //hash:    {tea=4, pepsi=2, coke=5, lemonade=6, water=8}
        //linked:  {pepsi=2, coke=5, tea=4, lemonade=6, water=8}
        //tree:    {coke=5, lemonade=6, pepsi=2, tea=4, water=8}// IN ORDER

        //PUT (null kEYS,  )//tree cannot
        hash.put(null,11);       linked.put(null, 11);                //tree.put(null,11);NullPointerException

        System.out.println(hash);    System.out.println(linked);         System.out.println(tree);

        //null values (key, null value)

        hash.put("coffee", null);       linked.put("coffee" , null);            tree.put("coffee", null);
        System.out.println(hash);    System.out.println(linked);         System.out.println(tree);

        hash.put("smoothie", null);       linked.put("smoothie" , null);            tree.put("smoothie", null);
        System.out.println(hash);    System.out.println(linked);         System.out.println(tree);





    }
}
