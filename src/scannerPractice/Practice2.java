package scannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        //create one scanner object first

        Scanner input = new Scanner (System.in);// do only 1 time,  type scanner and enter then show import on top
        System.out.println( " How is the weather this morning?");//run then nothing but only text
        //want to see the answer like warm, cold..

       // input.nextLine(); //run this line, then show the red square spot in the result part for us to type
       String answer =  input.nextLine();
        System.out.println(answer);//raining morning

        //ask user for the name of the day
        //store the name of the day
        //print a message as: "So, it is a --rainy-- --Sunday--"


        System.out.println("What is today ?");//ask, then activate the bottom
       String day =  input.nextLine();

        System.out.println("So, It is a " + answer + " " + day + "!");

        //Next() ----> will take String till first space
        System.out.println("Which city is this?");

        //input.next()// next or nextLine work the same but next only take one single work like new, not new york
        String city = input.next();
        System.out.println("So, it is a " + answer +" "+ day + "in"+ city);

        //ask user for the zipcode, store it, and double check with user by printing back

        System.out.println("What is the zipcode?");//number so use int
       int zipcode = input.nextInt();
        System.out.println("Is your zipcode ?" + zipcode);

        System.out.println(zipcode + 100);// for ex, to take int not string cuz if we do it, string will not work with number




    }
}
