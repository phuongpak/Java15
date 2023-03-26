package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {

       // int number = 123; --> sum of digits from given number
        int number = 123;
        System.out.println("number is " + number);
        int digit1 = number % 10;
        System.out.println(" digit1 is " + digit1);


        number = number / 10; // the result is 12 and store in the  number name
        System.out.println(" number is now "+ number);//12
        int digit2 = number % 10;
        System.out.println("digit2 is" + digit2);//2

         number = number / 10;//1
        System.out.println("number is now " + number);

        int sum = digit1 + digit2 + number;
        System.out.println(" the sum of digits is " + sum );




    }
}
