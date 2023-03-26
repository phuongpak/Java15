package Object;

public class TestShape {
    public static void main(String[] args) {

       Shape rectangle = new Shape();

       rectangle.perimeterCalculator(5,8);

       rectangle.perimeterCalculator(12,20);

       rectangle.areaCalculator(4,8);//name the same

        ///////or can create new object
        Shape triangle =  new Shape();

        triangle.areaCalculator(4,7);


    }
}
