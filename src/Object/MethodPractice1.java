package Object;

public class MethodPractice1 {

    //create a method that will add two integer numbers and return the sum

    public int sumCalculator(int num1, int num2){

        //int sum = num1 + num2;
        System.out.println("Two int parameter method is running");
       //first way: return sum;
        return num1+ num2;//if use this way, no need to have line int sum = num1 + num2
    }

    public int sumCalculator(int num1, int num2, int num3){
        System.out.println("Three int integer method is running");// we do not need to print out
        int sum =  num1 + num2 + num3;
        return sum;

    }

    //task: overload( mean in this task: keep same name, change parameter) sumCalculator method
    // to find sum of numbers from a given array (we name array:  numbers)

    public int sumCalculator (int[] numbers){
        //{2,4,5,6,7}

        int sum = 0;
        for( int num :  numbers){
            sum += num;

        }
        return sum;

    }



    public static void main(String[] args) {
        MethodPractice1 object =  new MethodPractice1();

       int total1 = object.sumCalculator(3,5);
        System.out.println(">>>>>" + total1);//return sum


        int total2 = object.sumCalculator(3,34,50);//Three int integer method is running
        System.out.println(total2);//return sum

        ////have to have an array

        int [] arr = {2,4,5,8};

        int total3 = object.sumCalculator(arr);
        System.out.println(total3);//return sum

        System.out.println(object.sumCalculator(new int[] {3,4,5}   )    );//



    }




}
