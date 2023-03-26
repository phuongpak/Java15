package IfStatement;

public class NestedPractice1 {
    public static void main(String[] args) {
        /*
        check id
        check visa
        check ticket for travelling

         */

        boolean id = true, visa =  true, ticket =  true;

        if (id){
            System.out.println("checking visa now");
            if (visa) {
                System.out.println("checking ticket now");
                if (ticket) {

                    System.out.println("enjoy your flight");

                } else {
                    System.out.println("You should have ticket");
                }
            } else {
                    System.out.println("you should have visa");
                }

                }else{
                    System.out.println("first, you should hava valid visa");
                }

            }
        }










