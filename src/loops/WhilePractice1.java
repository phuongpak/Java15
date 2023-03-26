package loops;

public class WhilePractice1 {
    public static void main(String[] args) {

    //want to print "hello" for 10 times
     //   System.out.println("Hello");
       // System.out.println("Hello");
        //System.out.println("Hello");
        //System.out.println("Hello");
        //if we want to run whatever inside loops, the condition has to be true, we can do <=10 or count = -1

        int count = 0;

        while (count < 10){
            System.out.println(count);//it will show number 1 hello 2 hello 3 hello.....

            System.out.println("Hello");

            count++;//this is update condition, can be here or before sout to count from 1. after from 0 increase by 1,
            // so count now is 1, it go back to condition and check still true
            //and print count 1 hello, then increase count is 2, then go back again an check 1,2,3,4/.....reach to 10,
            // and go back to check 10 < 10 false now so it will only print 10 hello from 0.
            //if count = 100; only print o hello, if count = 9; does it mean end of loops, it will run forever cuz condition
            //do not change

        }

        int number = 20;
       int a = 1;

        while(number > 10){
            System.out.println(a + ". bye");
            a++;

            number--;
        }
        //after add int a = 1, and a ++, print:
        ///1.bye
        //2.bye
        //....

        //infinite loop
       // while ( 6==6){
        //    System.out.println("Java is my favorite");
      //  }

    }
}
