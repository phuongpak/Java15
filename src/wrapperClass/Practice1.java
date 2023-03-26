package wrapperClass;

public class Practice1 {
    public static void main(String[] args) {

        byte bt = 4;

        Byte b1 =  new Byte (bt);
        Byte b2 = 6;//AutoBoxing

        Integer i1 = 11;//AutoBoxing

        System.out.println(i1);//11

        System.out.println(i1+55);//
        System.out.println(b2 * i1);//


        Character letter1 = new Character('t');
        Character letter2 = 'r';

        String str = letter2.toString().concat("Testing");
        System.out.println(str);


        int a =11;//primitive //unboxing-->converting from wrapper to primitive data
        byte bt2 = b1;//unboxing
        byte bt3 = (byte)(b1 +i1);//b1 is object, i1 object,


    }
}
