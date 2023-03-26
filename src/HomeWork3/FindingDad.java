package HomeWork3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindingDad {
    public static void main(String[] args) {

       /* Using scanner the user is asked to provide the string value.
                Print "dad" if the given string contains the "dad", BUT where the middle
        'a' char can be any char. Otherwise please do not print anything.

                Please look at examples below CAREFULLY.
                Example:
        Input the year: testdadtest
        Output:dad
        Input the year: testd7dtest
        Output:dad
        Input the year: testdodtest
        Output:dad
        Input the year: testDudtest
        Output:dad
        input : ttttdlllld
        Output :

        */
        //here, what we look for is d*d
        // represent d*d with indexNumber is i * i+2
        //we want java reach out every letters to looks for this d*d --> use for loop

        System.out.println("Enter a string value");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // Please don't change anything on the lines above.

        for(int i = 0; i + 2 < str.length(); i++){
            //take the largest indexNumber i+2 < length
            if(str.charAt(i) == 'd' && str.charAt(i+2) == 'd' ){
                System.out.println("dad");

            }

        }









    }
}
