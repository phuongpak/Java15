package arrays;

import java.sql.SQLOutput;

public class Practice6 {
    public static void main(String[] args) {


        char[] symbols = {'a','#','9','W','3','6','@'};

        //1.print out only numbers//create loop and index number go all the way to length
        //char contain only single character so base on number the largest one  is 9,


       // for(int i = 0; i < symbols.length; i++){

        //if(symbols[i] > '0'&& symbols[i] <= '9'){
         //       System.out.println(symbols[i]);
          //  }
        //}
        // 2.print out other symbols (a','#','@')//not printing letters and numbers
        //3. count digits, letters, and other symbols//whenever we find it , we count it
        //there ...2 letters
        // there are ...4 digits
        //4. can we store numbers in to a new array?yes

        int digitCount = 0, letterCount = 0, othersCount = 0;

        for(int i = 0; i < symbols.length; i++){

            if(symbols[i] >= '0'&& symbols[i] <= '9'){
                digitCount++;
                System.out.println(symbols[i]);

            }else if (symbols[i] >= 'a' && symbols[i] <='z'  || symbols[i] >= 'A' && symbols[i] <= 'Z'){
                letterCount++;
                System.out.println("THESE are Letters " + symbols[i]);

            }else{
                othersCount++;
                System.out.println("Others " + symbols[i]);//
               }
        }
        System.out.println("There are " + digitCount + " digits ");
        System.out.println("There are " + letterCount + " letters");
        System.out.println("There are " + othersCount + " other symbols");



    }
}
