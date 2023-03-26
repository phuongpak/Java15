package stringBasic;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "phone";

        System.out.println( str.charAt(4));// type str.charAT(4) first, and see what is the return,
       // System.out.println(str.charAt(5));///StringIndexOutOfBound

       // System.out.println((str.charAt(-3));// index starts from 0 so cannot ..> StringIndexOutOfBound

        //System.out.println( str.charAt(str.length()));// so str.length is 5, so still no

        System.out.println( str.charAt( str.length() - 2) );// n, result str.length 5 - 2 is 3, then passing 3 to char

        //indexOf()
        System.out.println( str.indexOf('p'));//0, pass p is a char
        System.out.println( str.indexOf("p"));//0,  pass p is a string
        System.out.println( str.indexOf("ph"));//0. --> if given chars will match within the string
                                               // in the same order sequence, it will return firs matching
                                               // char's index number

        System.out.println( str.indexOf("ne"));// 3, cuz first matching is n
        System.out.println( str.indexOf("nE"));//-1


        str = "new York";
        // find index number of space

        System.out.println( str.indexOf(' '));//single space of ''//3

        str = "******happy evening to you*****";
        //find index of second 'y'
        System.out.println(str.indexOf('y'));//4// first y

        System.out.println( str.indexOf('y', 5));//count y after the first y which is 4 is 5

        //how to pass index 5 above by dynamically?

        int indexOfSecondY= str.indexOf('y', str.indexOf('y') + 1);//this option is better
        System.out.println(indexOfSecondY);

        //String word = "Java is getting easy:)"
        //find the second space's index number
        String word = "Java is getting easy:)";
        System.out.println(word.indexOf(' ', word.indexOf(' ')+ 1));

        System.out.println(word.indexOf("Java is getting easy:)"));// 0 cuz matching
        System.out.println( word.indexOf("easy:)"));// return to first matching e

        //ToLowerCase,uppercase

        String text = "Do whatever it takes";
        System.out.println(text.toLowerCase());//
        System.out.println(text.toUpperCase());//
        System.out.println(text);//
        //text.toUpperCase();//Just a function, not assign the result to variable yet
        String str2 = text.toUpperCase();

        System.out.println(str2);//
        text = text.concat(str2).toUpperCase();
        System.out.println(text);

        text +=text.concat(str2).toUpperCase();
        System.out.println(text);









    }
}
