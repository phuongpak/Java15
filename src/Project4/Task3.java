package Project4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    /*
    Ask the user to enter one number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 5
Output:
1
22
333
4444
55555
     */
        //
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        int number = scan.nextInt();

      for(int i =1; i <=number; i++){
          for(int k = 1; k <=i ; k++){

              System.out.print(i);

          }
  }












    }
}
