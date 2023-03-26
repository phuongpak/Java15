package RecapWithAlmet;

import java.util.Scanner;

public class Loop {


    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1- MANY technical and automation questions are required the loops

    TYPES OF LOOPS:

    1-Do while --> no matter what it will run the code ONCE
    2-While --> It will check the condition and run based on that
    3-For --> it will initialize variable, condition and pre post increment (i++, i--)
    4- ForEach--> It will access all of the data in the storage(ITERATE one by one)
     */

    public static void main(String[] args) {
//        String userName ="";
//        do{
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter your username");
//            userName = scanner.nextLine();
//
//        }while(userName.startsWith("A"));

        //SOLVE THE QUESTION WITH WHILE() LOOP
        //1-Ask the user put an int number and reverse the int number by using while loop and String
        //2-multiply the digits

        //exp: 12345 --> first output 54321 --->second output 120
        //WHAT I WOULD DO IF I GOT THIS QUESTION
        //1-ALWAYS VERIFY THE QUESTION WITH INTERVIEWER(ASK THE INTERVIEWER AGAIN TO MAKE SURE WE UNDERSTAND THE QUESTION CORRECTLY)
        //2-LOUDLY YOU CAN THINK OF THE STEPS THAT YOU WILL FOLLOW; FIRST OF ALL I AM GONNA USE LOOP....
        //3-PUT THE STEPS ON YOUR MIND DIRECTLY: HOW TO START



      Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        //i will store it as string bC
        int number = scanner.nextInt();
        //12345 => %10->5 /10->1234 -->%10 -> 4 /10-> 123 ect...1-> 10 -->0
        //at the end , it will hit 0, we want it to stop

        String reverse = "";//bucket for reverse
        int total = 1;//bucket for multiply
        while(number!=0){
            int digit = number%10;//take 5
            reverse +=digit;//add 5 in reverse
            total *= digit;//multiply 5 with total
           number/=10;//take number now is 1234
        }

        System.out.println(reverse);
        System.out.println(total);


    }
}
