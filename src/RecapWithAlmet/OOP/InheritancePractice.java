package RecapWithAlmet.OOP;

import oop.polymorphism.Branch;

public class InheritancePractice {
    /*
    POSSIBLE INTERVIEW QUESTION:

    1- What do you know about inheritance and how do you inherit two classes ?
    --.Inheritance is a way to make connection(relationship) between classes.
    --we need to use "EXTENDS" keyword to do this connection.

    2- Why do you use inheritance in your project ?

    --we need inheritance because : we would like to have less amount of code
    (reduce the amount ofe/f execution),(save time), (save memory),(save money)
    --It will be more safe and efficient to maintain
    -it will look more professional


     */
    public static void main(String[] args) {
        Porsche po = new Porsche();//copy all code the same from Cars
        po.price = 3000;
        System.out.println(po.price);
        System.out.println(po.tiers);

        Bugatti bugatti = new Bugatti();//only 1 keyword extends
        bugatti.price= 5000;
        System.out.println(bugatti.price);
        System.out.println((bugatti.tiers));
    }
}
