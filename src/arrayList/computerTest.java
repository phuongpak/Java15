package arrayList;

import java.util.ArrayList;
import Object.*;

public class computerTest {
    public static void main(String[] args) {
        /*
      Create a computer class under Arraylist package
      -have instance field of: brand, price, color, screenSize
      -create one constructor to initialize all instance variables
      -create a test class: store 4 computer object in an arraylist
      -show properties of each computer from the list
       */

        ArrayList<Computer> computers = new ArrayList<>();
        //create some computer object
        Computer c1 =new Computer("Dell",1600,"Black",15.5);
        Computer c2 =new Computer("Acer",899,"Grey",13.5);
        Computer c3 =new Computer("Apple",1500,"white",11.5);
        Computer c4 =new Computer("ASUS",300,"Silver",17.5);

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);

        System.out.println(computers);//only see the hashcode so we create a method toString inside
        //Computer class.after created, printing again

    // find computer they are less than $1000
        //and show their brand, cost and color to the user

        for(Computer item :computers){
            if(item.price < 1000){
                System.out.println(item.brand + " - " + item.price + " - " + item.color);
            }
        }
        System.out.println("++++++++++++++++");
        //can use for loop also
        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).price < 1000){
                System.out.println(computers.get(i).brand + " - " + computers.get(i).price + " - " + computers.get(i).color);
            }
        }

        System.out.println("================");


        //run findFancyComputer//call the method
        //findFancyComputer(computers);//put into sout

        System.out.println(findFancyComputer(computers));

        //run totalCost

        System.out.println(totalCostOfComputer(computers));
        BankAccount account = new BankAccount();
        account.withdraw(totalCostOfComputer(computers));






    //before this line is main method
    }

    /*
       create a method what will get an arraylist as parameter
       this method will find out computers that has price more than $1200
       and screenSize is more than 13.5
       This method will store and return those computers as a new arraylist

        */
    //the return type is arraylist
    public static ArrayList<Computer> findFancyComputer(ArrayList<Computer> devices){

        ArrayList<Computer> fancyComputer = new ArrayList();

        for (Computer device : devices){
            if(device.price > 1200 && device.screenSize > 13.5){
                //we have to create a new box to store this device.
                //so we create a new arraylist above for loop

                fancyComputer.add(device);
            }

        }
        return fancyComputer;
    }


        /*
        find out and tell me the total price of computers and so that I can buy all of them
        create a method to solve this task
         */
        //return Integer or Double cuz this is sum price
    public static Double totalCostOfComputer(ArrayList<Computer> list){
        double sum = 0;
        for(Computer item : list){
            sum+=item.price;

        }
        return sum;
        //then go to main method to run it
    }



}
