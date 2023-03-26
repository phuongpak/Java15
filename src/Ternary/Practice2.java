package Ternary;

public class Practice2 {
    public static void main(String[] args) {


        String str = "Techtorial";
        String str1 = new String ("Techtorial");// new value

       String result1 = 'a'=='a'? str.concat(" Academy") : str.replace("Tech","Tech");
       //right side return string
        // so store result1 into string datatype

        System.out.println(result1);// return: TRUE, Techtorial Academy// space between because concat has space

        System.out.println( 'a'>'a'? str.concat(" Academy") : str.replace("Tech","Tech"));



    }

}
