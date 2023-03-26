package arrays;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {

        String[] brands = {"Nike", "Adidas", "Puma", "New Balance", "Reebook"};

        //print every brand name in reverse version//reach out every word and reverse string
        //output: ekiN, sadidA,....


        String [] reversedArray = new String[brands.length];

        for(int i = 0; i < brands.length ; i++){
            String reversed = "";
            //System.out.println(brands[i]);// String str = "Nike";

           for(int r = brands[i].length()-1; r >=0 ; r--){
               reversed += brands[i].charAt(r);//take each char to store in string


            }
           reversedArray[i] = reversed;
            System.out.println("Reserved of : " +brands[i] + ">>>>>" + reversed);//fully reversed ready
        }
        System.out.println(Arrays.toString(reversedArray));






    }
}
