package HomeWork2;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {

/*
The value of the password has already been assigned using scanner.

We asked the user to create a new and valid password.
The valid password must contain at least one upper case and at least one lower case letter.
Print true when the password is valid, if not print false.

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create a new and valid password.");
        String password = scanner.nextLine();

        //compare the password user create with that password upperCase and see if it is true, mean there is
        //no lowercase in that password, but we want false, we want lowercase in that
        //ABCde ostr (origional string)   toupperCase -->  ABCDE  upperCase Version(ucv)
        //ostr.equals.ucv---> true, mean there is no lowercase in string, that is why we need false

        boolean isThereUpperCase = password.equals(password.toLowerCase())== false;
        boolean isThereLowerCase = password.equals(password.toUpperCase())==false;

        System.out.println(isThereUpperCase && isThereLowerCase);






    }
}
