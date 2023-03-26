package scannerPractice;

import java.util.Scanner;

public class PracticeName {
    public static void main(String[] args) {

        //want to print my initial name
        // Phuong Pak

        Scanner name = new Scanner(System.in);
        System.out.println("enter your first name");
        char firstname = name.nextLine().charAt(0);

        System.out.println("enter your last name");
        char lastName = name.nextLine().charAt(0);
        System.out.println("your initial name is" + firstname + lastName);
    }
}
