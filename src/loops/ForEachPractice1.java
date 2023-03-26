package loops;

public class ForEachPractice1 {
    public static void main(String[] args) {

        int[] numbers = {3,5,6,7,8,9,10};

        //by using for each loop print elements

        for(int num : numbers ){
            System.out.println(num);

            System.out.println(num + 10);//add 10

        }


        String[] items = {"cup", "bottle","microphone"};
        for (String str: items){
            if(str.equalsIgnoreCase("CUP")){
                System.out.println(str);
            }
        }


    }
}
