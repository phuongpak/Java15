package loops;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {


        for(   int i = 0, k = 20 , m = 15       ; i < k || k > m            ;  i++, k--, m++           ){

            //the condition, the left side takes longer time  from 0  to 20 then right side 15 to 20

            System.out.println(" i..>" + i);
            System.out.println("k--->" + k);
            System.out.println("++++++++++++=");

        }


        int a = 1, b = 10, c = 20, x = 0;
        for(   a = 25   ; a >= c      ;c++){
        System.out.println(++x + "!!!!" + b);

        }





    }
}
