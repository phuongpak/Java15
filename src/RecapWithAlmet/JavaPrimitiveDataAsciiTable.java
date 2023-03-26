package RecapWithAlmet;

public class JavaPrimitiveDataAsciiTable {
    /*

    Possible Interview Questions:

    1-What is Java and what do you know about JDK, JVM, JRE?

    Java: is programming language. To make a connection between computer and people.

    JDK: Java Development Kit that has some libraries which support the "application development"
    JRE : Java Run Time Environment which is responsible for "EXECUTION"(the code)
    JVM: Java Virtual Machine  ---> It is a virtual machine which is responsible
         for "converting the BYE code to Binary code(0,1)"

    PRIMITIVE DATA: it is a way to store the data in it. It doesn't take up too much space in memory.

    WHOLE NUMBERS:  DECIMAL NUMBERS:        CONDITION         CHARACTER
    ->BYTE          ->FLOAT                 ->boolean           -> char
    ->SHORT         ->DOUBLE **
    ->INT ***
    ->LONG *

    ASCII TABLE : It is a table for all the character (alphabet, digits, symbol ect...)

    short a = 5;
    short b = 6;
    short c = a + b -5; //compile run time because java want us to use int, what ever you implement the data, you need to use int
    sout(c);


     */


    public static void main(String[] args) {
        short a = 5;
        short b = 6;
        int c = a + b -4;//cannot use short
        System.out.println(c);


        char letter = 65;
        char letter2 = 'g';
        int number = 'g';//go to Ascii table and look for number of 'g', i am expecting int number

        System.out.println(number);//103// the value is 'g', but we want it in int so from ascii talbe is  65
        System.out.println(letter2 - letter);//103-65//java understand this is math here,  it looking for number so it casting automaticly
        System.out.println(letter2);//103 or g--> g cuz it looking for character
        System.out.println(letter);//A or compile time-> A cuz it is char

        int number1 = 5;
        int number2 = 21;

        boolean condition = number1 > number2;
        boolean condition2 = number2 > number1;

        System.out.println(condition2);//true
        System.out.println(condition);//false

        double amount = 24.5d;
        double amount2 = 0.34546563;//no need to put d at the end, it is optional

        System.out.println(amount2);
        System.out.println(amount);

         //int allAmount = amount + amount2; //;complile error
        //the bucket store is not enough, either casting it or change  it to double

        int allAmount1 = (int) (amount2 + amount);
        System.out.println(allAmount1);
       double  allAmount = amount + amount2;
        System.out.println(allAmount);


    }




}
