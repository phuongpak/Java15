package loops;

public class ForPractice2 {
    public static void main(String[] args) {

        //find the sum of numbers between 10 and 15 by using for loop 10,11,12,13,14,15


        int sum  = 0;

        for(int number1 = 10; number1 <=15 ;number1++ ){

            sum = sum + number1;


        }
        System.out.println("sum is " + sum);

        //String str = "Today is beautiful";//length  is 10
        //print out every letter from the given string separated by comma T,o,d

        ;
        String str = "Today is beautiful";//
        for(int i = 0   ; i < str.length() ; i++ ){


            //System.out.print(str.charAt(i) + ",");// we can do it this way , take out LN  BUT STILL HAVE , THE LAST LETTER
            if (i == str.length() - 1){
                System.out.println(str.charAt(i));
            }else{
                System.out.print(str.charAt(i) + ",");
            }

        }
        System.out.println("============");
        // Print above style without spaces --get rid of spaces (DO REPLACE) and print letters with dash
        //string str = "Today is beautiful";

        str = "Today is beautiful";
       str =  str.replace(" ","");


        for(int a = 0 ; a < str. length() ; a++ ){

           if(a == str.length()-1){
               System.out.println(str.charAt(a));//
           }else{
               System.out.print(str.charAt(a)+ "- ");
           }

        }
        System.out.println("======");



    }
}
