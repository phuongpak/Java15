package Object;

import java.util.Arrays;

public class TestVeggie {
    public static void main(String[] args) {

       String[] items = {"green " , "red tomato" , "green tomato"};

        int count = MethodPractice3.nameOfVeggie(items);
        System.out.println(count);//2


        MethodPractice3 object =  new MethodPractice3();
        object.nameOfVeggie(items);//just type nameOfVeggie


       String[] product =  MethodPractice3.nameOfVeggie(items,7);

        System.out.println(Arrays.toString(product));




    }
}
