package arrays;

public class MultiDimensionalPractice4 {
    public static void main(String[] args) {


        String [][] menu =
                {   {"Steak", "pasta", "fries"}   ,{ "olivie", "cesar"}   , {"ice cream","cake","candy", "pie"}  };


        //how can we reach out "cake"

        System.out.println(menu[2][1]);

        String sweet1 = menu[2][1];
        System.out.println(sweet1);

        //reach out "fries"

        System.out.println(menu[0][2]);//individually reach out each element
        System.out.println("-========");

        /////
        for(int page = 0; page < menu.length; page++){
            for(int item = 0; item< menu[page].length; item++){


                System.out.println(menu[page][item]);//

                if(menu[page][item].equalsIgnoreCase("ice cream")){
                    System.out.println("Kids want to get ice cream");
                }


            }
        }
        System.out.println("*************");

        for(String[] page : menu){
            for(String item : page){

                System.out.println(item + "<----From for- each loop");

            }
        }




    }
}
