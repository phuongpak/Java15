package arrays;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {

        String str = "Sunday is daddy day";

        String[] parts = str.split("d");

        System.out.println(Arrays.toString(parts));//[Sun, ay is , a, , y , ay]

        String[] parts2 = str.split("d",3);//[Sun, ay is , addy day]
        System.out.println(Arrays.toString(parts2));


        //12-23-2022
        //12/23/2022
        //12.23.2022
        //23-12-2022
        String date1 = "12-23-2022";
        //check if the date is 23 of the 12 then print out "HAPPY BIRTHDAY"

        //12-23-2022 : DO THIS ONE
        String[] parts3 = date1.split("-");
        System.out.println(Arrays.toString(parts3));//[12, 23, 2022]
        //USE EQUALS TO COMPARE CUZ THIS IS STRING

       if(parts3[0].equals("12") && parts3[1].equals("23")){
           System.out.println("HAPPY BIRTHDAY!");
       }

        String date2 = "12.23.2022";
      // String[] parts4 = date2.split(".");
      //  System.out.println(Arrays.toString(parts4));//[] will not work so split has to be ("\\.")

        String[] parts4 = date2.split("\\.");
        System.out.println(Arrays.toString(parts4));//[12, 23, 2022]






    }
}
