package loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {


        //want to print 3 stars *** for 10 times with while loop


        int number = 1, number1 = 10;
        while(number <= number1 ){

            System.out.println("***");
            number++;

        }

        //*** print 10 times with do-while loop

        number = 1; number1= 10;

        do{
            System.out.println("$$$");
            number++;


        }while(number <= number1);//condition true so print 10 time, if condition is false, it will print only 1 time


        int x = 5, y = 20;

        do{

            System.out.println("hello, it is DO-WHILE");//without update condition, it runs forever, so we need update next step 35
            y--;

        }while(y>x);
        System.out.println("y is " + y);
        ////======= now y is 5 we still print only one more time cuz condition false later, no more printing
        do{

            System.out.println("hello, it is DO-WHILE -2 ");
            y--;

        }while(y>x);







    }
}
