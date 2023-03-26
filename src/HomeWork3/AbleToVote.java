package HomeWork3;

import java.util.Scanner;

public class AbleToVote {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        String stateCode= s.next();
        String city = s.next();
        String gender = s.next();
        int age = s.nextInt();
        // Please don't change anything on lines above.
    /*
        If Age is more than 18 and Full Name is starting with ‘A’ and last name is ending with ‘V’
        and state code is starting with ‘I’
        and state code is ending with ‘L’ and City length is less than 10,
        and gender is equal to ‘F’, I am able to vote.
        If I am able to vote, print true. If not, print false.

    */
        //fullName = firstName and lastName

        boolean isAbleToVote =
                age > 18 && fullName.startsWith("A") && fullName.endsWith("V") && stateCode.startsWith("I") &&
                        stateCode.endsWith("L") && city.length() <10 && gender.equals("F") == true;
        if(isAbleToVote){
            System.out.println("true");
        }else{
            System.out.println("false");
        }





    }
}
