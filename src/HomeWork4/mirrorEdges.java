package HomeWork4;

import java.util.Scanner;

public class mirrorEdges {
    public static void main(String[] args) {
        /*
                Given a string, look for a mirror image (backwards) string at both the beginning
                and end of the given string.
        In other words, zero or more characters at the very begining of the given string,
        and at the very end of the string in reverse order.

        For example,
        the string "abXYZba" has the mirror end "ab". -> Because ab is in
        the begining also at the end.

        Examples:

        Input : abca
        Output: a

        Input : aba
        Output: aba

        Input : eerqwertyree
        Output: eer

         */
        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        // Check if the variable str has mirror edges.

        String mirror ="";
        for(int i = 0, k = str.length()-1 ; i < str.length(); i++, k--){

                if(str.charAt(i) == str.charAt(k)){
                    mirror +=   str.charAt(i);

            }



        }

        System.out.println(mirror);




       /* String mirror ="";
        for(int i = 0; i < str.length(); i++){
            for(int k = str.length() -1 ;k >= 0; k--){
                if(str.charAt(i) == str.charAt(k)){
                     mirror +=   str.charAt(i);
                }
            }
            System.out.println(mirror);

        }

        */





















    }
}
