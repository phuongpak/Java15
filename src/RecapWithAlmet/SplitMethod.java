package RecapWithAlmet;

import java.util.Arrays;

public class SplitMethod {
    /*

String str="Hello Java is so good"

output:olleH avaJ si  os doog
       avaJ
       si
       os
       doog


     */
    public static void main(String[] args) {
        String str="Hello Java is so good";
        //access each word seperately
       String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));

        String reverse ="";
        for(String word : array){//first loop taking hello, i have hello here
           reverse ="";

            for(int i= word.length()-1; i>=0 ; i--){//second loop i am taking reverse
                reverse+=word.charAt(i);//adding one by one in reverse : o l l e h
            }

           // System.out.println(reverse);//remove ln  and + " " , it will print next it other
            System.out.print(reverse + " ");

        }


    }
}
