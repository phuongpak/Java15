package oop.finalPractice;

public final class  T_Shirt extends Shirt {


    public void sale(){
        System.out.println("T-Shirt SALE");
    }
    //this method cannot be overridden cuz parent class is final method
   /// final method from parent cannot be overridden
    //public void dye(){

      //  System.out.println("******");
   // }

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.dye();
        shirt.dye("RED");

        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        //total 4 Shirt object

        shirt1 = null;
        shirt2 = null;
        //hey system, get this garbage collector for me
        System.gc();//to see if it works, we go to the Shirt class to Overide //protected void finalize() just to see
        //it is working or not
        //*********
        //*********

        System.out.println(shirt1);//nothing come bc we get it of shirt1 already


    }

}