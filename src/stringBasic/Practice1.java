package stringBasic;

public class Practice1 {
    public static void main (String [] args) {

        String word = "Fluffy";

        System.out.println(word);// Fluffy, the same uppercase or lowercase

        System.out.println(word + 5 + 3);// Fluffy 53

        //reassignment

        word = " Test ";
        System.out.println(word);//test

        // compound assignment

        word += word;// --> word = word + word
        System.out.println(word);//TestTest

        String text = "1234";
        System.out.println(text + 100);// 1234100

        System.out.println(text + word);// 1234TestTest, apply only one time
        System.out.println(text);//1234

        text += "5";// test = test + "5"
        System.out.println(text);//12345

        text += 6;//just attach 6
        System.out.println(text);//123456

        int number = 333;
        text += number;

        System.out.println(text);//123456333

        String name = "Java" + 111;
        System.out.println(name);// Java111

        String lastname = "Selenium" + "t";
        System.out.println(lastname);//Selenium

        name = "jenny";
        lastname = "Brown";

        name = name + lastname;// attach like this in string called CONCATENATION
        System.out.println(name);//JennyBrown
        System.out.println(lastname);//Brown

        String lunch = new String ("Burger");// dont need to type orginal, just type burger
        System.out.println(lunch);//Burger

        lunch += "with fries";
        System.out.println(lunch);










    }
}
