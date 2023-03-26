package stringBasic;

public class StringMethod4 {
    public static void main(String[] args) {

        String season = "winter";
         //              012345
        //substring();--->return String

       String part =  season.substring(1);
        System.out.println(part);//inter/ cut from the index 1

        String part2 = season.substring(1,4);//take from 1 to 4 , inclusive 1 and exclusive 4
        System.out.println(part2);//int

       // System.out.println(season.substring(9));//StringIndexOutOfBoundExeption

        String task = "Lets do it";
        //take and print out the word 'do' only from above string

        System.out.println(task.substring(5,7));//do without space

        //make above test solution dynamic// 5 is index of d, 7 is space, no represent this with dynamic code

       int firstSpaceIndex = task.indexOf(' ');//store
      int secondSpace =  task.indexOf(' ', firstSpaceIndex + 1);
      String secondWordFromSentence = task.substring(firstSpaceIndex + 1, secondSpace);
        System.out.println(secondWordFromSentence);

        System.out.println("--------------");
        System.out.println(task.substring(task.indexOf(' '), task.indexOf(' ', firstSpaceIndex + 1)));





    }
}
