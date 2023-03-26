package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        HashSet<String> set2 = new HashSet();
        HashSet <Integer> set3 = new HashSet<>();

        Set<String> set4 = new HashSet<>();

        System.out.println(set2);

        set2.add("Alex");
        set2.add("Vitaly");
        set2.add("Sam");
        set2.add("Jenifer");

        //HashSet does not have order

        System.out.println(set2);

        set2.add("Alex");
        System.out.println(set2);//it will not add more Alex, no duplicate

        //null//hashset let you have a null value inside of it

        set2.add(null);

        System.out.println("added first null" + set2);//[null, Alex, Vitaly, Jenifer, Sam]

        set2.add(null);//add null again

        System.out.println("added second null" + set2);//only one null value accept


      //show all elements one by one: [null, Alex, Vitaly, Jenifer, Sam]
        //no get method, we cannot do it
        //have to use loop//cannot use for loop but use for each
    //if the name is Alex, say Hello to him//we have null value
        for( String name : set2){

           // System.out.println(name); print every name
            if(name != null && name.equalsIgnoreCase("Alex")){
                System.out.println("hello");
            }
        }

        boolean result1 = set2.contains("Alex");
        System.out.println(result1);

        System.out.println((set2.isEmpty()));//it is not empty cuz we did not clear it

        set2.clear();
        System.out.println(set2);//empty now








       /* String[] strs = {"a" ,"b","a"};
        String[] strs2 = {"a" ,"b","a"};
        HashSet<String[]> set6 = new HashSet();//add String array

        set6.add(strs);//in order to put () has to be array
        System.out.println(set6);

        set6.add(strs2);
        System.out.println(set6);//2 elements in array

        */
        //above this line is main method

        //call filter method, we need object

        HashSet<String> test = new HashSet<>();
        test.add("Denver");
        test.add("SpringField");
        test.add("Columbus");
        test.add("La");
        filter(test);





    }

    //create a method that will take a set parameter
    //this method will filter string elements based on their length
    //

    public static void filter(HashSet<String> data){

        for(String item : data){
            if(item != null && item.length() >=5){
                System.out.println(item + "******");
            }else{
                System.out.println(item+ "????");
            }
        }

    }






}
