package Primitives;

public class CharPractice {
    public static void main(String[] args) {

        char letter1 = 'A';
        System.out.println(letter1);//A

        char symbol = '*';
        System.out.println(symbol);//*

        char letter2 = 'z';//122 (table ASCII)
        System.out.println(letter2);//lowercase z

        char symbol2 = '6';
        System.out.println(symbol2);

        System.out.println( symbol2 + letter2 );// expectation is 6, some number from ASCII TABLE

        int symbol3 = 'z';
        System.out.println(symbol3);//122

        char symbol4 = 90;
        System.out.println(symbol4); // Z

        //try to do similar implementation for your first initial
        //p

        char init = 'P';
        char initAsNumber = 80;
        int initAsChar = 'P';
        System.out.println(init);//show letter from table
        System.out.println(initAsNumber);
        System.out.println(initAsChar);

        // you want to print everything as is on the single print

        System.out.println( " " + init + initAsNumber + initAsChar);
        System.out.println("" + init + "_" + initAsNumber + "_" + initAsChar );






    }






}
