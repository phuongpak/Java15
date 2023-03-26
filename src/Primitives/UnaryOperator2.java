package Primitives;

public class UnaryOperator2 {
    public static void main(String[] args) {

        double d = 8.7;
        d++;
        System.out.println(d);//9.7

        int a = 5;
        int b = ++a;
        int c = a + ++b;
        //b now is 7 cuz n at line 11 increase 1 then line 12 increase one more then 7
        System.out.println(b);

        System.out.println("c is >>" + c);//13

        c = c++ + --a - 2; // c = 13 + 5 - 2 = 16
        System.out.println(c);//16 cuz luc nay c++ only show 13 not 14

        int e = c + 10;

        System.out.println(e);//26
        //-------

        int k = 8, t = ++k, m = k + t, x = ++m;
        //k= 8, t = 9, k now = 9,  m = 9+ 9 = 18, x = 19
        System.out.println(--x - --k);// 18-8 = 10
        /*
        get one dozen of donuts for 15 dollar, you get one dollar discount on your next purchase
        show your next purchase payment amount

         */
        int payment = 15;
        System.out.println(payment--);// 15 pay today. show 15, but value is 14 show next time
        System.out.println(" next payment" + payment);

         /*
        get one dozen of donuts for 15 dollar, you get one dollar discount on your payment now
         */
        int payment1 = 15;
        System.out.println(--payment1 + " payment now with applying discount");// 14



    }
}
