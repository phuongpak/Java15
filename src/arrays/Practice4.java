package arrays;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {


        int[] numbers = {4,3,5,6,72,6,8,45};
        //check how many elements
        System.out.println(numbers.length);//count of elements
        System.out.println(numbers[0]);//4
        //to see everything in array
        System.out.println(Arrays.toString(numbers));

        //if want to change value of index 1
        numbers[1] = 88;//giving a new value to index 1
        //now array changed
        System.out.println(Arrays.toString(numbers));//[4, 88, 5, 6, 72, 6, 8, 45]

        //numbers[8] = 111;///last index is 7, so it will not work--> ArrayIndexOutOfBoundsException
        System.out.println("Good morning");//if we let the line 21 open, anything after line 21 will not work, so we have to block it


        //multiply each element by 10 and print out the result
        //[4, 88, 5, 6, 72, 6, 8, 45]
        //==> use for loop to reach out every element

        for(int i = 0 ; i < numbers.length ; i++){

            System.out.println(numbers[i] * 10);
        }
        System.out.println("==========");
        //multiply numbers that are greater than 10  by 100 and print out the result
        //[4, 88, 5, 6, 72, 6, 8, 45]

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 10){
                System.out.println(numbers[i]* 100);
            }
        }





    }
}
