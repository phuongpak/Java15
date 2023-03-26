package oop.inheritance4;

public class Book {
    //this is parent class
    static int pageCount = 101 ;//if this is static field
    String title;
    String kind;


    public int getPageCount(){
        //return 600;//this is default , fix value
        return pageCount;
    }

    public Book(int pageCount,String title, String kind){
        this.pageCount = pageCount;
        this.title = title;
        this.kind =kind;
    }


    //static methods will be hidden from child class, child class cannot see cuz there is no inheritance
    public static void read(){

        System.out.println("Reading book");
}



}
