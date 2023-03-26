package Object;

public class BankAccount {
    /* New Class: BankAccount
     variables:
     -accountHolderName, bankName, balance, userName, password, isLoggedIn
     Methods:
     - void displayInfo() ->will print out all account information
     - double deposit() -> one parameter to update balance
     - double withdraw() -> one parameter to update balance
     -void logIn() -> userName, password parameters to update isLoggedIn boolean.

     */


    String accountHolderName;
    String bankName;
    double balance;//by default is 0
    String userName;
    String password;//default is false
    boolean isLoggedIn;


    //2. create a method  that will initialize instance fields
    //void sign up();

    public void signup(String accountHolderName1, String userName1, String password1, double balance1){
        accountHolderName = accountHolderName1;
        userName = userName1;
        password = password1;
        balance =balance1;
        System.out.println("SignUp process is done !");
    }

    public void displayInfo(){
        if(isLoggedIn == true) {

            System.out.println
                    (" Account holder name = " + accountHolderName
                            + "\nBank Name = " + bankName +
                            " \nBalance " + balance + "\nIsLogIn = " + isLoggedIn);
        }else{
            System.out.println("Should be logged in first to see info");
        }
    }

    public double deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("your balance after depositing " + depositAmount + " >> " + balance);
        return balance;
    }

    public double withdraw(double withdrawAmount){
        balance -= withdrawAmount;
        System.out.println("your balance after withdraw" + withdrawAmount + " >> " + balance);
        return balance;
    }

    public void logIn(String userName1, String password1){
        if(userName.equals(userName1) && password.equals(password1)){
            System.out.println("You logged in into your account successfully");
            isLoggedIn = true;
            System.out.println("INFORMATION AFTER LOG IN");
            displayInfo();

        }else{
            System.out.println("Please check userName of Password");
            isLoggedIn = false;
        }
    }


}
