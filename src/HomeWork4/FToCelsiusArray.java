package HomeWork4;

import java.util.Arrays;

public class FToCelsiusArray {
    public static void main(String[] args) {

       /*
        You have an array of weather conditions with Fahrenheit numbers.
  Print the Celsius value of each array element.
// NOTE: Be careful after every number there has to be comma(,) and space then the next number.
// Please look carefully for example.

  Example:
  Example fahrenheit array -> {22,45,62,50,-40,32,80}
  Expected Output ->
  -5.555555555555555, 7.222222222222222, 16.666666666666668, 10.0, -40.0, 0.0, 26.666666666666668

        */
        //C =  (F - 32) * 5/9
        //{32,21,0,-3,-40,32,80}
        //if you want to print multiple time in same line
        //we should use print instead of println
        //when I know this is going to be last print, I should not add comma
        //when i = fahrenheit.length -1, then we know this is the last iteration/element

        double[] fahrenheits = new double[] {32,21,0,-3,-40,32,80};


       for(int i = 0; i < fahrenheits.length; i++) {
            double fahrenheit = fahrenheits[i];
            double celsius = (fahrenheit - 32 ) * 5/9;
            if(i == fahrenheits.length -1){
                System.out.println(celsius);
            }else{
            System.out.print(celsius + ", ");
            }
        }

        /*for(int i = 0; i < fahrenheits.length; i++) {
            double fahrenheit = fahrenheits[i];

            if (i == fahrenheits.length - 1) {
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(celsius);
            } else {
                double celsius = (fahrenheit - 32) * 5 / 9;

                System.out.print(celsius + ", ");
            }
        }

*/
















    }
}
