package RecapWithAlmet;

public class StringBuilder {
    /*
    POSSIBLE QUESTIONS:
    1-What is the difference between String and StringBuilder ?

    They are both useful for my project in terms of Mutability and Immutability
    -> String is immutable
    ->StringBuilder is mutable
        StringBuilder has some different method ->append, reverse

    2- What is the difference between String Builder and String Buffer ?

    -> String Buffer and Hashtable are both SYNCHRONIZED
    -> Map, list, Set, String, StringBuilder are not synchronized

   **** NOTE***: Mutable is all about the giving function/actions/manipulation (like  .) WITHOUT
    "RE-ASSIGNING" the value

    ***NOTE 2*** : Immutable ia all about the giving functions/actions/manipulations WITH "RE-ASSIGNING" THE VALUE

   *** NOTE 3***: PassByValue and PassByReference is all about the way that you pass the data
    --> If you call the method and pass the value directly/initializing
     (StringBuilderrecap.run("AHMET") -->MEANS you are passing the value-> PassByValue
    --> IF you call the method and pass the value with a reference
            String name = "AHMET";
            (StringBuilderrecap.run(name); -->PassByReference



     */
    public static void main(String[] args) {

        //ImMutability:
        String name = "AHMET";
        name.replace("M","*").concat("Java").trim();
        System.out.println(name);
        //Mutability
       //StringBuilder builder = new StringBuilder("Ahmet");
//        builder.replace(2,3,"*").append("loves").append("java").trimToSize();
//        System.out.println(builder);
//
//        System.out.println(builder.reverse());

    }
}
