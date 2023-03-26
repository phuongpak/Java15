package scannerPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //We will figure out initialS of a person
        // John Deere ---> JD

        System.out.println("Please enter your first name");// take string data cuz text
        //to take string data, nextLine() or next()

       // char firstInitial = scanner.nextLine();// no work cuz we put string into char, not possible, right part is string
        char firstInitial = scanner.nextLine().charAt(0);//start from o
        System.out.println(firstInitial);

        // please do above the process for his last name

        System.out.println("Please enter your last name");
        char secondInitial = scanner.nextLine().charAt(0);//0 cuz we want to take first letter,
        System.out.println(secondInitial);

        //can we combine first and last initials

        System.out.println(""+ firstInitial+secondInitial);// have to have "" if not, it will show the number




    }
}
