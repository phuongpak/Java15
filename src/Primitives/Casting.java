package Primitives;

public class Casting {
    public static void main(String[] args) {

        //implicit ; small to large

        int num = 23;
        long numL = num;

        //explicit; larger to smaller

        int count = 25;
        short countSh = (short) count;
        System.out.println(count);
        System.out.println(countSh);

        int number = 128;
        System.out.println(" number --->" + number);
        byte numberBt = (byte) number;//we need to casted
        System.out.println("number is the byte type -->" + numberBt);


        double weight = 3.4;
        int weight2 = (int) weight;
        System.out.println(weight2);

        int example = (int) 25.6;// or (byte) cuz int can hold byte

        //
        byte b1 = 23, b2 = 12;
        byte sum1 = (byte) (b1 + b2); //casted , java want to see int but we casted byte
        short sum2 = (short) (b1 + b2);//
        short sum3 = (byte) (b1+b2);// short can hold byte

        ///compound assignments

        byte result1 = 12; //give value first
        result1 += example; // result is byte type, example is int type, want to add byte into int and
        // java want to see int but the result1 is byte data , without casting, we use +=
        // compound assignments cast itself

        example -=1.2;// int is example, int - double (1.2), java expect using double but we use back
        // into int cuz data type of example is int (line 28)














        




    }
}
