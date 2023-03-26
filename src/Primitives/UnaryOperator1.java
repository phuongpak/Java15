package Primitives;

import java.sql.SQLOutput;

public class UnaryOperator1 {

    public static void main(String[] args) {

        int studentNumber = 23;
        System.out.println(studentNumber);//23

        studentNumber++;
        System.out.println(studentNumber);//24
        ++studentNumber;
        System.out.println(studentNumber);//25

        //
        System.out.println("===========");
        System.out.println(studentNumber++);// 25 it shows 25 studentNumber first then java increase 1 more step later
        System.out.println(studentNumber); //26 java read from top to bottom, we do operation a lot of steps

        System.out.println("=======");
        System.out.println(++studentNumber);//27 (our number is 26, increase 1 first, then add number 26)
        System.out.println(studentNumber);// now our number is 27

        //------
        studentNumber++;
        System.out.println(studentNumber);//28
        System.out.println(studentNumber++);// show 28, value became 29 behind the scene if we have more step
        System.out.println(studentNumber); //29

        //======
        int number = 12;

        //preDecrement;
         --number;
        System.out.println(number);//11

        //postDecrement;
        number--;
        System.out.println(number);//10

        //different btw pre and post

        System.out.println( --number   );// show 9 and value is 9
        System.out.println(number);// value is 9
        System.out.println("++++++");
        System.out.println(number--);//show 9 and value is 8 show later next step
        System.out.println(number);//show 8 now





    }
}
