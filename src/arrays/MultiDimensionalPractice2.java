package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {

        String[][] citiesFromStates =
                {   {"Los Angeles" , "Sacramento"} , {"Chicago", "Springfield", "Des Plaines"} , {"Batimore", "Rockville"}  };

        //use for-each loop to show names of cities
        //first pick [] from [][] then pick from []
        //print city --> when you find chicago ---> "chicago is in IL"
LABEL:
        for(String [] cities  : citiesFromStates     ){

            for(String city :cities){
                //System.out.println(city);// HERE WE HAVE ALL CITY

                if(city.equalsIgnoreCase("ChicagO")){
                    System.out.println(city + " is in IL");//chicago comes two time, but now we want show one time so need else
                   // break LABEL;
                }else{
                    System.out.println(city);
                }

            }

        }


        String str = "niahie kjahie  akhe";
        String [] a = str.split(" ");
        citiesFromStates[0] = a;

        System.out.println(Arrays.deepToString(citiesFromStates));




    }
}
