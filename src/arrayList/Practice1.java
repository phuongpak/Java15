package arrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();//accept any type

        ArrayList list2 = new ArrayList(5);

        ArrayList list3 = new ArrayList(list1);

        ArrayList <String> list4 =  new ArrayList<>();

        System.out.println(list4);

        //this is object, it needs method, cannot do list[0] = "tomatoes" like array

        list4.add("tomatoes");

        System.out.println(list4);

        list4.add("cucumbers");
        list4.add("potatoes");
        list4.add("cherries");
        list4.add("lettuce");

        System.out.println(list4);//it keeps order

      //  System.out.println(list4[4]);//will not work
        System.out.println(list4.get(4));//print out element on the 4th: lettuce
       String item = list4.get(3);//hold command and click on get, see this will return String so store in String
        System.out.println(item);

        list4.add(3,"banana");//add more element in the array at the position index 3
        System.out.println(list4);

        System.out.println(list4.get(3));//banana
        //list4.add(9,"apples")//cannot

        list4.add(6,"apples");
        System.out.println(list4);

        //add() an element, add() an element to a specific index, get()

        //size()

        int size = list4.size();
        System.out.println(size);//7

        //replace: set() method--> it will replace the element at given index

        list4.set(4,"Dressing");
        System.out.println(list4);//cherries gone, replaced by Dressing

        //
        list4.remove(4);
        System.out.println(list4);
        System.out.println(list4.size());//6

        list4.remove("banana");//it has to be spelled exactly the same in the arraylist
        System.out.println(list4);
        //clear()

        list4.clear();
        System.out.println(list4);
        System.out.println(list4.size());

        //
        ArrayList <String> list5 = new ArrayList<>();
        list4.addAll(list5);

    }







}
