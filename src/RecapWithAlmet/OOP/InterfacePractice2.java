package RecapWithAlmet.OOP;

public interface InterfacePractice2 {


    default void run(){//to create regular method, we have to use "DEFAULT"
        System.out.println("hello, I am from interface");
    }


   // public abstract void dismiss();//do not need typing "public abstract'--gray color'--they are redundant

    void dismiss();
    //void speak();//speak yellow color mean we have speak method somewhere, we override it
    void speakWithAhmet();//




}
