package aModifier;

import java.sql.SQLOutput;

public class Animal {

    public String namePublic;
    protected int ageProtected;
    String colorDefault;//default
    private double weightPrivate;


    public void eatPublic() {
        System.out.println("EAT" + weightPrivate);//the same class, every thing can go in

    }
    protected void runProtected(){
        System.out.println("RUN");
    }

    private void sleepPrivate(){
        System.out.println("SLEEP" + weightPrivate);
    }

    void jumpDefault(){
        System.out.println("JUMP");
    }






}
