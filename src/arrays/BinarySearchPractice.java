package arrays;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {

        String[] drinks = {"tea", "water", "coffee","coke"};


        System.out.println (Arrays.binarySearch(drinks,"water"));
        Arrays.sort(drinks);


        System.out.println (Arrays.binarySearch(drinks,"water"));

        System.out.println("============");

        int [] numbers = {3,6,8,10,8, 2,11};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,8));

        //[2, 3, 6, 8, 8, 10, 11]

      //  Arrays.binarySearch((numbers, 2,5,8)





    }
}
