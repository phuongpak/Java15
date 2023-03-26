package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice3 {
    public static void main(String[] args) {

        String [][][] items = {  {  { "car ", "doll"},{ "abc"}  },  { { },{ } } ,  { {"napkin" } }   };

        System.out.println(Arrays.deepToString(items));//[[[car , doll], [abc]], [[], []], [[napkin]]]

        for (String[][] level1 : items){
            System.out.println(Arrays.deepToString(level1));
            for(String[] level2: level1){
                System.out.println(Arrays.toString(level2));
                for(String level3 : level2){

                    System.out.println(level3);
                    if(level3.equalsIgnoreCase("napkin")){
                        System.out.println("got it!");


                    }

                }
            }
        }




    }
}
