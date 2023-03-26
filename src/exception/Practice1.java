package exception;

import java.sql.SQLOutput;

public class Practice1 {
    public static void main(String[] args) {


        try {
            System.out.println("===========");

            int number = 10;
            String str = "B5";//want to convert 5 to 15
            int a = Integer.parseInt(str);//NumberFormatException
            System.out.println(a + 10);

            int result = number / 0; //ArithmeticException//this is problem, java will skip this problem and the rest and go straight to catch

            System.out.println(result);

            System.out.println("I like math");

        }catch(RuntimeException exception1){
            //we can replace ArithmeticException with Throwable
            System.out.println("I caught Exception");

            System.out.println(  exception1.getMessage()  );//it get message from problem

        }
        System.out.println("I like JAVA");


        //SO WE HAVE 2 EXCEPTION, IN THE CATCH(IN HERE). WE CAN USE THE BIGGER OBJECT RuntimeException and it only catch 1 exeption from top
        //to bottom

    }
}
