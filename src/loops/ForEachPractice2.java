package loops;

import java.util.Arrays;

public class ForEachPractice2 {
        public static void main(String[] args) {

            String[] flowers = {"rose","daisy","sunflower"};

            for(String flower: flowers){

                //want to take it and make it uppercase//will make all of them at one (right side)
                // we can do whatever, put it back, store it...or print it out
                System.out.println(flower.toUpperCase());
            }

            //create after having the string bellow
            //chicago@gmail.com    miami@gmail.com
            //store them into new storage
            String[] cities ={"Chicago","Miami","New York", "Tokyo","Doha", "Denver"};
                        //create storage for email first and integer
            String[] cityEmails = new String[cities.length];
            int i = 0;
            for(String city:cities){
                //get rid of uppercase and space and concat @gmail.com and store each of them into storage
                cityEmails[i] = city.toLowerCase().replace(" ","").concat("@gmail.com");
                i++;//not update statement, just variable...

                }
            System.out.println(Arrays.toString(cityEmails));








        }
}
