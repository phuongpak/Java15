package oop.abstraction.abstraction1;

public abstract class Student {

    String name;
    int id;


    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public abstract  void study();

    public void sleep(){
        System.out.println("Student sleeping");
    }

    public abstract void test1();

    public abstract int test2();


}
