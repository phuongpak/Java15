package Ternary;

public class Practice1 {
    public static void main(String[] args) {


        //booleanCondition ? value2 ; value2;

        int a = 16, b = 7;
        int result = a < b ? a + b : a * b;

        System.out.println(result);//

        String result1 = a != b ?  "Addition" : "Multiplication";
        System.out.println(result1);


        //String result3 = a >=b+9 ? 'c' : "check" ; // since data types of the options are different
                                                    // you cannot store it

        System.out.println(a >=b + 9? 'c' : "check");//vi '' and "" together so there is no datatype to match both
        // so we use straight system.out.println()//

        String str1 =  " I am so lucky";
        String str2 = " It is going great";
        String day = "Sunday";

        System.out.println(day.equals("Monday") ? str2 : str1);// false, I am so lucky
        System.out.println(" a ---> " + a);//16
        System.out.println("b-->" + b);//7

        System.out.println( a > b ? ++a + ++b : --a + --b);//25

        System.out.println(" a ---> " + a);//17 CUZ THE PREVIOUS CONDITION IS TRUE SO ONLY ON OPTION WORK ++a + ++b
        System.out.println("b-->" + b);//8

        //nested ternary
        // a > b ? ++a + ++b : --a + --b
        //day.equals("Monday") ? str2 : str1
        //what if we take str1 and replace it : a > b ? ++a + ++b : --a + --b //yes

        System.out.println(day.equals("Monday") ? str2 :a > b ? ++a + ++b : --a + --b );//27 cuz it was 18 and 7 is 25
                                                    // and ++ again so calculate again add more 19 and 8
        System.out.println(day.equals("Monday") ? a >=b + 9? 'c' : "check" :a > b ? ++a + ++b : --a + --b );//29

        System.out.println(day.indexOf(a > b ? ++a + ++b : --a + --b));//-1 CUZ THERE IS NO GIVEN NUMBER



    }
}
