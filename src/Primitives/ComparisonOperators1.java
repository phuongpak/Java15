package Primitives;

import java.sql.SQLOutput;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        //==
        int a = 4,  b = 4;
        System.out.println(a==b);//true, we can store the result in boolean

        boolean result1 = a==a;
        System.out.println( result1 );//true cuz inside result is true

        System.out.println( result1 == true);//
        boolean result2 = ++a== 2+ 3;// a la 5 now
        System.out.println(result2);// true

        System.out.println( 7 ==8 );// false

        //!not equals to

        int num1 = 6, num2 = 6;

      //if we want   num1 != num2; we store in boolean
        boolean result3 = num1 != num2;
        System.out.println(result3);//false
        System.out.println(num1 != 2);// true cz the statement is 6 is not equal 2 is true

        char letter = '9';
        System.out.println(letter != 9);// true cuz '9' is 57 in ASCII TABLE

        char letter2 = 'A';
        System.out.println(letter2 != 65);//false cuz the value of A is 65, statement is 65 is not equals 65 is false
        System.out.println(letter2 == 65);// True

        System.out.println( 't' != 'T');// NOT EQUAL, SO TRUE CUZ LOWER CASE IS NOT EQUAL TO UPPER CASE

        // >greater than

        System.out.println( 0 >1);//False

        boolean result4 = 0 >1;
        System.out.println(result4); //false (the value is false)

        System.out.println( (10 * 2) > ( 9 + 10 ));//true

        System.out.println( 'A' > 'a');// 65 > 97 ==> false

        //<--- less than

        System.out.println( 67 < 90);// true

        double d1 = 1.25, d2 = 12.5;

        boolean result5 = d1 < d2;
        System.out.println(result4 != result5);//result 4 is false, result5 is true so it is true
        System.out.println("+++++++++++++");
        // >= greater than or equal to

        System.out.println( 7 >= 7);// true

        int count = 34;
         count += count;// 68 count = count + count;

         int count2 = count + count;// 68+ 68 = 136
         boolean result6 = count >= count2; // 68>= 136 is false

        System.out.println( " result6 is " + result6);//false

        //<= less than or equal

        System.out.println( 4 <= 8);// true
        System.out.println( 6 <= 6);// true
        System.out.println(9 <= 8);// false
        System.out.println( 'a' <= 'b');//97 <= 98 true

        System.out.println("hi" == "bye");//false
        System.out.println("hi" =="hi");//true

       // System.out.println( "hi" > "hi");// cannot compare

        int x = 'b';// inside b is 98
        int y = x;// x is x from line 83, y = 98 from x
        System.out.println(x>y);//false cux they are the same 98 > 98












    }
}
