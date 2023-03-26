package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //1. ask user that how many chocolate names he wants to store in an array
        //get the names of the chocolate from user
        //and store them into an array
        //print stored elements back to the user at the end
        //lindor, milka, twix, ferroro, snickers, m&m
        //2. if the name has 5 or less letters ,store it into 'ShortNames' array
        //otherwise store it into 'longNames' array

        System.out.println("How many chocolates names do you want to store?");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();//size of array
       sc.nextLine();


        String[] names =  new String[size];
        String[] shortN = new String[size];
        String[] longN = new String[size];
       // System.out.println("enter name of Chocolate");//how may time we need to ask,if user ask 10 time, so put into for loop

        for ( int i = 0; i <  size ; i++ ){
            System.out.println("enter name of chocolate " + (i +1) );
            String str = sc.nextLine();//on this line we have name of chocolate right side, store in str
            names[i] = str;

            if(str.length() > 5){
                longN[i] = str;
            }else{
                shortN[i] = str;
            }

        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(shortN));
        System.out.println(Arrays.toString(longN));








    }
}
