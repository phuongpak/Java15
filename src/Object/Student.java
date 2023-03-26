package Object;

import java.util.Random;

public class Student {

    int batchNumber;
    String firstName;
    String lastName;

    public void study(){
    int number = hourCreator();


        System.out.println(firstName + " studies for" + number +  "hours"  );
        //wanted to make 5 hours dynamic, like a machine to give hours

    }

    public void sleep(){
        System.out.println(firstName + " sleep for 5 hours"  );//

    }

    public int hourCreator(){

        Random random = new Random();
        int hour = random.nextInt(12);;
       // return 5;// one way to do
        return hour;
        //go back to study method to create hour
    }

}
