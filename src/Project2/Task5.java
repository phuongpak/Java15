package Project2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Using a scanner enter three different ingredients for the product on the same line.
        Then ask the user to enter any int number.
        Change the first letter of the ingredients starting from the entered number.
        (Ingredients should start with different letters. Please read the example carefully )
         Example 1:
        Please enter three ingredients with spaces:
        Milk Peanuts Butter
        Please enter the int number: 5
        The output is:
            5ilk 6eanuts 7utter
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your three ingredients");

        String ing = input.nextLine();
        System.out.println("Please enter your number");
        int number = input.nextInt();

        int space1 = ing.indexOf(" ");
        int space2 = ing.indexOf(" ", space1 + 1);

        //take each word
        String word1 = ing.substring(0,space1);
        String word2 = ing.substring(space1+1, space2);
        String word3 = ing.substring(space2+1);//or (space2+1)
        //take first letter of each word

        String firstLetterOfFirst = "" + word1.charAt(0);//use "" cuz the method return to char but we store in String
        String firstLetterOfSecond = "" + word2.charAt(0);
        String firstLetterOfThird = ""+ word3.charAt(0);
        //to put a number in the string, we convert it

        String convertNum = "" + number;//cuz number is int, store in string

        String replaceWord1 = word1.replace(firstLetterOfFirst,convertNum);//because convertnum is number so we have to
                //create
        number++;

        String convertNum2 =""+ number;
        String replaceWord2 = word2.replace(firstLetterOfSecond, convertNum2);

        number++;
        String convertNum3 = ""+number;
        String replaceWord3 = word3.replace(firstLetterOfThird, convertNum3);

        //now we need to put all words together back

        System.out.println(replaceWord1 +" " + replaceWord2+" "+replaceWord3);










    }
}
