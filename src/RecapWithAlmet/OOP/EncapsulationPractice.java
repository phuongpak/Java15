package RecapWithAlmet.OOP;

public class EncapsulationPractice {

    private String name = "Ahmet";
  private  int age = 31;
    private long creditCard = 123456;
    //can I be able to access these data from other classes?
    //yes
    //but if we use private, you can hide protect data.
    //other classes do not see it//
    //there is a way to access this data: use getter and setter
    //set up value and return value


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0|| age <99) {//you are the boss can manipulate this)
            this.age = age;
        }else{
            System.out.println("Age is not in correct range");
        }
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}
