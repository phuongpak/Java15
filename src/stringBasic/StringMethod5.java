package stringBasic;

public class StringMethod5 {
    public static void main(String[] args) {

        String str = "wednesday";

       String strUpdate =  str.replace('e','*');
        System.out.println(strUpdate);

       String update2 =  str.replace("d" ,"$$");
        System.out.println(update2);

        String update3 = str. replace("day", "-");
        System.out.println(update3);

        //
        String str2 = "    today is   so quiet    ";
        String result = str2.trim();
        System.out.println(result);

        //method chaining (able to call/use another method after method call on the same string)

        //str2.trim().replace('t','T').substring(str2.indexOf("to", str2.indexOf("et")));//
        int number = str2.trim().replace('t','T').substring(2,8).length();
        //at the end we use length will return it
        //to int number so we have to stop , no more string
        System.out.println(number);

        //String quote = "   From zero to HERO   ";
        /*
        replace zero with "one"
        make entire string as uppercase
        remove ALL spaces.( replace between words also)
        get a three letter substring from the end
        print out whatever you have left with
         */

        String quote = "   From zero to Hero   ";

       String result2 =  quote.replace("zero","one").toUpperCase().trim()
               .replace(" ","");
               //.substring(quote.length()-3);//this is not work cuz the task wrong
        String result3 = result2.substring(result2.length()-3);


        System.out.println(result3);//
        //second option

        System.out.println();





    }
}
