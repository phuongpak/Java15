package loops;

public class WhilePractice6 {
    public static void main(String[] args) {
        /*
        print out every letter from a given string by separating them with dash
        television --> t-e-l-e-v-i-s-i-o-n
         */


       String str = "television";

       // System.out.println(str.charAt(0) + " - ");
        //System.out.println(str.charAt(1) + " - ");
        //System.out.println(str.charAt(2) + " - ");
       // System.out.println(str.charAt(3) + " - ");

        int number = 0;

        while(number <= str.length()-1){
            //System.out.println(str.charAt(number) +" - ");
           // System.out.print(str.charAt(number)+" - ");//delete ln from println
            if(number == str.length()-1){
                System.out.println(number);
            }else{
                System.out.print(str.charAt(number)+" - ");
            }

            number++;


        }










    }
}
