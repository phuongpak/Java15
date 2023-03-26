package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {
        //reverse() coming from StringBuilder

        StringBuilder builder = new StringBuilder("Welcome");

        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        //toString(): StringBuilder convert to String

        String str = builder.toString();//become String already
        System.out.println(str.toUpperCase());//cuz builder became string so we can call like String ex toUpperCase...






        //run method reversedEveryWord in this main method
        String[] words =  {"code", "fish", "mock", "interview",  "is", "coming", "soon"};
        reverseEveryWord(words);


        //so every new StringBuilder create, they are not the same,
        // either we use equal sign== or equal method, they will return false
        StringBuilder sName= new StringBuilder();
        StringBuilder sNam1 = new StringBuilder();
        StringBuilder sName2 = sName.append("Techtorial");//we are assigning the object back to it, so it ia the same
        System.out.println(sName == sNam1);//false: 2 seperate, different StringBuilder
        System.out.println(sName ==sName2); //true




    }
        //copy method from practice5
    static public List<String> reverseEveryWord(String[] array) {
        List<String> list = new ArrayList<>();
        for (String str : array) {

            StringBuilder builder = new StringBuilder(str);//create builder to put str in there
            list.add(builder.reverse().toString());//reverse builder than convert it to string and add in list
        }
        System.out.println(list);
        return list;
    }
}
