package RecapWithAlmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is different between List and Array?
    --> go to the ArraysPractice concept to get the answer


    2- What is the difference between ArrayList and LinkedList

    --> List : is a part of collection, and it is used for storage(Object)
            -2 type:
            -ArrayList : it is a way to store Objects and access these Objects with a specific methods. (Get)
            -LinkedList : it is a way to store Objects and access these Objects with a specific methods. (Get)

            -different: to be honest, i do not LinkedList in my project but as much as i know, there is an execution time
                different for accessing the data from the list (MEAN:THE WAY THE STORE THE DATA IS DIFFERENT)
               ** SHOWOFF -> The reaching out the elements inside of the List is more efficient and faster in ArrayList
               ArrayList<Object> --> arrayList.get(0) --> take 0.02 to reach element
               LinkedList<Object> --> LinkedList.get(0) --> take 0.04 which is slower than List
               ** > when you do any manipulation(changing value, replacing, inserting, removing) at this moment: LinkedList will be faster

               -->If you want to get more details, there is YouTube video.
               (what is the different between LinkedList and ArrayList(8minutes)

     */
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();

        LinkedList list3 = new LinkedList<>();
        List list4 = new LinkedList();

        list2.add("hello");//first element into list//long way and do not use it one by one..>loop
        System.out.println( list2.get(0) );

        List <String> names = Arrays.asList("AHMET" ,"MEHMET", "MAHMUT", "KAREM","AYSE");
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }


    }










}
