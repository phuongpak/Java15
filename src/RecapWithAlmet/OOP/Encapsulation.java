package RecapWithAlmet.OOP;

public class Encapsulation {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- what IS Encapsulation ? why do you use it?
    -->Encapsulation is a way to protect/hide/restrict(limit) data from other users/classes
    -->we use "Private" keyword to make the data encapsulated
        -> it is a way to make your data not accessible and manipulate by anyone
        -> it is a way of restriction the data from the users/classes
        -> it is a way to limit the users to reach out the class data
        -> it is a way to hide the data from classes/users
        -> it is a way to protect your data from other classes/users

    2- How can you access the data from encapsulation ?
    ->to be able to access these all data which are private, we use "getter and setter"

    3-If encapsulation is hiding the data from users/other classes and with getter and setter, you can still access it.
    what is the point of using encapsulation?

    -->Actually, you can access the data from users/other classes and with getter and setter.
    But they cannot access your implementation inside of the method.
     it means you are still protecting your data based on your conditions.
     If you want me to give an example SIR/MADAM, I can say I have a book, and this book has 300 pages (0-300)
     I would like to access the specific pages of book.
     whenever I search for more than 300 or less than 0, this website should give me an error and say that the page is not found.
     it means I manipulate/break their codes. what people do that limit the users to access/hide/protect their data with a specific condition

     summary: I know you can still access the data with getter and setter
      but you cannot access inside of the code(implementation) which limits you

     */
    public static void main(String[] args) {
        EncapsulationPractice encapsulationPractice = new EncapsulationPractice();
      encapsulationPractice.setCreditCard(555555);//we set  and change the value 12345 to 5555
        System.out.println(encapsulationPractice.getCreditCard());//print out data

        encapsulationPractice.setAge(100);
        System.out.println(encapsulationPractice.getAge());
    }
}
