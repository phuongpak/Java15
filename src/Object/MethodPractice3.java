package Object;

public class MethodPractice3 {

    //create a method that will take an array with some names of veggies
    //this method will generate a message for each veggie as
    //if the veggie name has word green into it >> " this is my most favorite"
    //if the veggie name does not have word green into it >> " This is my least favorite"
    //return count of either favorite or non-favorite veggie amount
    //make the method static
    //test your method in another class


    public static int nameOfVeggie(String[] veggies ){
        int count = 0;


        for(String name:veggies){
            name =  name.toLowerCase();//modified name first
            if(name.contains("green")){
                count++;
                System.out.println(count + " this is my most favorite");


            }else{

                System.out.println( " This is my least favorite");

            }
        }

        return count; //can either count1 or count2



    }
        //overload above nameOfVeggie method to create email-address for each veggie
     //return those created e-mail address as an array

        public static String[] nameOfVeggie(String[] veggies, int number){

        String[] emails =  new String[veggies.length];//c
        int index = 0;
        for(String name : veggies){
            String email = name + "@gmail.com";
            emails[index] = email;
            index++;
        }
        return emails;

}




}
