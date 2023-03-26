package loops;

import java.util.Arrays;

public class ForEachPractice3 {
    public static void main(String[] args) {

        double[] changes = {2.34, 4.5, 1.25, 3.40, 1.20};

        //by using for each loop find the total of changes

        double total = 0;


        for(double change: changes){

            total+=change;
            System.out.println(total);//increase / add up total everytime it reach out every element

        }
        System.out.println(total);//total

        ///////

        int[] numbers = {1,2,3,5,6,7};//we miss 4
        //question: find the missing number from pattern//go from 1 to 2, different is 2, 2 to 3 is 1, but 3 to 5 is 2
        //find different pattern

       for( int i = 0; i< numbers.length - 1; i++  ){
           if (numbers[i+1] - numbers[i] > 1) {
              System.out.println(numbers[i] + 1);// this is a missing number

          }

        }


        //{1,2,3,5,6,7}
        //solve 2: do total given numbers with 4  = 28 and do total without 4 = 24
        int sum = 0;
        for(int i = 0; i <= numbers.length; i++){
           // sum += numbers[i];

        }
        int sum2 = 0;
        for( int i = 0; i <=7 ; i++){
            sum2 += i;//find total from i = 0 to 7
        }
        System.out.println("Sum -1 "+ sum );
        System.out.println("Sum -2 "+ sum2);
        System.out.println("Missing number is " + (sum2 - sum));






    }
}
