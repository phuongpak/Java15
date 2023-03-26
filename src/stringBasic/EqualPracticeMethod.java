package stringBasic;

public class EqualPracticeMethod {
    public static void main(String[] args) {

        //equal()

        String name1 = "Dmitriy";//stored in the string pool
        String name2 = "Dmitriy";//stored in the string pool

        String name3 = new String ("Dmitriy");//store in the heap
        System.out.println(name1.equals(name2));//true

        // ==
        System.out.println(name1 == name2);//true
        System.out.println(name1.equals(name3));//true
        System.out.println(name1==name3);//false cuz ....

        String name4= new String("Dmitriy");
        System.out.println(name3.equals(name4));//true
        System.out.println(name3 ==name4);//false

        String name5 = name4;
        System.out.println(name4.equals(name5));//true
        System.out.println(name5 == name4);// looking at same objects, same value, so true

       // String name6 = name1;// name6 exactly name 1

       // System.out.println(name6 == name1);//true

        String name6 = new String(name1);
        System.out.println(name6 == name1);//false


    }
}
