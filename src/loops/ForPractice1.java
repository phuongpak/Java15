package loops;

public class ForPractice1 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 5;

        //want to print number from 0 to 5

        //  while(num1<num2){
        //     System.out.println(num1);
        //     num1++;
        // }

        for (; num1 < num2; num1++) {
            System.out.println(num1);//0,1 ,2//update condition is always the last step for LOOP

        }

        for (int number1 = 10, number2 = 20; number2 > number1; number2--) {

            System.out.println(number2);//20,19,18

        }

        for (int i = 0; i < 10; ) {


            System.out.println(i + 1 + " .I like the loop");
            i++;
            System.out.println(i);//10
        }
        System.out.println("==========");
        ////////////

        int i = 0;//first time 0

        for (; i < 10; ) {


            System.out.println(i + 1 + " .I like the loop");
            i++;
            System.out.println(i);//10
        }

        System.out.println(i);//after we change in n for, we put it back i so i now 10
        //if before sout(i), reassign i = 19, then sout(i) will be 9

        /////////////
        for (i = 100; i > 90; i--) {

            System.out.println("$$$");
        }
        System.out.println(i);//90 , i update until 90 is new i and stop, i = 100 is local  not related

        System.out.println("================");


        for (int a = 0; a < 5; a++) {
            System.out.println("break time");

        }

//infinite for loop
        //for (; ; ) {
           // System.out.println("after break");
       // }
        int a = 5;
        for(String str = "example"; a < 8; a++){
            System.out.println("!!!");
            System.out.println(str);
        }


    }
}

