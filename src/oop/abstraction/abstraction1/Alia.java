package oop.abstraction.abstraction1;

public class Alia extends OnlineStudent{

    public Alia(String name, int id){
        super("ONLINE", 1111);

    }
    //IF WE WANT TO OVERRIDE, IT IS OK


    @Override
    public void study() {
        System.out.println("ALIA STUDIES");
    }

    @Override
    public void test1() {

    }

    @Override
    public int test2() {
        return 8;
    }

    @Override
    public int watchViaZoom() {
        return 5;
    }

    @Override
    public void sleep() {
        System.out.println("Alia sleeps");;
    }
}
