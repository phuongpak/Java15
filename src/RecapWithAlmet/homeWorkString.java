package RecapWithAlmet;

import java.util.Scanner;

public class homeWorkString {
    public static void main(String[] args) {




    /*
 USING SCANNER: Ask user to enter one string value with 3 words
  1-Print first letter of Each Word
  2-Print last letter of each Word
  3-Print the total index of first letters//
  4-Print the sum of the last letter of each word's index number
  5-Print the difference between total last index and total first index

  CLUES:I would use if condition for charAt and ' '

  EXAMPLE:"Ahmet Loves Java"
  //output:ALJ//find index of these and total int
  //output:tsa//do the same
  //output:18
  //output:29
  //output:11

  NOTE:YOu can use either one or two loops.
     */

        //SCANNER FIRST
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter one string value with 3 words");

        String words = scanner.nextLine().trim();//store user 3 words into String bucket
        //reach out every word, i = space, i+1: first letter, i-1 : last letter

        String firstLetters = "";
        firstLetters += words.charAt(0);//add first letter or first word

        String lastLetter ="";
        //lastLetter += words.charAt(words.length()-1); cannot because we need to add this letter last

        int totalIndexOfFirstLetters = 0;
        int sumOfIndexOfLastLetters = 0;

        for(int i = 0; i < words.length(); i++){

            if(words.charAt(i) ==' '){
                firstLetters += words.charAt(i+1);
                lastLetter += words.charAt(i-1);
                totalIndexOfFirstLetters += i+1;
                sumOfIndexOfLastLetters += i-1;
            }

        }
        lastLetter += words.charAt(words.length()-1);
        System.out.println(firstLetters);
        System.out.println(lastLetter);

        System.out.println(totalIndexOfFirstLetters);
        sumOfIndexOfLastLetters += words.length()-1;//index of last word
        System.out.println(sumOfIndexOfLastLetters);
        //System.out.println(sumOfIndexOfLastLetters -  totalIndexOfFirstLetters);//should use ternary if do not know which number is bigger
        int result =
                totalIndexOfFirstLetters > sumOfIndexOfLastLetters ? totalIndexOfFirstLetters - sumOfIndexOfLastLetters : sumOfIndexOfLastLetters - totalIndexOfFirstLetters;
        System.out.println(result);
    }
}
