package arrays;

public class MultiDimensionalPractice5 {
    public static void main(String[] args) {

        /*
                -Computers--
        Apple -> 2500
        Dell  --> 1800
        Acer  --> 1399
        Samsung -> 1550.99
        add: google --> 400
        --TV--
        LG     --> 1100
        Sony   --> 800
        Toshiba --> 599
        --Speakers--
        google   --> 99.99
        Bose     --> 120.99
        JBL     --> 89.95

         */

        String[][] brands =
                {  {"Apple" , "Dell","google", "Acer", "Samsung"}, {"LG", "Sony", "Toshiba"} , {"google","Bose","JBL"}};

        double [][] prices = { {2500,1800,400, 1399,1550.99}, {1100,800,599} ,{99.99, 120.99, 89.95}};

        //1. "JBL is 89.95"
        //2. ADD GOOGLE //show me google products which are less than $100


        for( int i = 0; i < brands.length; i++){
            for(int k = 0; k < brands[i].length; k++){
                //when reach out every items, print name and price
                //task1: System.out.println(brands[i][k] + " is $" + prices[i][k]);//

                if(brands[i][k].equalsIgnoreCase("google") && prices[i][k] < 100){
                    System.out.println(brands[i][k] +" is the item from Google with the price of $ " + prices[i][k] );
                }




            }

        }




    }
}
