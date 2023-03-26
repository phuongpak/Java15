package Project2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Using the scanner asks the user to enter one sentence with three words
        and print the index number of each word's last character
        and then print the sum of each index number that you found.
         For Example:
          Input:
          "Importance of Human" --> it can be any three-word sentence
         Output
         9 --> index number of 'e'
          12 --> index number of 'f'
         18 --> index number of 'n'
       The sum: 39

         */

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter once sentence with only three words");
        String sentence = input.nextLine();

        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ", firstSpace + 1);

        System.out.println(firstSpace - 1 + "index number of " + sentence.charAt(firstSpace-1));//firstSpace-1 will give letter
                                                // sentence.charAt(firstSpace) will give number

        System.out.println(secondSpace-1 + " index number of "+ sentence.charAt(secondSpace-1));
        System.out.println(sentence.length () - 1 + "index number of " + (sentence.length()-1 ));











    }

}
