package Object;

import java.util.Scanner;

public class MethodPractice2 {

    public static void main(String[] args) {
        //create object to test the method test1 below

        MethodPractice2 john =  new MethodPractice2();

        double call1 = john.test1(3.2,1.8,"multiply");
        System.out.println(john.test1(3.2,1.8,"multiply"));//5.76
        System.out.println(call1);//5.76

        double call2 = john.test1(4,4.5,"add");
        System.out.println(call2);//8.5

        //age method
        int result = john.age(1987,2022);
        System.out.println(result);//35

        int result1 =  john.age(1987);
        System.out.println(result1);
        //test result the scanner
        short a = 2022;///////////////////////////pay attention the scanner////////////////
         john.age(a);


    }

    //create a method that will take( two double numbers and an operation name)
    //this method will return the result
    //operation  ---> addition or multiplication


    public double test1(double num1, double num2, String operationName){
        if(operationName.equalsIgnoreCase("multiply")){
            double result = num1 * num2;
            return result;

        }else{
            double result1 =  num1 + num2;
            return result1;

        }

    }
    //create a method that will find out your age
    //return and print the age

    public int age(int yearBorn, int currentYear){

        int age1 =  currentYear -  yearBorn;


        return age1;

    }

    public short age(int birthYear){
            short age = (short)(2022-birthYear);
        System.out.println(age);
        return age;
}
    public int age(){
        int age = 2022 - 1987;
        System.out.println(age);
        return age;
    }
public int age(short currentYear){
    Scanner scanner =  new Scanner(System.in);
    System.out.println("What is your birth year ? ");
    int birthYear = scanner.nextInt();
    int age = currentYear - birthYear;
    System.out.println(" your age is : " + age);
        return 5;
}


}
