package loops;

public class NestedLoopPractice4 {
    public static void main(String[] args) {


        /*
        create multiplication table for number 1 and 5
        1*1 =1
        1*2 = 2
        ...
        1*10 = 10
        =======
        2*1= 2



         */

        for(int number = 1 ; number <=5 ; number++){

            for(int number1 = 1; number1 <=10; number1++){

                System.out.println(number + "*"+ number1 + "=" + (number * number1));

                if( number1 == 5){
                    break;
                }

            }
            System.out.println("===========");



        }





    }
}
