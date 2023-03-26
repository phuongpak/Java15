package arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String str = "Selennium";// return String

       String[] parts = str.split("n");//
        System.out.println(Arrays.toString(parts));//[Sele, ium]

        System.out.println(str);

        System.out.println(parts[1]);//nothing , cuz it is space
        System.out.println(parts.length);//3

        parts[1] = "abcd";
        System.out.println(Arrays.toString(parts));//[Sele, abcd, ium]

        //csv file

        //today is saturday, Anna Jake, Alex Diana
        //want to separate word by word, reference is space// use spit method

        //////
        String str2 = "It is a good day to practice Java. It is snowing outside.";
        //do not want to see .
        str2 = str2.replace(".", ""); // restore back into str2
        //store every word in an array

        String[] parts2 = str2.split(" ");//store
        System.out.println(Arrays.toString(parts2));

        // new task
        //new array [It, is, a, good, day, to, practice, Java, It, is, snowing, outside]
        String[] items =
                {"It", "is", "a", "good","day", "to", "practice", "Java", "It", "is", "snowing", "outside"};
        //want to make a sentence from the String, put all pieces together










    }
}
