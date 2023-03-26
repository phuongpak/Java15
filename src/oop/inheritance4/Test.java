package oop.inheritance4;

public class Test {
    public static void main(String[] args) {
        //WAYS TO REACH OUT PAGECOUNT
        //WAY1: OBJECT
        Book book = new Book(200,"Java","Coding");
        System.out.println(book.pageCount);//0
        //WAY2: CREATE METHODS IN BOOK CLASS


        System.out.println(   book.getPageCount()   );//0

        //WAY3; CONSTRUCTOR

        NoteBook notebook = new NoteBook();
        System.out.println(notebook.pageCount);//0
        System.out.println( notebook.getPageCount() );//500
/*
200
200
0
500

*/

        book.pageCount = 404;
        System.out.println(notebook.pageCount);//404
        System.out.println(book.pageCount);
       //after creating read method
        book.read();//type with ()
        notebook.read();
        Book.read();
        NoteBook.read();

        System.out.println("=======");
        Book.read();

        NoteBook.read();
    }
}
