package switchPractice;

import java.util.Scanner;

public class nestedSwitchPractice {
    public static void main(String[] args) {


        /*
        1 - IT dept
        john
        marry
        2 - Accounting
        jake/BILL
        3 - HR
        anna
        diana
        mike

        4 - Help Desk
        efe
         */

        System.out.println("Please choose from the " +
                "following departments by pressing related number:  \n1- IT \n2- Accounting \n3- HR \n4- Help Desk");

        Scanner input = new Scanner(System.in);
        int department = input.nextInt();

        switch (department) {
            case 1:
                System.out.println("you reached out to IT department. who do you want to speak with? john/mary ?");
                input.nextLine();
                String name = input.nextLine();
                name = name.toLowerCase();
                switch (name) {

                    case "john":
                        System.out.println("you are speaking with " + name);
                        break;
                    case "marry":
                        System.out.println("you are speaking with " + name);
                        break;
                    default:
                            System.out.println("there is no such a person like" + name);

                }
                break;

            case 2:
                System.out.println("you reached out to Accounting department. who do you want to speak with ? bill/jake");
                input.nextLine();
                String name1 = input.nextLine();
                name1 = name1.toLowerCase();
                switch (name1) {
                    case "bill":
                        System.out.println("you are speaking with " + name1);
                        break;
                    case "jake":
                        System.out.println("you are speaking with " + name1);
                        break;

                }
                break;

            case 3:
                System.out.println("you reached out to HR department. who do you want to speak with? anna/diana/mike");
                input.nextLine();//need to have this line in this situation
                String name2 = input.nextLine();
                name2 = name2.toLowerCase();
                switch (name2) {
                    case "abc": if("techtorial".length()>5){
                        System.out.println("the name has more than 5 letter");//working fine with this method
                    }
     //               case "anna":
                      //  System.out.println("you are speaking with " + name2);
     //                   break;
                    //case "dianna":
                    //    System.out.println("you are speaking with" + name2);
                        //break;
                    //case "mike":
                       // System.out.println("you are speaking with" + name2);
                        //break;
                }
                break;
            case 4:
                System.out.println("you reached out to help desk department. who do you want to speak with? efe");
                input.nextLine();//need to have this line in this situation
                String name3 = input.nextLine();
                name3 = name3.toLowerCase();

                switch (name3) {
                    case "efe":
                        System.out.println("you are speaking with " + name3);
                        break;

                }
            default:
                System.out.println("There is no matching department for your entry");break;

        }
    }
}

