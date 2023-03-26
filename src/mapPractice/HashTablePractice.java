package mapPractice;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();

        table.put( "Rose" , 3 );
        table.put( "Daisy" ,5 );
        table.put("SunFlower", 10);
        table.put( "Tulip" , 9);

        System.out.println(table);//come like a map : {SunFlower=10, Daisy=5, Tulip=9, Rose=3}

        System.out.println(    table.get("Tulip")   );//9

        System.out.println(    table.values()   );//[10, 5, 9, 3]

        System.out.println(    table.keySet()   );//[SunFlower, Daisy, Tulip, Rose]

        System.out.println(    table.entrySet()   );//[SunFlower=10, Daisy=5, Tulip=9, Rose=3]

       // table.put(null, 18);//.NullPointerException
      //  table.put("Orchid" , null);//.NullPointerException




    }
}
