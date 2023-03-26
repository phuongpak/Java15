package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {

        //create an arraylist and store 6 car brands
        //print out brand of every car from the list one at a time
        //[a,b,c,d,e,f]

        //a@yahoo.com
        //b@yahoo.com

        ArrayList<String> cars = new ArrayList<>();

        cars.add("a");
        cars.add("b");
        cars.add("c");
        cars.add("d");
        cars.add("e");
        cars.add("f");

        System.out.println(cars);

        for(int i =0; i< cars.size(); i++) {


            String item1 = cars.get(i);
            System.out.println(item1 + "@yahoo.com");

        }

        System.out.println("============");

    //or using for each loop
        for(String car : cars){
            System.out.println(car + "@yahoo.com");
        }

    //above this line is main method
    }
    // create a method that will take an arraylist as
    //parameter arraylist should hold string type elements
    //that method will show only elements which have letter 'a' int it

        /*public static void filter(ArrayList<String> list){
           for(int i = 0; i<list.size(); i++){
               if(list.get(i).contains('a')){

               }
            }

        }

         */






}
