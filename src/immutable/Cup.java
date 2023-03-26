package immutable;

import java.sql.SQLOutput;

public class Cup {

    private int size;

    private String color;

    private void keepWarm(){
        System.out.println("********");
    }


    // create this public to see the value
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Cup c = new Cup();
        System.out.println(c.color);
        c.keepWarm();
    }



}
