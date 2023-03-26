package RecapWithAlmet.OOP;

public class mainTest extends AbstractPractice1{

    public static void main(String[] args) {

      //XXXXX ABSTRACT CLASS CANNOT CREATE OBJECT
        // AbstractPractice1 abstractPractice1 = new AbstractPractice1();//
       //abstractPractice1.name = "AHMET";

       //to access: extend keyword and override methods

        //WHoever extends abstract class, they can do their own implementation

//        AbstractPractice1.run();

        AbstractPractice1.name = "a";

        AbstractPractice1.getName();
    }

    @Override
    public void dismiss() {
        System.out.println("Ahmet's class will be dismissed at 1:05pm");
    }

    @Override
    public void speak() {
        System.out.println("AhMET IS SPEAKING");
    }
}
