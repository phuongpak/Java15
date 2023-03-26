package Primitives;

public class ComparisonOperator2 {
    public static void main(String[] args) {


        //there is an event, person is 18 years old or older, sh/he can attend the event

        int ageOfPerson = 20; int requiredAge = 18;

        boolean canAttend=  ageOfPerson >= requiredAge;

        System.out.println(canAttend);//true//if put !canAttend it will show false (call logical negation)

       boolean canAttend1 =  requiredAge <= ageOfPerson;
        System.out.println(canAttend1);//true

        //kids, if the age of child is 12 or less, the child can go the event

        int ageOfChild = 11;
        int requiredAge1 = 12;
        boolean childCanAttend = ageOfChild <=requiredAge1;
        System.out.println(childCanAttend);//true, we can change ageOfChild to 15,16 then result is false

        //if the age of child is 10, they can not participate
        int childAge =10, requiredChildAge = 10;

        boolean childNotAttend =  childAge == requiredChildAge;
        System.out.println("This child cannot attend when the age is 10 >>" + childNotAttend);

        System.out.println(childAge != requiredChildAge);







    }
}
