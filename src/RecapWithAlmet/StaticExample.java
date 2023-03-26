package RecapWithAlmet;

public class StaticExample {


   public int money = 10000;//
   public  int weight = 210;


    public static void speak(){
        System.out.println("Ahmet is speaking");
    }

    public void run(){
        System.out.println("Ahmet is running");
    }

    public void withdrawMoney(){
        money -=200;
        System.out.println("Good Job, You" +
                "are getting younger");
    }


    static {
        //this is called static block. no matter what, it executes first
        System.out.println("Hey, I am" +
                "static block" +
                "please " +
                "let me go first");

    }

    {
        //this is called instance block. this will come after static block
        System.out.println("Hey, I am" +
                "static block");

    }




}
