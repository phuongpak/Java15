package HomeWork4;

import java.util.Scanner;

public class AllUniqueFromArray {
    public static void main(String[] args) {
        /*
        Create the int array size of 13 and store every number by asking user via scanner in the loop.
When asking user please use the text -> "Enter number for array" .
After having all numbers for array print ALL unique values from this array.
If the array doesn't have any unique element print the text below
"Array doesn't have any unique element"

EXAMPLE OUTPUT:
Enter number for array
5
Enter number for array
6
Enter number for array
4
Enter number for array
5
Enter number for array
6
Enter number for array
7
Enter number for array
9
Enter number for array
0
Enter number for array
0
Enter number for array
0
Enter number for array
0
Enter number for array
0
Enter number for array
0
4 7 9  -> Since the array is [5,6,4,5,6,7,9,0,0,0,0,0,0] only unique numbers are 4 7 9

NOTE: When you print unique numbers put space between them


         */

        int[] numbers  = new int[13];
        Scanner s = new Scanner(System.in);

        //first, asking user to enter the number repeatedly 13 times so use for loop

        for(int i =0 ; i< numbers.length; i++){

            System.out.println("Enter number for array" );
            numbers[i] = s.nextInt();
        }
    //check unique number
        //[5,6,4,5,6,7,9,0,0,0,0,0,0]// check 5 with the rest, check 6, the before 6 and after 6,
        //means without checking itself

        boolean doesArrayHasUniqueNumbers = false;
        for(int i =0 ; i< numbers.length; i++) {
            int num = numbers[i]; //this is number user enter store in num

            boolean isNumberUnique = true;
            for (int k = 0; k < numbers.length; k++) {
                if (num == numbers[k] && i != k) {
                    //if this condition true, mean the number is not unique
                    //if i = 0, k = 0 . number is 5=5 does not mean unique so i not equal k
                    isNumberUnique = false;
                }
            }
            //after for loop
            if (isNumberUnique) {
                System.out.print(num + " ");// remove ln , to print unique numbers in the same line
                //after this line, we know array has at least one unique number so boolean is true
                doesArrayHasUniqueNumbers = true;
            }
        }


            //after all loop, we print false if no unique numbers in array
            if (doesArrayHasUniqueNumbers ==false) {
                System.out.println("Array doesn't have any unique element");
            }











    }
}
