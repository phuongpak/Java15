package stringBuilder;

public class Practice4 {

    //create a method that will take StringBuilder object
    //and this method will delete '*' from given parameter

    //"t*he i*nt*ervi*ew *is *coming*"
    public static void main(String[] args) {
        StringBuilder  builder = new StringBuilder("t*he i*nt*ervi*ew *is *coming*");
        deleteStars(builder);

        //run replaceIs
        StringBuilder[] array = {new StringBuilder("code") ,new StringBuilder("fish"), new StringBuilder("interview") };
        replaceIs(array);
    }

    public static void deleteStars (StringBuilder builder){



        for(int i =0; i<builder.length(); i++){
          if(builder.charAt(i) =='*'){
              builder.deleteCharAt(i);
              i--;//have to have this condition cuz it the given sentence has a lot of stars :"t*****he i*nt*ervi*ew *is *coming*")
          }
        }
        System.out.println(builder);
    }

     // {"code", "fish", "interview","mock", "is coming", "soon"}
    //replace every char 'i' with '-' from given StringBuilder array of String

    public static void replaceIs(StringBuilder[] builder){
        for( StringBuilder str  : builder) {

            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i) == 'i'){
                    //replace(): starting index, ending index, and replace value as text
                    //builder.replace(0,4,"$$$)
                    //str.replace( str.indexOf(""+ str.charAt(i) ), str.indexOf(""+ str.charAt(i)) + 1,"-"   );//work
                    str.replace( i, i + 1,"-"   );//work
                }
            }

            System.out.println(str);
        }
    }









}




