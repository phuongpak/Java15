package arrayList;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {

        /*
        Create an arrayList to store 5 city names
        implement a logic to print only city names that have 6 or more letter
         */

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("miami");
        cities.add("Houston");
        cities.add("Austin");
        cities.add("virginia");
        System.out.println(cities);//

        for(String city:cities){
            if(city.length() >=6){
                System.out.println(city);
            }
        }
        System.out.println("+++++++++++++++++");

        for(int i = 0; i < cities.size();i++){
            if(cities.get(i).length() >=6){
                System.out.println(cities.get(i));
            }
        }



    }
}
