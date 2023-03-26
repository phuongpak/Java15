package Project1;

public class Task6 {
    public static void main(String[] args) {

        double balanceInDollar = 2.36;
        double quarters = balanceInDollar / 0.25;
        System.out.println(quarters);//9.44 quarters
        int quarters1 = (int) quarters;
        System.out.println(quarters1);// 9 quarters
        double rQuarters = quarters - quarters1;
        System.out.println(rQuarters);// 0.44 quarter
        double quarterToDime = 0.25/0.10; //1 quarter = 2.5 dimes
        System.out.println(quarterToDime);//2.5 dimes

        double dimes = rQuarters * quarterToDime;
        System.out.println(dimes);//1.01 dimes
        int dimes1 = (int)dimes;
        System.out.println(dimes1);//1 dimes
        double rDimes = dimes - dimes1;
        double dimeToNickle = 0.10/0.05;// 1 dime = 2 nickles
        double nickle = rDimes * dimeToNickle;
        System.out.println(nickle); //0
        int nickle1 = (int) nickle;
        System.out.println(nickle1);//0 nickles
        double rNickle = nickle - nickle1;
        System.out.println(rNickle);
        double nickleToPennies = 0.05/0.01;
        double pennies =(rNickle * nickleToPennies);
        System.out.println(pennies);//0.99

        System.out.println( " $2.36 will be " + quarters1 + " quarters, " + dimes1 + " dimes, " + nickle1 + " nickles and " + pennies + " pennies");


















    }
}
