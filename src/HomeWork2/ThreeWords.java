package HomeWork2;

import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {


     /*
        Scanner object is created in main class and user is asked input one string value with three words .

    1- Find the first word, second word, and third word from the string and create three different string variables for them.
    2- Print first word, second word and third word from the threeWords string in order.
    2- Print the first char of those three string together.
    3- Print the last char of each string together.
    4- Print true if each of the word length is equaled to each other.

    EXAMPLE:
    Input : We Love Java
    OUTPUT:
    We -> First word
    Love -> Second word
    Java -> Third word
    WLJ  -> Initials of words
    eea  -> Last letters of words.
    false   ->(since every word in string doesn't have the same value.)
      */

        System.out.println("Please enter a string with three words.");
        String threeWords = new Scanner(System.in).nextLine();

        int firstSpace = threeWords.indexOf(' ');
        int secondSpace = threeWords.indexOf(' ',firstSpace + 1);

        String firstWord = threeWords.substring(0,firstSpace);
        String secondWord = threeWords.substring(firstSpace+1,secondSpace);
        String thirdWord = threeWords.substring(secondSpace+1);


        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        String firstChar1 = "" + firstWord.toUpperCase().charAt(0);//can do three together using only one ""
        String firstChar2 = "" +  secondWord.toUpperCase().charAt(0);
        String firstChar3 = "" + thirdWord.toUpperCase().charAt(0);
        System.out.println(firstChar1+firstChar2+firstChar3);

        String lastChar1 = "" + firstWord.charAt(firstWord.length()-1);
        String lastChar2 = "" +  secondWord.charAt(secondWord.length()-1);
        String lastChar3 = "" + thirdWord.charAt(thirdWord.length()-1);
        System.out.println(lastChar1+lastChar2+lastChar3);

        if(firstWord.length()==secondWord.length()) {
            if(secondWord.length() == thirdWord.length()){
                System.out.println("true");
            }

        }else{
            System.out.println("false");
        }

//or we can use boolean to do it
        boolean isLengthSame = firstWord.length() == secondWord.length() && secondWord.length() == thirdWord.length();
        System.out.println(isLengthSame);



    }
}
