package arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

      //  String studentNames[] = new String[9];//it is okay to use this way
        String[] studentNames = new String[9];

        studentNames [0] = "Alex";
        studentNames[1] = "Ana";
        studentNames[2] = "Dilyanna";
        studentNames[3] = "A O";
        studentNames[4] = "Stan";
        studentNames[5] = "Diana";

        System.out.println(Arrays.toString(studentNames));//

        //print out the name if the name has letter 'l' into it
        //first: need to reach out every single elements, first name, second name....
        //index number grow until the length of array
        //[Alex, Ana, Dilyanna, A O, Stan, Diana, null, null, null]//

        for (int a = 0  ;  a < studentNames.length; a++){

            //System.out.println(studentNames[a]);//print all name
            if (studentNames[a] == null){
                continue;
            }
            if (studentNames[a].contains("l")){
                System.out.println(studentNames[a]);//it will show error( NullPointerexeption, cannot compare name with nothing
            }



        }
        System.out.println("============");

        for (int a = 0  ;  a < studentNames.length; a++){


            if (studentNames[a] != null) {
                if (studentNames[a].contains("l")) {
                    System.out.println(studentNames[a]);//it will show error( NullPointerexeption, cannot compare name with nothing
                }
            }



        }





    }
}
