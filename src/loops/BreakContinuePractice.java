package loops;

public class BreakContinuePractice {
    public static void main(String[] args) {

        /*for(int i = 0; i < 16; i++){

            System.out.println(i);//it will run this line then next line stop cuz break, entire loop done when we see break
            System.out.println("");
            if( i ==3){
                System.out.println("skip");

           // if(i>9){
              //  System.out.println("hi");//i = o not greater than 9 so this line will not run and the break does not affect

           // break;//it breaks when it reach to 9 condition and will stop. why??
            }

           // System.out.println()// not reachable statement, because it is coming after break statement
        }

        System.out.println("*********");//can print cuz out of block

         */

            for(int i =0; i <16; i ++){
                if(i >9 && i <12){
                    System.out.println("HELLO");
                    continue;//when condition is true, we see this condition we skip whatever the condition ()


                }if(i>9){
                    break;// we can do thi break in this
                }
                System.out.println(i+"bye");
            }




    }
}
