package variables;

public class Practice2 {
    public static void main(String[] args){
         //*****java reads code from top to bottom and left to right***//
        //datatype name = value; --> this is full syntax to create a new variable
        //you cannot use java reserved words as variable name

        int apple = 10;//--> we are going to pick 10 apples
        int number;//--> Declaring variable

        // System.out.println( number );// cannot , compile time error since number does not have value yet
        number =  10; //--> Initializing variable  (assigning value to the variable) giving the value for variable (int number)

       // System.out.println( number );// yes we can cuz java read from top to bottom
        System.out.println( number );

        //System.out.println( number + 5 );// it will be 15  cuz that is  10 plus 5
        System.out.println( number + 5 );
       // System.out.println("number" + 5);// it will show number5
        System.out.println("number " + 5 );

        number = 20;// reassigning value for number
        System.out.println(number);
        System.out.println(number * 2);//40


    }
}
