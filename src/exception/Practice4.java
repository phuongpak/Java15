package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        FileInputStream stream = new FileInputStream("Test");


       // Scanner scanner = new Scanner(System.in);//we learn : this one is taking from user

        Scanner scanner = new Scanner(stream);//we want take it from data file
        //we use while to reach out data

        while(scanner.hasNext()){
            System.out.println((scanner.next()));
            System.out.println("$");//how many line we hava in the test, it will show $ sign after the lines
            Thread.sleep(3000);//show exception, we add exception on main line, // then every 3 second, it will run
        }

        int number = 25, day = 26;

        if(day < number){
            throw new RuntimeException();//if condition true, we see the "RuntimeExeption'', if true, we will se the sout
        }
        System.out.println("This is final example!!");


    }
}
