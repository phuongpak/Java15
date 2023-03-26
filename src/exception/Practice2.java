package exception;

public class Practice2 {
    public static void main(String[] args) {


       try {

           System.out.println(" First   ");

           String str = "b15";

           int result = 15 / 0;//ArithmeticException

           System.out.println(" SECOND");


           int number = Integer.parseInt(str);//cannot convert cuz has b //NumberFormatException

           System.out.println("    THIRD");
    //if we have multiples catch, it will go from child level to parent level
           //THIS CASE, ArithmeticException is  level(parent) so it show its sout
       }catch(ArithmeticException e){
           System.out.println("CATCH");
       }catch(RuntimeException e1){
           System.out.println("CATCH2");
       }



       try {

           String str = "Last";
           String reversed = "";
           for (int i = str.length(); i >= 0; i--) { //StringIndexOutOfBoundsException

               reversed += str.charAt(i);
           }
           System.out.println(reversed);

       }catch(StringIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
           System.out.println(   e.getCause() );
       }finally{
           System.out.println("finally block");
       }

        System.out.println("*****");//want to reach out ** but have exception block above so we handling











    }
}
