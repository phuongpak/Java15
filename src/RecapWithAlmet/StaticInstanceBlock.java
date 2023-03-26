package RecapWithAlmet;

public class StaticInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is static as a keyword and why do you use it?

    -->Static (as a keyword) is a way to make methods accessible
    "WITHOUT CREATING AN OBJECT" from that class.
    ->The disadvantage of using static keyword, "YOU CANNOT OVERRIDE THE METHOD"
    SIDE NOTE: YOU CANNOT OVERRIDE "PRIVATE, STATIC, FINAL METHOD"

    2-What is static block?
    --> It is the block that can be called one (One Time it works)
    -->It always executed first

    3-what is static as a variable keyword?
    ->It makes the variable belong to the class
    -> it is sharable (common)==>common for all objects

    -> It can be accessed by other classes without creating an object.just with the name of class

    4-what is instance block?
    -->It is a block that can be called as may as you have objects


     */
    public static void main(String[] args) {
        StaticExample example = new StaticExample();
        example.run();
        example.speak();

        StaticExample.speak();//no need to create object
        //to be able to call static method, I can use just classname(system suggested)
        //StaticExample.age = 32;

        StaticExample ahmet = new StaticExample();
        System.out.println(ahmet);//10000

        ahmet.withdrawMoney();//withdraw 1 time -200
        System.out.println(ahmet.money);//9800 left
        System.out.println("===============");
        StaticExample mehmet = new StaticExample();
        mehmet.withdrawMoney();//1000-200 =9800 cuz public  int money = 10000;//private without static
                                //public static int money = 10000;//then mehmet.withdrawMoney();//9600
        mehmet.withdrawMoney();//9800-200= 9600 without static
        System.out.println(mehmet.money);//9600 without static keyword//9400 with static


        //3 objects -->instance sout --> 3
        //3 objects -->static sout -->1
        //just click run in main method





    }
}
