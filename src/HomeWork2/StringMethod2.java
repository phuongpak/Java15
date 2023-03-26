package HomeWork2;

import java.util.Scanner;

public class StringMethod2 {
    public static void main(String[] args) {

        // Please do all coding here

        Scanner user =new Scanner(System.in);

        System.out.println("Enter a random word");
        String randomWord = user.nextLine(); // -> User enters a random word.

        System.out.println("Enter number of letter that word consists of");
        int numberOfLetters = user.nextInt();  // -> User tries to enter number of letters that word consists of.

        System.out.println("Enter a letter that you want to learn its index");
        String enteredLetter = user.next(); // -> User enters a letter to learn its index.

        // Please don't change anything on lines above.

    // Checking user's guess for the length of string.
    // Actual length of string
    int acLength = randomWord.length();
    boolean is_Guess_Correct = acLength == numberOfLetters;
    System.out.println(is_Guess_Correct);
    // TO learn index of entered letter i can use indexOf method in java
    // indexOf method will return -1 if the string doesn't contain the passed parameter.
    // ex: "Techtorial".indexOf("z") -> -1
    System.out.println(randomWord.indexOf(enteredLetter));



    }
}
