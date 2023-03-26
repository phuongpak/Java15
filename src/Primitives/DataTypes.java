package Primitives;

import java.sql.SQLOutput;

public class DataTypes {

    public static void main(String[] args) {

        byte bt1 = 3;
        System.out.println(bt1);

       // byte bt2 = -128; out of range (-128 to 127)

        short numberSh = 1230;
        System.out.println(numberSh);

        int number1 = 100;
        System.out.println(number1);

        float number5 = 2.3f;
        System.out.println(number5);

        float number6 = .7f;
        System.out.println(number6);

        float number7 = 5f;
        System.out.println(number7);

        double numberD = 2;
        System.out.println(numberD);

        byte b1 = 5;
        short sh1 = b1;
        System.out.println(sh1);// shows 5

        //byte bt2 = sh1;no cannot look at notebook//

       // int age = numberD;// no because of data type, compile time error

       // int age = 2.5;// no cuz int is whole number

        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        int number9 = 1_000_000;
        int number10 = 1234_56_89;
        System.out.println(number9);


    }


}
