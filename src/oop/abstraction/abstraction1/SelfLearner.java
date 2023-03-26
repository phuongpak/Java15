package oop.abstraction.abstraction1;

public abstract class SelfLearner extends Student {

//create constructor
    public SelfLearner(String name, int id) {
        super(name, id);
    }


    @Override
    public void study() {
        System.out.println("SelfLearner study");
    }

    public String visitLibrary(){
        System.out.println("SelfLearner goes to library");
        return ".....";
    }

    public abstract void watchVideo();

}
