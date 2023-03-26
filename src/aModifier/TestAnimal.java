package aModifier;

public class TestAnimal {
    public static void main(String[] args) {

        //try to reach out the field from animal class
        //under the same package, so we can reach out all
        //we can have child class in the same package or different
        Animal animal = new Animal();

        animal.colorDefault = "WHITE";
        animal.runProtected();
        animal.namePublic = "Jerry";
        animal.ageProtected = 4;




    }
}
