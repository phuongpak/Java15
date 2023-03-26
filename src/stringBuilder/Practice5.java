package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {

    // String[] array = {"code", "fish", "interview","mock", "is coming", "soon"}
    //every single String need to be reversed
    //return as List {"edoc", "hsif", "....."}

   public static List <String> reverseEveryWord(String[] array){
        List<String> list = new ArrayList<>();
        for (String str    : array   ){
            String reversed = "";
                for(int i = str.length() -1; i >=0 ; i--){
                   reversed += str.charAt(i);//take each letter in a word put in to reversed store
                }
             list.add(reversed)  ;
        }
       System.out.println(list);
        return list ;
    }

    public static void main(String[] args) {
        String[] array = {"code", "fish", "interview","mock", "is coming", "soon"};
        //call method
        reverseEveryWord(array);

    }


}


