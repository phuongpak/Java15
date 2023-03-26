package RecapWithAlmet;

import java.util.Scanner;

public class SwitchStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Some of the technical questions might need switch instead of if statement to show off yourself that you actually know
    how to implement switch as well

    -->if you have limited amount of options and not change it usually then it is good to use switch instead of
    if to make it look professional

    Switch(value/reference) --> int number = 5;
        case datatype:
        break;
        case datatype2:
        break;


     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        switch (options){

            default:
                System.out.println("Your input is not on the range of 1-3");
                break;
            case 1:
                System.out.println("You are talking to HR");
                break;
            case 2:
                System.out.println("You are talking to IT DEPARTMENT");

            case 3:
                System.out.println("Your are talking to HEALTH DEPARTMENT");
                break;
        }




    }
}
