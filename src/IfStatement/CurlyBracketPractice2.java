package IfStatement;

public class CurlyBracketPractice2 {
    public static void main(String[] args) {

        int k = 3, m = k + 5,t = 1;//three variables
        if ( m >= k)
           t = k++ + k + m;//4 + 4 +8
        System.out.println(m);
        System.out.println(k);
        ++t;

        System.out.println(--t);//15
        //first check is condition true or false
        //if true, it will show both lines
        System.out.println(t);//15
        System.out.println("========");

        if (t < ++k)
            ++k;
        ++t;
        System.out.println(++t);//condition false so only ++t show










    }
}
