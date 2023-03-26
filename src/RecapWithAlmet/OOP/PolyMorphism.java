package RecapWithAlmet.OOP;

public class PolyMorphism {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- What is polymorphism ? (poly -> many , morphism -> forms

   --> it is  a different form of Object

    2- What is dynamic and static polymorphism ?

    * Dynamic polymorphism : is all about OVERRIDING --> Dynamic (action)
    * Static polymorphism : is all about OVERLOADING .(STATIC (STABLE)  --> NO ACTION)

    3- what is difference between overriding and overloading (****THE MOST COMMON***)?

    OVERLOADING:
           1 - Overloading needs to be in the SAME CLASS
           2- Overloading methods can have final, static, private
           3* -- whenever you overload, it checks METHOD SIGNATURE (DIFFERENT METHOD SIGNATURE)
              METHOD SIGNATURE ==> NAME + PARAMETER
                                  -> public void run ( int speed)
                                  ->private void run ( int speed, String name)



   OVERRIDING:
          1- needs to be in DIFFERENT CLASS AND SUBCLASS (EXTENDS, IMPLEMENTS CLASS)
          2-You CANNOT override final, static, private methods
          3-Whenever you OVERRIDE, it checks not only "METHOD SIGNATURE also RETURN TYPE "
                it must have SAME METHOD SIGNATURE

     */

    public void dismiss(int time, int minute, String nameOfTeacher){
        System.out.println("Students are leaving at " +time + minute + "with teacher " +nameOfTeacher);
    }
    public void dismiss (int hour, String nameOfTeacher){
        System.out.println("Students are leaving at " + hour + "with teacher " + nameOfTeacher);
    }

    //public void dismiss (int date, String nameOfTeacher){//overloading cares about data type, the order of parameter, this in not overloading

    public void dismiss (String date, int nameOfTeacher){
        System.out.println("hello");
    }





}
