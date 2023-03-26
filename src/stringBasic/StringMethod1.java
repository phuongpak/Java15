package stringBasic;

public class StringMethod1 {
    public static void main(String[] args) {


        String str = "Sunday"; // any data"" we would like to use

        //length(); count number of characters in given string and return it as int (number)

        int number = str.length();// 6, cuz  the word "sunday" has 6 characters
        System.out.println(number);

        str += " is a rainy day";
        int number1 = str.length();
        System.out.println(number1);//count spaces also

        //concat()
        //str.concat();//mean it wants us to put something in (), just need to type"" it will show below str:

       str = str.concat(" and java is getting easy");// put the right side into str again or wherever you want
        System.out.println(str);

        //charAt(); it will return a single char from given position on a string
        //we do have string above already or change string to a different like "re d$"

        str = "re d$";

       char symbol =  str.charAt(4);
        System.out.println(symbol);//$
       char symbol2 =  str.charAt(0);
        System.out.println(symbol2);//r
        System.out.println(str);//re d$

        //want to take last char from given string, but you do not know the index number for last char

       int count =  str.length();
      char last =  str.charAt(count - 1);
        System.out.println(last);//$ or

        System.out.println(str.charAt(str.length() - 1));//str.charAt(5-1)/ 4 is $






    }
}
