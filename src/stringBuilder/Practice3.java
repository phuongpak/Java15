package stringBuilder;

import java.sql.SQLOutput;

public class Practice3 {
    public static void main(String[] args) {

        StringBuilder success = new StringBuilder("Tech");
        System.out.println(success.length());//4

        //System.out.println(success);//

        success.append("nology");
        System.out.println(success.substring(5));//cut from index 5: ology -->returning String not StringBuilder
        System.out.println(success);

        String str = success.substring(5);//ology , returning String and store String

        //StringBuilder bl1 = success.substring(5);xxxxxxx
        StringBuilder bl2 = new StringBuilder(success.substring(5));

        System.out.println(bl2);//ology

        System.out.println(  bl2.equals (str) );//false cuz bl2 is StringBuilder. str is String, cannot compare

        System.out.println(str.equals(bl2));//false


        str.concat("is not a word");
        System.out.println(str);//do not add

        System.out.println("=========");

        bl2.append("is not a word");
        System.out.println(bl2); //add together:

        success.insert(5,"TRUE");//return type is StringBuilder
        System.out.println(success);

        success.insert(4,true);
        System.out.println(success);

        //delete() -deleteChartAt()
        //TechtruenTRUEology

        success.delete(4,8);//delete from 4 include 4 until 8 exclude 8
        System.out.println(success);

        //delete TRUE from success

       // success.delete(5,9);
       // System.out.println(success);

        //what if you do not know index of 'T' and following 'E'

        success.delete(success.indexOf("T",1), success.indexOf("E") +1 );

        System.out.println(success);

        success.insert(5,"TRUE");
        System.out.println(success);//add in again

        success.delete(  success.lastIndexOf("T"),success.indexOf("E") +1  );
        System.out.println(success);

        success.deleteCharAt(1);
        System.out.println(success);//Tchnology ...delete 1 word index 1









    }
}
