package arrays;

import java.util.Scanner;

public class ObjectArrayPractice {
    public static void main(String[] args) {


        String str = new String("test" );//String and Scanner are objects but different data type

        int number1 = 9;

        boolean bl1 =  true;

        double d1 = 9.8;

        Scanner scanner = new Scanner(System.in);
        //data type object can contain/ cover all different data

       // String[] example = {str, number1...}cannot store


        Object [] example = {str, number1, bl1, d1, scanner};


         for(Object ex : example){
             //System.out.println(ex);/// test, 9, true, 9,8, java.util.Scanner[delimiters.....(just scanner object)
             System.out.println(ex.toString().charAt(0));//convert all to string and take the first char so it will
             //print all the first one : t,9,t,9,j

         }




    }
}
