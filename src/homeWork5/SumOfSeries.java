package homeWork5;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. 
Here the number n is coming from user.
Therefore, if the user gives number 3
you should find sum of 1 + 11 + 111.
Please, look at the example below, carefully.


Test Data :
Input the number of terms : 5
Expected Output:
12345  (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)
         */
        //how to come to 11 from 1 and to 111 from 11????? ---> multiple 10 and add 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of term");
        int term = scanner.nextInt();
        int sum = 0;
        int numberInSeries = 0;
        for(; term> 0; term--){//condition is from the number to 1 cuz >0( if term is 5: 5 ,4,3,2,1): 5>0 first, next 4 >0
           numberInSeries = numberInSeries*10 +1;//take numberInSeries = 0*10 +1 =1; numberInSeries = 1*10 +1 =11 ,....
           sum +=numberInSeries;//take 1 add into sum first, take 11 add into sum , now sum is 1+11, ....
        }

        System.out.println(sum);
    }


}
