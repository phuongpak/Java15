package arrayList;

import java.util.ArrayList;
import Object.Bottle;

public class Practice5 {
    public static void main(String[] args) {
        /*
        create an arraylist store some bottle objects
        manipulate elements from the arraylist
         */

        ArrayList<Bottle> list = new ArrayList<>();

        Bottle b1 = new Bottle(6);
        Bottle b2 = new Bottle(16);
        Bottle b3 = new Bottle(26);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        System.out.println(list);
        System.out.println((list.get(0)));
        System.out.println(list.get(0).size);//we need to type public in the Bottle Object

        System.out.println((list.get(1).liquidAmount));//

        //compare and find the differences between b1 and b2 size

        //open the list and find size
        //list.get(0).size: b1
        //list.get(1).size: b2
        System.out.println(list.get(1).size - list.get(0).size);



        //check the list and see
        //if any bottles size is more than 10, print that bottle is a larger bottle
        //the box is list, inside box is bottle object
      for(Bottle item:list){
          if(item.size > 10){
              System.out.println("This bottle is a large bottle " + item.size);
          }
      }


      /*
      Create a computer class under Arraylist package
      -have instance field of: brand, price, color, screenSize
      -create one constructor to initialize all instance variables
      -create a test class: store 4 computer object in an arraylist
      -show properties of each computer from the list
       */






    }
}
