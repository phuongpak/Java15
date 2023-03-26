package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class removeNumber {
    public static void main(String[] args) {
        /*
        Create the int array with  numbers following,
 10,4,3,55,32,145,443,234,98,32  (on the line 5).
Then, using scanner  ask user to provide any number from given array, then remove the
value from array and put 0 instead of that number and PRINT the array.
If array doesn't contain the number PRINT "false".


Example:
Given Number:
145
Output:
[10, 4, 3, 55, 32, 0, 443, 234, 98, 32]

Example 2:
Given Number:
2000
Output:
false

Example 2:
Given Number:
32
Output:
[10, 4, 3, 55, 0, 145, 443, 234, 98, 0]

         */
        int[] numbers = new int[]{10,4,3,55,32,145,443,234,98,32 };

        // Create the array on lines above

        //User is asked for a number below. Please get the number using scanner.
        System.out.println("Please enter number from array");
        Scanner user = new Scanner(System.in);
        int answer = user.nextInt();

        boolean doesArrayContainNumber = false;
        /* WRONG. CHECK IT AGAIN
        for(int i = 0; i < numbers.length; i++){

            if(answer == numbers[i]){
                numbers[i] = 0;
                System.out.println(Arrays.toString(numbers));
            }else{
                System.out.println("false");
            }

        }

         */

        for(int i= 0; i < numbers.length; i++){
            if (numbers[i] == answer){
                numbers[i] = 0;
                doesArrayContainNumber = true;
            }
        }

        if(doesArrayContainNumber == false){
            System.out.println("false");
        }else{
            System.out.println(Arrays.toString(numbers));
        }











    }
}
