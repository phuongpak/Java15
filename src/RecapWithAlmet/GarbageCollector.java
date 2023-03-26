package RecapWithAlmet;

public class GarbageCollector {
    /*
    POSSIBLE INTERVIEW QUESTIONS:


    1- What is garbage collector and where is it coming from?

    Garbage collector --> It is a way to clean up useless/ unused data from memory .
    Otherwise, it will takes up some space in your memory and will cause low memory error. Primitive -> stack Object --> Heap

   just type:  System.gc() --> (to call method in main class.) It is coming from System class

    2- How can you prove that GC is working ?

    to be able to prove that GC is working, I override finalize method from Object class.(Object class is the parent of every class)

    3- How can you make the element garbage ?

    --> you can assign the value --> null
    --> you can assign the reference with another value

    int a = 5
    int b = 3
    b = a

    4- Do you have to call GC to clean up your codes?
    No, you do not have to call GC since it is working automatically


     */

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        System.gc();
    }
}
