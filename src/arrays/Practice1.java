package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {


        // I will store 5 different ages into one array

       // int number = 19;

       // int[] ages = new int[number];//

        int[] ages =  new int[5]; // 5 is representing size of array
// how can we see what inside box ages
        //System.out.println(ages); // it will show hashcode (location of array in the memmory)
        // but not show the data so we have to do:

        System.out.println(Arrays.toString(ages));///printing out array

        ages[0] = 25;
        ages[1] = 9;//2 value so far,so open the box and see now

        System.out.println(Arrays.toString(ages));// show 25,9,0,0,0,0,0

        //store 89 into the last position of the ages array

        //ages[5] = 89; //ArrayIndexOutOfBoundsException //from array class

        ages[4] = 89;//5 values but from 0 so the last one is
        System.out.println(Arrays.toString(ages));

        String str = "abcd";
        //System.out.println(str.charAt(7));//StringIndexOutOfBoundsException

        System.out.println(   ages[1]  );//9

        //reassigning values

        ages[0] = 35;
        System.out.println(Arrays.toString(ages));//[35, 9, 0, 0, 89]
        System.out.println(  ages[0]);//35

        //System.out.println( ages[ages.length] -1);// 89 THE LAST ONE IN THE ARRAY

        //LENGTH -->SIZE OF THE ARRAY
        System.out.println(ages.length);









    }
}
