package homeWork5;

import java.util.Arrays;

public class task1 {

/*

        Create a public method named duplicates that takes
        two int arrays as parameters and returns common elements of both arrays as an int array.
        IF there is no common element of arrays, return null.
        NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
        For example:
         array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]

         return int array is [2,3,9] -> !!array is sorted

         example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]///-->/////REMOVE ALL DUPLICATE

         return int array is [1]

         example 3 : array 1 -> [0,1,1,1,0]  array 2 -> [2,9,90]

         return null   -> because there is no common element for arrays.

         NOTE: This question might be harder than it seems, and it can take time .
         Please make sure you covered all the  posibilities and your return type name etc. are all correct.
         If you cover all possibilities with your method, tests shall pass.
         GOOD LUCK !
         */

    // create a method here
    // Please make sure your access modifier is public,
    //return type of your method is int array and name of your method is duplicates

    //public int[] duplicate(int[] array1, int[] array2){
    //int[] common = new int[]

    //}

/*
    public int[] duplicates(int[] num1, int[] num2) {

        //we have to find all common elements and store them in a string
        String commons = "";
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; i < num2.length; j++) {

                if (num1[i] == num2[j]) {

                    commons += num2[j] + " ";//add space between the common elements
                }


            }
        }
        //if the String is empty which mean 2 arrays does not have common elements and return null
        if (commons.length() == 0) {//if both arrays has no common elements mean length of array is 0
            return null;
        }


        //task want return in int [] array
        //create the array to store these common elements above
        String[] commonArray = commons.trim().split(" ");//we take space using split to make array cuz
        //cuz we put space in line 50 :commons += num2 [j]+ " ";
        //so the split cut the space =' , 'will make a new array like this[,,,,,,]
        //trim() method cut the space


        //this commonArray has the numbers in String format ["21", "25"...]
        // after getting all common elements then we have to remove all duplicate in the common array
        //ex, commons ones ["1",2",3,2,2,1] remove duplicate-- result: [1,2,3]

        String commonWithoutDuplicate = " ";
        //every number in commonWithoutDuplicate will have a space between the front of it and after it
        for (int i = 0; i < commonArray.length; i++) {

            if (commonWithoutDuplicate.contains(" " + commonArray[i] + " ")) {//CommonWithoutDuplicate = "space3240space"//front and after

                commonWithoutDuplicate = commonArray[i] + " ";
            }
            //after this line, we have common elements in the commonWithoutDuplicate

            String[] commonWithoutDuplicateArray = commonWithoutDuplicate.trim().split(" ");

            int[] commonNumbers = new int[commonWithoutDuplicateArray.length];//create new array

            for (int k = 0; k < commonWithoutDuplicateArray.length; k++) {
                commonNumbers[k] = Integer.parseInt(commonWithoutDuplicateArray[k]);
            }


            Arrays.sort(commonNumbers);
            return commonNumbers;


        }


    }

 */


}
