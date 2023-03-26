package switchPractice;

public class Practice1 {
    public static void main(String[] args) {


        int count =5;

        switch(count){

            case 5 :

                System.out.println("RED");
                System.out.println("red");
                int number = 9;
                System.out.println(number + number);
                break;
            case 2 :
                System.out.println("Yellow");//if count is 2, it pick up result from case 2 down bottom, we need break;to seperate single case
                break;
            case 1 :
                System.out.println("White");
                break;
            case -9 :
                System.out.println("Black");
                break;
            case 10 :
                System.out.println("PINK");break;
            default :
                System.out.println("NO COLOR"); //we can put default somewhere in the middle but has to have break;




        }System.out.println("this is end of switch statement");//even put up over switch or down here, it will run and show










    }
}
