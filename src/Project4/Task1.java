package Project4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       /*
        Reverse a given String and print it, if they have space in the
beginning and at the end then remove it. Try doing with for
loop or while loop.

Example: " Job" -> "boJ"
* " Happy " -> "yppaH"
* "Sun " -> "nuS"
* " Dream Job!" -> "!boJ maerD"
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();

str =  str.trim();
        System.out.println(str);

       /* String reverse ="";

        for(int i = str.trim().length()-1; i>=0;i--){
            reverse = reverse + str.charAt(i);


            }
        System.out.println(reverse);

        */




    }
}
