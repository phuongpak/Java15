package HomeWork4;

import java.util.Scanner;

public class PrintFirstUnique {
    public static void main(String[] args) {
        /*
            Create the array size of 7 and store every number by asking user via scanner in the loop.
    When asking user please use the text -> "Enter number for array" .
    After having all numbers for array print ONLY the first unique value from this array.
    If the array doesn't have any unique element print the text below
    "Array doesn't have any unique element"

    EXAMPLE OUTPUT

    Enter number for array
    1
    Enter number for array
    2
    Enter number for array
    4
    Enter number for array
    1
    Enter number for array
    2
    Enter number for array
    3
    Enter number for array
    4
    3  -> 3 is printed because array have [1,2,4,1,2,3,4] and first unique element from array is 3
         */


int[] numbers =  new int[7];
        Scanner input = new Scanner (System.in);
//because asking user every number so we need to create for loop to repeat
   for(int i = 0;i < numbers.length; i++) {

       System.out.println("enter number for array");
       numbers[i] = input.nextInt();
   }
      //check if number is unique

boolean  isThereUniqueInArray = false;
    OUTER: for(int i = 0; i <numbers.length; i++) {
       int num = numbers[i];//store

       //we should check all the number in array except itself
       //number itself which is number [i]
       //if any number equal to number[i] other than number[i] means number[i] is not unique

       boolean isNumUnique = true;
       for (int k = 0; k < numbers.length; k++) {
           if (num == numbers[k] && i != k){
              isNumUnique = false;
           }
       }
       if(isNumUnique){
           System.out.println(num);
           isThereUniqueInArray = true;
           break OUTER;
       }


   }

    if(isThereUniqueInArray == false){
        System.out.println("Array doesn't have any unique element");
    }




    }
}
