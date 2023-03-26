package scannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        //I will print my first name

        String firstName = "Alex";
        System.out.println("My first name is " + firstName);//

        //I want to get last name from user and print ---> "your last name is ..."
        Scanner scanner = new Scanner(System.in);

        //after the Scanner import, we are able to type in the result machine but dont see.
        // Scanner.nextLine();Scanner hit enter mean whatever come will read the next line

       // String lastname = "Brown";
        String lastName = scanner.next();// take data only one time from user typing and store in lastname
        System.out.println(lastName);//
        System.out.println("your last name is " + lastName);// every time run code, we can type in "result part"

        lastName = lastName + "$$$";
        System.out.println(lastName);//

        //example, get name of the city from user and say " Phuong Pak, you are living in......"
        // we need string, want to get it from user, so use scanner

        String city = scanner.next();//take data

        System.out.println(firstName +" "+ lastName +""+ " you are living in "+ city);




    }
}
