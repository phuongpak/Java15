package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice1 {
    public static void main(String[] args) {

        int[][] numbers = new int[4][3];
        //we store something into this

        numbers[0][0] = 73;
        numbers[0][1] = 81;

        //System.out.println(Arrays.toString(numbers));//[[I@2c8d66b2, [I@5a39699c, [I@3cb5cdba, [I@56cbfb61]
        System.out.println(Arrays.deepToString(numbers));//[[73, 81, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

        //store 95 to the last index (2) of third element ( 2) in the first array

        numbers[2][2] = 95;
        System.out.println(Arrays.deepToString(numbers));
        //store 100 in the last index  [[73, 81, 0], [0, 0, 0], [0, 0, 0], [0, 0, ????]]

        numbers[3][2] = 100;
        System.out.println(Arrays.deepToString(numbers));


        //>>>>make the line 23 dynamic index/base on [last index][go and give last element numbers[3]
        numbers[numbers.length - 1 ][numbers[numbers.length -1].length - 1] = 111;
        System.out.println(Arrays.deepToString(numbers));

        //add 1000 to each number and print it out

       //do regular array first
        for(   int i = 0 ; i < numbers.length; i++  ){
            //open the box so need another loop k has to less than inner array then
            for(int k = 0 ; k < numbers[i].length; k++ ){
                    //numbers[0][0]: first box first element, fist box, second element
                System.out.println(numbers[i][k] + 1000);//
            }


        }
        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 111]]
        //pick arr from numbers then pick number from arr
        for(   int[] arr   :  numbers  ){

            for(int number : arr){
                System.out.println(number * 100);
            }

        }


    }
}
