package arrays;

public class Practice5 {
    public static void main(String[] args) {

        int[] ages = {21,23,27,27,23,27,30,35,34,18,38,19};

        //find the biggest age//compare 21 and 23 if 23 larger than the rest, take 23 but need to create one box to store it

        //let very first element is the largest number
        //if my ages[i] > largest, change largest, not keep largest

        int largest = ages[0];
        for ( int i =  1; i < ages.length; i++){
            if(ages[i] > largest){
                largest =  ages[i];


            }
        }
        System.out.println(largest);





    }
}
