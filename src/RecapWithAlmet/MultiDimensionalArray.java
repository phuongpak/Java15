package RecapWithAlmet;

public class MultiDimensionalArray {

    /*
    THERE IS NO SPECIFIC QUESTION regarding that other than difference between array and arraylist

    --> IN AUTOMATION, I WILL GIVE YOU MORE DETAILS REGARDING HOW TO USE.
     */

    public static void main(String[] args) {

        String[][] names = {  {"Ahmet",} , {"Mehmet"} , {"Mahmut"} ,  { "Ahmet", "Mehmet" , "Mahmut"}   };

        System.out.println( names[0][0] );//
        System.out.println( names [1] [0] );
       // System.out.println(names [0] [3]);//show yellow, outofbond
        System.out.println(names [3] [2]);




    }




}
