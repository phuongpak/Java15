package Primitives;

public class ClassTest {
    public static void main(String[] args) {
     /*
     you need to have average of 60 percent to pass a class
       when you get 3 tests
         our range for test scores is 0 to 100
        and
         you need to have 90 percent attendance

       */


        int test1 = 50, test2 = 100, test3 = 80, averageOfThree, requiredAverageScore = 60;

        int requiredAttendance = 90, myAttendance = 100;


        averageOfThree = (test1 + test2 + test3)/3;

        boolean result = averageOfThree >= requiredAverageScore && myAttendance >=requiredAttendance;
        System.out.println(result);//true



    }
}
