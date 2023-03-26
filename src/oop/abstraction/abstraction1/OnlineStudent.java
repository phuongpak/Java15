package oop.abstraction.abstraction1;

public class OnlineStudent extends Student{
    public OnlineStudent(String name, int id){
        super("Tim", 1234);

    }

    @Override
    public void study() {
        System.out.println("Online Student studies");
    }


    public void test1() {
        System.out.println("Online student test1");
    }


    public int test2() {
        System.out.println("online student test2");
        return 0;
    }

    public int watchViaZoom(){
        System.out.println("Attending via zoom");
        return 4;
    }
}
