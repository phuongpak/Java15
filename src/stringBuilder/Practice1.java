package stringBuilder;

public class Practice1 {

    //create a program to print uppercase alphabet as a single String


    public static String alphabet(){

        String str ="";
        for(char c = 'A' ;c<='Z'  ;c++){
            str+= c;
            System.out.println(str);

        }
        return str;


    }


    //use StringBuilder to print lowercase alphabet
   public static void alphabet2(){

        StringBuilder builder = new StringBuilder();

        for(char a = 'a'; a <='z' ; a++){
           builder.append(a);

       }
       System.out.println(builder);
    }

    public static void main(String[] args) {

       // alphabet();//
        String str1 = alphabet();//
        System.out.println( str1.charAt(5) );//F

        //now use StringBuilder
        StringBuilder builder = new StringBuilder("**Sunny");
        System.out.println(builder);//

        StringBuilder builder1 = new StringBuilder();
        //builder1= "Winter";//xxx cannot do it
        builder1.append("Winter");
        System.out.println(builder1);

        builder1.append(" is not having snow for this year");
        System.out.println(builder1);//Winter is not having snow for this year

        builder1= builder1.append(" is not having snow for this year");
        System.out.println(builder1);//Winter is not having snow for this year is not having snow for this year

        builder1.append(builder1.append("**"));
        System.out.println(builder1);

        //run alphabet2
        alphabet2();




    }





}
