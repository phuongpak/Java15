package Primitives;

public class NumericPromotion {

    public static void main(String[] args) {

        byte b1 = 6;
        byte b2 = 3;
       // byte sum1 = b1 + b2; compile time error

      int sum1 = b1 + b2;
        System.out.println(sum1);

        double d1 = 2.3;
        int i1 = 3;

        double result = d1 * i1;// java automatically promotes to decimal numeric data type (double)
        // put the result in the bigger bucket which is double is larger than int
        System.out.println(result);

        short sh2 = 45;
        long l1 = 9;
        long result1= sh2 - l1;//if both less than int then use int, but this is long, larger than int
        long result3 = b1 + sh2;


        float fl1 = 9.0f; // take double d1 from top
       double result5 =  d1 + fl1;

       //long l1 = 9; float fl1 = 9.0f;
        float result6 = l1 + fl1;//which is data type is more capable to storage data type.






    }
}
