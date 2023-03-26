package stringBasic;

import java.util.Scanner;

public class IfAndTernary {
    /*
    POSSIBLE INTERVIEW QUESTION:

    1-Most of the technical questions are required if condition

    If is a conditional statement

    if(condition){                      if(condtion){
    Implementation                      else if(condition){
    else{                                else{
    implementation


    AND(&)                          OR(||)

   TRUE & TRUE -> TRUE          TRUE || TRUE -> TRUE
   FALSE & FALSE -> FALSE           FALSE || FALSE ->FALSE
   TRUE & FALSE -> FALSE        TRUE || FALSE - > TRUE


     */

    public static void main(String[] args) {
        /*
        if the temperature between -10 and 0 --> super cold
        0-25 --> normal
        25-50 -> hot
         */
        Scanner scanner = new Scanner(System.in);
        int actualTemperature = scanner.nextInt();

        if(actualTemperature <= 0 & actualTemperature > -10){
            System.out.println("super cold temperature");
        }else if(actualTemperature >0 & actualTemperature<=25){
            System.out.println("normal temperature");
        }else if(actualTemperature>25 & actualTemperature<=50){
            System.out.println("hot temperature");
        }else{
            System.out.println("the input is not applied for the conditions, please check it again");
        }

        boolean result = actualTemperature >10 || actualTemperature <5;
        System.out.println(result);

        //TERNARY OPERATOR:
        //CONDITION ? VALUE1 : VALUE2
        //CONDITION TRUE -> VALUE1
        //CONDITION FALSE --> VALUE2

        String name = "Ahmet";
        String name2 = "ahmet";
        String result2 = name.equalsIgnoreCase(name2) ? "The values are matching" : " The values are not matching";
      //  System.out.println(result2);//"The values are matching"
        //use if method but use ternary is better
        if(name.equalsIgnoreCase(name2)){
            System.out.println("The value are matching");
        }else{
            System.out.println("the value are not matching");
        }
        System.out.println(result2);









    }





}
