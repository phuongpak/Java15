package immutable;

import java.sql.SQLOutput;

public class CupTest {
    public static void main(String[] args) {

        Cup c1 = new Cup();//CANNOT CHANG THE VALUE INSTANCE VARIABLE CUZ IT IS PRIVATE IN CUP CLASS

        System.out.println(c1.getSize());//be able to reach and see value  cuz it is public but cannot change value

        Cup c2 = new Cup();




    }
}
