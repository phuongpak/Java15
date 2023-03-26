package HomeWork3;

import java.util.Scanner;

public class BlueOrRed {
    public static void main(String[] args) {
        /*
        Using scanner the user is asked the to enter any String value.
If this String has letters of red or blue with lower case print the red or
blue. Other wise do not print anything.
EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
EXAMPLE-3
Input : "rllltteaaadkkk"
Output: red
EXAMPLE-4:
Input: "rllleell" -> Since the string doesn't have letters of red or blue we shouldn't print anything.
Output:
         */

        System.out.println("Enter a string value");
        Scanner scanner = new Scanner(System.in);
        String str = new Scanner(System.in).next();

        if(str.contains("r") && str.contains("e") && str.contains("d")){
            System.out.println("red");
        }else if(str.contains("b") && str.contains("l") && str.contains("u")&& str.contains("e")) {
            System.out.println("blue");

        }
        System.out.println();
            //OR can use boolean
        //boolean containRed= str.contains("r") && str.contains("e") && str.contains("d");
        //boolean containBlue = str.contains("b") && str.contains("l") && str.contains("u")&& str.contains("e");
        //then use if (containRed){}else if{}

    }
}
