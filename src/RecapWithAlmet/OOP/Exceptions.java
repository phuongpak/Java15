package RecapWithAlmet.OOP;

public class Exceptions {


   /*
   POSSIBLE INTERVIEW QUESTIONS;

   1- How do you handle exceptions?

   --> We can handle the exception with TRY AND CATCH, THROWS


   2- Can you use more than one catch block? How about try block?

   --> we can use MORE CATCH BLOCKS BUT ONLY ONE TRY BLOCK
   2- What do you know about finally, finalize, final ? (***THE MOST COMMON**)

   ***final*** : a KEYWORD to make "VARIABLE/METHOD/CLASS" UNCHANGEABLE (LAST VERSION)
   ***finalize** : is a METHOD to clean up the unused / useless data( it works with GARBAGE COLLECTOR)
        -->for proof: we override the finalize method
   ***finally** : is a BLOCK  that come after TRY AND CATCH block to do final execution no matter what
            Database.disconnect

   4- What is difference between THROW AND THROWS?

   Both THROW AND THROWS are the concept of exception handling in which
   THROWS : I used to explicitly (out of block) throw the exception from a method

   -> public void exception() throws NumberFormatException

  --> public void exception2(){

  new throw NumberFormatException(e);

  **While THROWS are used next to method signature (OUTSIDE OF BLOCK)
  **THROW is used inside of the block
    */

    public static void main(String[] args) throws InterruptedException {


        String numbers = "$199";

//        System.out.println(numbers);
//        int price = Integer.parseInt(numbers);
//        System.out.println(price);//give error cuz $ cannot convert to int

        try {//try block to execute code
            System.out.println(numbers);
            int price = Integer.parseInt(numbers);
            System.out.println(price);


        } catch (NumberFormatException ex) {//CATCH BLOCK: CATCH EXCEPTION
            System.out.println("Your price parsing is not working");
           throw new NumberFormatException();
        }finally{
            System.out.println("I am finally bLOCK");
        }


        Thread.sleep(3000);///sleep system in 3 second


    }





}
