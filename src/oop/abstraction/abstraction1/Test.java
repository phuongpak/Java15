package oop.abstraction.abstraction1;

public class Test {
    public static void main(String[] args) {
        OnlineStudent onlineStudent = new OnlineStudent("Ben", 222);
        onlineStudent.watchViaZoom();
        onlineStudent.test1();

        //you cannot create an object from Abstract class
        //Student student = new Student():

        Alia alia = new Alia("ALIA", 11);

        CampusStudent campusStudent = new CampusStudent("efe", 88);
        campusStudent.playTableTennis();
        campusStudent.test1();
        campusStudent.sleep();




    }
}
