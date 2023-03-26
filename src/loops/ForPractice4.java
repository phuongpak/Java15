package loops;

import java.sql.SQLOutput;

public class ForPractice4 {
    public static void main(String[] args) {


        //print out alphabet as uppercase letters
        //A,B,C,D...Z

        for(char letter = 'A';  letter <='Z'  ; letter++      ) {

           // System.out.print(letter + "-");//

            if(letter =='Z'){
                System.out.println(letter);
            }else{
                System.out.print(letter + "-");
            }

        }
        System.out.println("***********");

        //print out digits by separating them with $(0 to 9)

        for(char digit = '0'; digit <= '9'; digit++){
            if(digit == '9'){
                System.out.println(digit);

            }else{
                System.out.print(digit + "$$$");
            }

        }







    }
}
