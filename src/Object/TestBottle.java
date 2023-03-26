package Object;

public class TestBottle {
    public static void main(String[] args) {

        Bottle b1 = new Bottle(8);//trigger method
       //run it and it show -------

        System.out.println(b1.liquidAmount); //default = 0


        b1.usage(4);//trigger usage method 0 -4
        System.out.println(b1.liquidAmount);//checking liquid amount -4


        //task: create a method that will take Bottle object as a parameter
        // and this method will find out if the bottle's size is greater than 8 oz or not
        //if it is greater than 8, should print "it is a Large bottle"
        //--> create outside main method

        sizeCheck(b1);//small size

        Bottle b2 =  new Bottle(16);//whenever create object, it triggers constructor
        //so it will print +++.,____ when we run sizeCheck()
        sizeCheck(b2);//large
        System.out.println(b2);//before toString method Object.Bottle@2f7c7260: hashcode-->location of the object
        System.out.println(b2);//ize :16.0 is clean true liquidAmount0.0 cuz we created toString method

    }

    public static void sizeCheck(Bottle bottle){
        //normally inside () will be like String name , as the question use object
        //so (Bottle(object)  bottle(name))
        if(bottle.size > 8){
            System.out.println("It is a Large bottle");
        }else{
            System.out.println("It is a small bottle");
            //go back inside main class to test. add "static" so we can check b1 in the main class
        }
    }


}
