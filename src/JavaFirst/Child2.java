package JavaFirst;

import aModifier.Animal;

public class Child2 extends Animal {
    //pay attention on import aModifier.Animal

    public static void main(String[] args) {

        Animal animal = new Animal();
        //different package so only public
        animal.namePublic = "Jerry";
        animal.eatPublic();

        Child2 child2 = new Child2();
        child2.ageProtected =2;
        child2.namePublic = "JR";

        child2.eatPublic();//it does not access to private weight directy
        //it shows because it is in the eatPublic



    }



}
