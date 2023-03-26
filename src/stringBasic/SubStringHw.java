package stringBasic;

import java.util.Scanner;

public class SubStringHw {
    public static void main(String[] args) {

        /*
        take and print the middle word using dynamic solution

         */


        Scanner scanner = new Scanner (System.in);
        System.out.println("please enter a 3 word sentence");

        String text = scanner.nextLine();

        int space1 = text.indexOf(' ');
        int space2 = text.indexOf(' ', space1+1);

        String middleWord = text.substring(space1, space2);
        System.out.println(middleWord);



    }
}
