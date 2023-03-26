package mentoring;

public class Practice {
    public static void main(String[] args) {
                /*
        Reverse the number without using String or data types…
        Only int.
        Int number = 45678;
        Wanted output 87654, in int data type.
        make it dynamic
        */

        int number = 45678;

        int reverse=0;
        while(number !=0){
           int digit = number%10; //to get last digit
           reverse = reverse *10 +digit;
           number/=10;
       }
        System.out.println(reverse);

        //find prime number
//prime number start from 2 and any number that only can divide for 1 and itself


        System.out.println(isPrime(11));

        }




    public static String isPrime (int num){
        boolean isItPrime = false;
        String result = "";

        for ( int i = 2; i < num; i++){
            if(num % i == 0){//there is no leftover/remainder
                isItPrime = true;
                break;
            }
        }
        result = isItPrime ? num + " it is not prime number" : num + " it is prime number";

         return result;
    }

    //0,1,1 + 1 = 2 , 1+ 2 = 3, 2 + 3 = 5 , 3 +5 = 8....





}
