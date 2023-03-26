package setPractice;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {


        /*
        HashSet ....> No order, can store Null value
        LinkedHashSet ---> Insertion order, can store null value
        TreeSet---> Ascending order( small to larger), No null
         */

        HashSet<String> hash = new HashSet<>();
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        TreeSet<String> tree = new TreeSet<>();

        hash.add("apple");           linked.add("apple");              tree.add("apple");
        hash.add("orange");          linked.add("orange");             tree.add("orange");
        hash.add("cherry");          linked.add("cherry");             tree.add("cherry");
        hash.add("strawberry");      linked.add("strawberry");         tree.add("strawberry");

        System.out.println(hash);     System.out.println(linked);       System.out.println(tree);
        hash.add(null);                linked.add(null);               // tree.add(null);//no null value for tree

        System.out.println(hash);     System.out.println(linked);       System.out.println(tree);

        System.out.println(tree.first());//take and remove first element from treeSet
        System.out.println(tree.last());//strawberry
        System.out.println(tree.pollFirst());//apple
        System.out.println(tree.pollLast());//strawberry

        System.out.println(tree);//tree now has only [cherry, orange]

        System.out.println(tree.descendingSet());//[orange, cherry]

        System.out.println("adding watermelon first time ...>" + tree.add("watermelon") );//true
        System.out.println(tree);//

        System.out.println(hash.contains("x"));//false

        System.out.println("adding watermelon second time ...>" + tree.add("watermelon") );//false,
        // boolean cuz it asks to add watermelon yes or no. true or false
        //with treeSet we can add more element as long as it is not duplicate

        System.out.println(tree);













    }
}
