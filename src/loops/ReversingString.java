package loops;

public class ReversingString {
    public static void main(String[] args) {

        //check if a given string is palindrome or not, mean read it from left right or right left -> still the same one
        //EFE, WAY,wow, civic, level, anna...


        String str = "Tuesday";//
        String reversed = "";
        for(int i = str. length()-1 ; i >= 0 ; i--){

            reversed = reversed +  str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("It is palindrome");
        }else System.out.println("not palindrome");









    }
}
