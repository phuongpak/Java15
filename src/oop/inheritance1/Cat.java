package oop.inheritance1;

public class Cat extends DomesticAnimal{

String name;

    @Override
    public void play() {
        System.out.println(this.name + " is playing");
        //if there are multiples name, use this.
    }

    int jump(){
        System.out.println("Cat is jumping");
        return 5;
    }
    //commenting out private hunt method since it was having wider access modifier
    //in the parent class. here it is not compiling since we have made it private
    //private void hunt(){
      //  System.out.println("Cat is hunting");
   // }
    @Override
    //RETURN TYPE HAS TO BE LOWER LEVEL OF
    public Cat hunt(){
        return new Cat();
    }



}
