package mapPractice;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();

        System.out.println(map);//map is empty now {}, add some elements next

        map.put("Alex", "Smith");
        map.put("David","Brown");
        map.put("Mary", "White");

        System.out.println(map);//{Alex=Smith, David=Brown, Mary=White}
        //map.get("David");//no space typing david""

        System.out.println(map.get("David"));//Brown,
        //store value
        String valueDavid =map.get("David");
        System.out.println(valueDavid);

        System.out.println(map.get("  David"));//null




    }
}
