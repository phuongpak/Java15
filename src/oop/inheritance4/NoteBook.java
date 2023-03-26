package oop.inheritance4;

public class NoteBook extends Book{
    //this is child class

  //  int pageCount;


    public NoteBook(){
        super(500,"Legends", "History");
    }
//override read method
   // @Override cannot use overriding////static method cannot be overridden

    public static void read(){

        System.out.println("Notebook read");
    }


}
