package Project2;

import java.util.Scanner;

public class TestHomeWork {
    public static void main(String[] args) {


        float var1 = 4;

       // float var2 = 4.8;//no
        //java will compile every decimal number as double value
        //therefor we have to cast this double value to float
        //since we have to do explicit casting when we cast bigger data type to lower data type


        float var2 = 4.8f;//this is shortcut of casting/
        var2= (float)4.8;//casting
        double d = 1_000_000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string value");
        String firstString = scanner.next();
        System.out.println("Enter second string value");
        String secondString = scanner.next();
        // Please find out if the secondString starts with last two characters of the firstString
        // Please do not change anything on lines above.

        //make both cases the same to lowercase

        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        //find 2 last characters using substring
        //1. firstString.length()-1
        //2. firstString.length()-2

        String lastTwoCharactersOfFirstString = firstString.substring(firstString.length()-2);

        String firstTwoCharactersOfSecondString =
                secondString.substring(0, 2);//it include o and 1 but not 2
        boolean equal = lastTwoCharactersOfFirstString.equals(firstTwoCharactersOfSecondString);
        System.out.println(equal);




    }

}
