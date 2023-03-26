package RecapWithAlmet;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringAndMethod {

    /*
   // //////using java words is better like initialize, declare//
    POSSIBLE INTERVIEW QUESTION:
    1 -> Most of the technical questions are related with String and its Methods?

    2 - What is the different between (.)  and (==) ?

    String (.equals) --> Making a comparison of "TWO VALUE" : FOCUS ON VALUE
    String name = "AHMET";
    String anotherName = new String ("AHMET");

    sout(name.equals(anotherName));
    sout(name == anotherName);

    --> First of all, that is a great question and a tricky question. I do not use a lot (==) for
    String value comparison other than other primitive types (int, long)
    when I use String.equals method, it compares only the VALUE of the data
    when i use == which compares not only the VALUE but also LOCATION of the object

     3 - what is String and how do you declare ?
    //GENERAL DESCRIPTION:
     String is an object that used to store some data
     //YOU CAN GO DEEP
     String has some specific methods that we use for any purpose like comparison
     I can declare the String with Two WAYS:
         1-String str;(semicolon) DECLARE : Means you create a bucket without assigning any value
           String str2 = "AHMET"; INITIALIZE : means you create a bucket with assigning a value
         2-String str3 = new String(); DECLARATION
           String str4 = new String("AHMET") INITIALIZATION

     4 -STRING METHODS : * MEANS IT IS REALLY IMPORTANT NOT ONLY FOR TECHNICAL BUT ALSO AUTOMATION
        1-INDEXOF() --> IT GIVES YOU THE INDEX NUMBER OF CHARACTER. IT RETURNS --INT--. IT STARTS FROM 0
        2-LENGTH() ---> IT GIVE YOU THE SIZE OF THE DATA (VALUE). IT RETURNS --INT--
        3-CONCAT () -> IT IS A WAY TO COMBINE TWO OR MORE VALUES. (CONCAT() OR "+" ). IT RETURNS --STRING--
        4-SPLIT() --> IT IS A WAY TO CUT THE WORDS FROM SPECIFIC SPOT. IT RETURNS --STRING ARRAY--
        5-STARTSWITH() --> IT CHECKS THE VALUE STARTS WITH A SPECIFIC CHARACTERS/WORDS. RETURN --BOOLEAN--
        6-ENDSWITH() -->IT CHECKS THE VALUE ENDS WITH A SPECIFIC CHARACTERS/WORDS. RETURN --BOOLEAN--

     ** 7-SUBSTRING() --> IT IS A WAY TO GET SPECIFIC CHARACTER/WORDS FROM STRING. IT RETURNS STRING
     ** 8-CHARART()--> IT GIVES YOU THE CHARACTER OF A SPECIFIC INDEX SPOT.IT RETURN --CHAR--
    ***9- CONTAIN() --> IT CHECKS THE VALUE HAS THE DATA THAT YOU ARE LOOKING FOR. IT RETURNS --BOOLEAN--
    *** 10-TRIM() --> IT REMOVES THE SPACES FROM BEGINNING, FROM END.
   * 11-REPLACE () --> IT REPLACES THE SPECIFIC CHARACTER/WORDS IN STRING. RETURN --STRING--
    ***12-EQUALS() -->IT COMPARES TWO VALUES OF VARIABLE. RETURN -BOOLEAN-
    *13-EQUALIGNORECASE() -->IT COMPARES TWO VALUE OF VARIABLE WITHOUT CASE SENSITIVITY
    *14-VALUEOF() -->IT CONVERTS THE DIFFERENT DATE TYPE TO STRING TYPE. IT RETURN -STRING-
    15-TOUPPER/TOLOWER --> it changes the characters to upper or lower case. it returns STRING

     TIPS: Once you are explaining anything in IT:

     1-Use IT Terminology ---> declare, initialize ect...
     2-Explain from general to deep




         */


    public static void main(String[] args) {
        /*
        String name = "AHMET";
        String anotherName = new String ("AHMET");

        System.out.println(name.equals(anotherName));//true cuz only care about value
        System.out.println(name == anotherName);//false// not only values but also location so it is false

        System.out.println(name.hashCode());//62250037
        System.out.println(anotherName.hashCode());//62250037

         */


        String str = "Ahmet loves Java";
        String str1 = new String("Ahmet loves Java");//whenever we have new string,, we have new location
        String str2 ="Ahmet loves Java";
        String str3 = new String("Ahmet loves Java");

        System.out.println(str.equals(str1));//comparing value, true, name value
        System.out.println(str1 ==str3);//false//i am not only comparing value but also location
        System.out.println(str ==str2);//true//both of them are under String pool
        //command + / slash
        System.out.println(str.indexOf('t'));//index of --> 4--> index starts from 0
        System.out.println(str.length());//16-->length starts from 1
        System.out.println(str.concat(" " + str2));//

        String[] words = str.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(Arrays.toString(words));//this is STRING ARRAY
        // String str2 ="Ahmet loves Java";
        System.out.println(str2.startsWith("Ahmet"));//TRUE
        //IF
        str2.replace("Ahmet","ahmet");//the value is still true. string is immutable, you need to reassign the value
        str2 = str2.replace("Ahmet","ahmet");
        System.out.println(str2.startsWith("Ahmet"));//now it is false
        System.out.println(str2.endsWith("VA"));//FALSE

        char character = str.charAt(3);
        String sbsr = str2.substring(3,4);//number.sub(1) numbers.replace("$","")
         System.out.println(character);
        System.out.println(sbsr.toUpperCase());
        System.out.println((sbsr.toLowerCase()));

        String exp = "Hello Guys";
        String exp2 = "hello guys";
        System.out.println((exp2.equalsIgnoreCase(exp)));//I would use 99 percent equals for validation

        int number = 5;
        int number2 = 3;//want 53
        String bucket = String.valueOf(number) + String.valueOf(number2);
        System.out.println(bucket);

        boolean result = str2.contains("av");//Ahmet loves java
        System.out.println(result);//true

        String lastExample =" We are completing String";//this one has space
        String lastExample2 ="We are completing String";
        System.out.println(lastExample.equals(lastExample2));//show false cuz the space
        //fix it
        String lastExampleFix =" We are completing String".trim();
        System.out.println(lastExampleFix.equals(lastExample2));//true now

    }
}
