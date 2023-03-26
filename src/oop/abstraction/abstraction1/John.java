package oop.abstraction.abstraction1;

public class John extends SelfLearner{

    public John(String name, int id){
        super(name, id);

    }

    @Override
    public void watchVideo(){
        System.out.println("John is on youtube");
    }

    //primitive do not have co-variant type
    public int test2(){
        System.out.println("John test2");
        return 3;
    }
    public void test1(){
        System.out.println("john test1");
    }
    //we do not need to implement study method (grandparent student has it) CUZ Selflearner already implemented it
}
