package aModifier;

public class Child extends Animal{
    //create type on ly Child then typing more extends Animal
    //make child class attach animal class
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.ageProtected =8;
        animal.namePublic ="Jerry2";
        animal.colorDefault = "red";
        //cannot reach out private


        Child child = new Child();

        child.ageProtected = 3;
        child.colorDefault = "RED/WHITE";
        child.namePublic = "JR JERRY";

        //GO TO javaFirst create Child2



    }



}
