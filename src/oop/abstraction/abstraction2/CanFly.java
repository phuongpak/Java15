package oop.abstraction.abstraction2;

public interface CanFly {

  final  int TAIL = 1;//final keyword is unnecessary
    public int WING = 2;


    public abstract void fly();//public is by default redundant, abstract is redundant also, we see ; mean this is abstract method

    void landing(double speed);//we put in parameter or not put in there is both ok

  //ALL METHOD AND VARIABLE ARE PUBLIC STATIC AND ABSTRACT
  //if we use : default , we should be able to create body of method
  // but the access modifier is still public

  public default void printInfo(){
    //default just a key word to create a non-abstract method, not access modifier
    System.out.println(this.TAIL + "  ..... " + this.WING);//IT IS STATIC SO WE JUST TYPE: TAIL
  }

   private void abcd(){
     System.out.println("++++++++=");
  }


}
