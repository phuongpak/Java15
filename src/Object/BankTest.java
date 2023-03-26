package Object;

public class BankTest {
    public static void main(String[] args) {

        BankAccount account =  new BankAccount();

        account.displayInfo();
        account.deposit(100000);
        account.withdraw(500);

        account.userName = "java";
        account.password = "123";

        account.logIn("java","123");

        //2.
        account.signup
                ("nick","efe","321", 200);


        BankAccount java1 = new BankAccount();
        System.out.println(java1.isLoggedIn);
        java1.displayInfo();//
        java1.signup
                ("Dima","flower","white", 555);//sign up
        java1.logIn("flower", "white");

    }
}
