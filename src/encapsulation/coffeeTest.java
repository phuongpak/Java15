package encapsulation;

public class coffeeTest {
    public static void main(String[] args) {


        Coffee coffee = new Coffee();

        coffee.setSize(8);
        System.out.println(coffee.getSize());//8
        System.out.println(coffee.getFlavor());//null




    }

}
