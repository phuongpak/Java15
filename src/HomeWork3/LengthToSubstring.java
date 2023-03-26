package HomeWork3;

import java.util.Scanner;

public class LengthToSubstring {
    public static void main(String[] args) {

        /*
        Using scanner user is asked to enter one string value.
If this string length is odd number print middle 3 string from given value.
If the string length is even number print string without first letter.
 (You need to use if statement for this task)
Example 1:
Please enter the String value:
test
The output is:
est

Example 2:
Please enter the String value: Ch ica go // 7 //
The output is:
ica
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String string = s.next();
        // Please don't change anything on lines above.

        if(string.length()%2 == 0){
            System.out.println(string.substring(1));//cuz substring(0) will include o but we need to remove t from test
            //so substring has to be from 1

        }else{
            int middle =  string.length()/2;
            System.out.println(string.substring(middle-1,middle+2 ));//include middle-1, exclusie middle + 2
        }



    }
}
