package Object;

public class Bottle {
    /*
    * Create a Bottle class
	-double size
	-boolean isClean
	-double liquidAmount
-- create one argument constructor to initialize isClean variable
-- create one argument constructor to initialize size
-- create one "usage method" which takes double amount as parameter and it updates the liquidAmount
     */

//just add public later for practice 5
    public double size;
    public boolean isClean;
    public double liquidAmount;
//constructor
    public Bottle(boolean isClean){
        this.isClean =  isClean;
        System.out.println("++++++++");
    }
//constructor
    public Bottle(double size){
        this(true);
        this.size = size;
        System.out.println("-------------");
    }
//method
    public void usage(double amount){
       liquidAmount -= amount;

    }
//create testBottle class to test it

    public String toString(){
        return "size :" + size + " is clean " +isClean +"liquidAmount" +liquidAmount;//return whatever we want
    }







}
