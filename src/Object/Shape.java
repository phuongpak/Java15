package Object;

public class Shape {

    //in this shape class, i want to
    //calculate perimeter of rectangle
    //width, length  2 * (w + l)

   // int w = 5, l = 10, p = 0;

  //  p = 2 * ( w + l );

    public void perimeterCalculator(int width, int length){

        int perimeter = 2 * (width + length);//we do not know the value of w and l yet
        //that is local variable
        System.out.println("The Perimeter of rectangle is : " + perimeter);// to run it, we create object

    }

//create a method that will calculate area of a triangle
    // A = 1/2 base * high
    public void areaCalculator(double base, int height){
        double area =  base * height / 2 ;
        System.out.println("The area of triangle is :" + area);
    }








}
