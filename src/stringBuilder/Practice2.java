package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder();
        builder.append("January");

        Character ch = builder.charAt(0);//return left side is primitive, we put in object right side

        System.out.println(ch);//j

        Integer i = builder.indexOf("y");
        System.out.println(i);//6

        String part =  builder.substring(3);
        System.out.println(part);//January, cut from 3: jan -0,1,2

        //put subString into a new StringBuilder object
        StringBuilder b2 = new StringBuilder(builder.substring(3));

        //StringBuilder b3= builder.substring(3); //XXX NOT WORKING, COMPILE TIME ERROR

        //replace( , , ) --> provide starting index, ending index and replacement value as text

        builder.replace(1,4,"$$$$");
        System.out.println(builder);//J$$$$ary


        builder = builder.replace(1,4,"**");
        System.out.println(builder);//J**$ary



    }
}
