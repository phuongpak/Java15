package RecapWithAlmet.OOP;

public class AbstractAndInterface {
    //FEB 1
    /*
    POSSIBLE INTERVIEW QUESTION:

    1- What is abstract? and can you clarify it with little bit details?

    --> Abstract is a way to organize the methods with only NECCESSARY information(template)
    you do not have body for abstract methods(example: public abstract  void study();)
    .It means people can see the template of the method and "OVERRIDE"
    this based on their requirements.

    NOTE: We do not have a body for abstract methods because every class extend to the abstract class
    can MAKE THEIR OWN IMPLEMENTATION


    2-Why do you need to have abstract class in your project?

    -->For many methods, we need developers to make their own implementation to reduce the amount of duplication in the project
    which cause memory slowness, system slowness, more execution for system.

    3-Where do you use abstract class in your project?

    -->I would definitely say that I use general OOPS concept in everywhere of my project. In automation scrip I do not use too much,
    but i know that my team developers are using it.

    4-Can you create an object from abstract class?
    If no, How are you going to access all of the methods and variables from that class????

   --> No, you cannot create an object from Abstract class.
    TO BE ABLE TO ACCESS THESE METHODS AND VARIALBE YOU NEED TO OVERRIDE THEM.(*******ExTENDS FROM PARENT TO CHILD*******--> then override)


    5-Can you have normal and abstract method inside of abstract class?

    ->Yes, you can have both of the method types inside of Abstract class
    --> please re-watch videos
    -->please review the notes
    -->please watch youtube videos

    =========================INTERFACE:================
    class is blueprint of object

    1- What is interface?

    ->Interface is a "blueprint of the class"  which has special method that can be overridden to make new implementation IN SUBCLASS.
    -->We use ***IMPLEMENTS** KEYWORD to make connection with INTERFACE.

    2- Why do you need interface if you have abstract ?
    -->BECAUSE INTERFACE HAVE MORE FEATURES IN TERMS OF ACCESSING THE MULTIPLE PARENTS AT THE SAME TIME BY OVERRIDING.

    3- What is the difference between interface and abstract ? (******THE MOST COMMON*****)

    INTERFACE:
        - Interface is declared with "INTERFACE" keyword
        -can have only "PUBLIC ABSTRACT METHODS" ((SHOW OFF: default keyword ->exception)
        -To make a connection, we use "IMPLEMENTS" keyword
        ***-In Interface, you can implement the class as many as you want parents and once you can use extends
        but it should come before implement
        - When you initialize a **variable in interface as default is it "FINAL STATIC"**
        - ***Methods must be as default "PUBLIC ABSTRACT"**
        -CANNOT HAVE CONSTRUCTOR
    ABSTRACT:
        - is declared with "ABSTRACT" keyword
        -Abstract may or may not have regular methods.
        - to make connection, we use "EXTENDS" keyword
        **- in Abstract you can extend the class ONCE.(one extends keyword per class)
        -When you declare a variable in abstract, there is no default keyword
        -You can have any access modifiers for this. (no default keyword)
        -CAN HAVE INSTRUCTOR
     */







}
