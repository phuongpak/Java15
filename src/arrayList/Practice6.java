package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {


        //Every Arraylist is a list
        //but not every list is an Arraylist


        List<String> list1 = new ArrayList();
        list1.add("IL");
        list1.add("OH");

        System.out.println(list1.get(1));

        //convert from array to Arraylist by using asList method

        int[] digits = {3,4,5,6};
        List <int[]> a = Arrays.asList(digits);

       // a.add(12);//UnsupportedOperationException
        System.out.println(a);//[[I@3cb5cdba] only one element inside list

        System.out.println(Arrays.toString(   a.get(0)   ));
        System.out.println( a.get(0)[0]);

        //convert ArrayList to Array

        ArrayList items = new ArrayList();
        items.add ("Alex");
        items.add("Ana");
        System.out.println(items);

        Object[] array = items.toArray();

        array[1] = "Vitaly";

        System.out.println(Arrays.toString(array));

        System.out.println((array[0]));





    }
}
