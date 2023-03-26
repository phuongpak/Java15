package loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailTask {
    public static void main(String[] args) {

        /*
        I want to create a head/tail game (flipping coin) with java codes;
        -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL " So, let user know that the game started.
            - get user's guess as HEAD/TAIL
            - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
                - if guess is correct, print       ---> "You are lucky, it is your day today."
                - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
            - at the end, ask user "Do you want to play again? Y/N "
                - if the answer is Y --> keep playing (this is your while condition!!!)
                - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"
         */

        Random random = new Random();//to run the number random from java
        Scanner scanner = new Scanner(System.in);
        String yesNo;

        do {
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL");
            String answer = scanner.nextLine();//store answer, then create variable to store random number




            int number = random.nextInt(2);//if leave () it show any random number, if put (10), it will run number <10
            //we need 2 option either 0 or 1 for head or tail so we do 2

            // System.out.println(number);// just example to see if run it many times and it shows different number randomly not the same

            String guess = number == 0 ? "Head" : "Tail";//ternary statement

            if (answer.equalsIgnoreCase(guess)) {
                System.out.println("You are lucky, it is your day today.");
            } else {
                System.out.println("Sorry, that was not the correct choice!");
            }
            System.out.println("Do you want to play again? Y/N ");//user will answer y or no and we have to store it
            //so we have to create a string to store for while condition
            //String yesNo = Scanner.NextLine(): cannot do it in here cuz we use while out of boundary{}do, that is why
            // it will not work, so we have to create variable yesNo above do loop

            yesNo = scanner.nextLine();

        }while(yesNo.equalsIgnoreCase("yes"));
        System.out.println("Its Ok, SEE you NEXT time!");










       }
















    }

