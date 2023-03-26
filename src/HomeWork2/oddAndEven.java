package HomeWork2;

import java.util.Scanner;

public class oddAndEven {
    public static void main(String[] args) {

        // Please do not change anything on lines above.
        // The value of the string has already been assigned using the scanner.

        //Please remove all the spaces (" ") from the given string. After removing the spaces from the string,
        //if the string's length is odd print true, otherwise print false.
        //SOLUTION:
        //remove all space can us method: replace, substring...
        //String is immutable object!!!!


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String string = sc.nextLine();

       /* String removeSpaceOfString = string.replace(" ","");

        boolean even = removeSpaceOfString.length()%2 ==0;
        boolean odd = removeSpaceOfString.length()%2 != 0;
        even = false;
        odd = true;
        if (removeSpaceOfString.length()%2 == 0){
            System.out.println(even);
        }else{
            System.out.println(odd);

        }
        */
        //Techtorial solved:

        // because String is immutable object / do not change

        string =  string.replace(" ","");//then now we check length of string
        //odd is 1,3,5,7..
        //even 2,4,6,8...
        //if numbers is giving 0 remainder with true, it means number is given number


        if(string.length()%2 == 0){
            //string length is even
            System.out.println("false");
        }else{
            System.out.println("true");
        }


        //now solve without if
        //I WANT TO PRINT TRUE WHEN  THE LENGTH IS ODD

        boolean isLengthOdd = string.length()%2 ==1;
        System.out.println(isLengthOdd);




    }
}
