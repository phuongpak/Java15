package RecapWithAlmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPractice {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- What is the difference between Array and ArrayList ?
    ---> what is ....?
    ----> what is the purpose of usage ?
    --> where do we use it?
    --> how do we use it?
    -->Array : is a storage for primitives and objects. (mean you can store everything, arrays is a advance level)
    -->The purpose of usage : we can store the data temporarily and use it for different purposes. (it is simple way of storing
    multiple data at the time)

    -->ArrayList:                                                   Array:
        1-Dynamic size                                              1- fixed size
        2-storage for ONLY OBJECT                                   2- Storage primitives and object
        3-It doesn't have multidimensional form(no:String[][])      3-It does have Multidimensional form
        4-It has some good methods(add, get, size)                  4-It does not have methods but function(length)
        5-ArrayList can be manipulable                              5-It is not manipulable because there is no method
        6-Syntax is different                                       6-Syntax is different
        7-Array.deeptoString()???                                    7- Arrays.toString(number2); //print out

        NOTE: FUNCTION AND METHODS DIFFERENT IS THE PARANTETHESE()
     */

    public static void main(String[] args) {
       // int[] number =  new int[];//compile time error, we need to provide size
        int[] number = new int[5];//and can assign value to array but only few items, it there is 1000 items, we cannot do like this
        number[0] = 1;
        number[1] =2;

        String[] names = {"Ahmet", "Mehmet"};// ARRAY CAN STORE OBJECT
        System.out.println(Arrays.toString(names));
        int[] number2 = {1,2};//ARRAY CAN STORE PRIMITIVE
       // System.out.println(number);//will print hashcode//location
        System.out.println(Arrays.toString(number2));// how to print array


        List mix = new ArrayList();
        mix.add(number2[0]);
      //  number2[0]. // there is no method for this, this is primitive
       // mix.get[0]. // only see methods -> prove that whatever we put in list, it stores object

        //if we want to change anything in array
        //number2[1].replace cannot

        String.valueOf(  number2[1]  ). replace('2', '5');

        /*  QUESTIONS:
            Write an implementation that initialiaze int array and find the:
      1-Sum of the even number
      2-SUm of the odd number
      3-Difference between them (the answer shouldn't minus)
      exp: {1,2,3,8,12,65,76,5,22,17} for each:
      //USE for each  loop
         */

        int [] array = {1,2,3,8,12,65,76,5,22,17};
        int sumOfEven = 0;
        int sumOfOdd = 0;

       for(int num : array){
           if(num%2 == 0){
               sumOfEven+=num;
           }else{
               sumOfOdd +=num;
           }
          // num%2 == 0 ? sumOfEven +=num : sumOfOdd+=num: >>>>>>>
       }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);
        System.out.println(sumOfOdd>=sumOfEven ? sumOfOdd-sumOfEven : sumOfEven-sumOfOdd);





    }





}
