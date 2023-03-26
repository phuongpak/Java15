package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfoTask {



    /*
    FirstName: David
    LastName: Pena
    Age: 25
    Gender: M
    City: Chicago
    ///////////////////
    FirstName: Jeremiah
    LastName: Michaelson
    Age: 15
    Gender: M
    City: LakeForest
    /////////////////
    FirstName: Michael
    LastName: White
    Age: 35
    Gender: M
    City: Winnetka
    /////////////////
    FirstName: Sarah
    LastName: Star
    Age: 29
    Gender: F
    City: Chicago

        store information in individual map
        put those map in list
       task:
       store student's information in to maps(every single student is one map)
       store those information into list
       from list of students, find out city of the student
       if student lives out of Chicago, ....> tell that student, "You can join Online"

     */

    public static void main(String[] args) {
        //look like all information can be String
        //student 1
        HashMap<  String  ,  String  > student1 = new HashMap<>();

        student1.put("Firstname","David");
        student1.put("LastName", "Pena");
        student1.put("Age" ,"25");
        student1.put("Gender", "M");
        student1.put("City" , "Chicago");

        System.out.println(student1);

        //student2
        HashMap<  String  ,  String  > student2 = new HashMap<>();

        student2.put("Firstname","Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age" ,"15");
        student2.put("Gender" , "M");
        student2.put("City" , "LakeForest");

        System.out.println(student2);
        //student3
        // FirstName: Michael
        //    LastName: White
        //    Age: 35
        //    Gender: M
        //    City: Winnetka
        HashMap<  String  ,  String  > student3 = new HashMap<>();

        student3.put("Firstname","Michael");
        student3.put("LastName", "White");
        student3.put("Age" ,"35");
        student3.put("Gender" , "M");
        student3.put("City" , "Winnetka");

        System.out.println(student3);
        //student4
       // FirstName: Sarah
       // LastName: Star
       // Age: 29
       // Gender: F
       // City: Chicago
        HashMap<  String  ,  String  > student4 = new HashMap<>();

        student4.put("Firstname","Sarah");
        student4.put("LastName", "Star");
        student4.put("Age" ,"29");
        student4.put("Gender" , "F");
        student4.put("City" , "Chicago");

        System.out.println(student4);

        List<    HashMap<  String  ,  String  >  > listOfStudents = new ArrayList<>();

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        System.out.println("=========");

        System.out.println(listOfStudents);
        System.out.println("===========");

       ////question on the next day:
        //can we find students who are age of 30 or younger and they are from chicAGO:
        //[{Firstname=David, LastName=Pena, Gender=M, City=Chicago, Age=25}, {Firstname=Jeremiah, LastName=Michaelson, Gender=M, City=LakeForest, Age=15},

        //every single element in the list is index 0,1,2
        //when get inside index 0 for ex, reach out city, and age. this element is map. to reach out value use get()
        //the struggle: all information is String, age store in string but using 30 is number
        //condition chicago: findStudent.get("City").equalsIgnoreCase("Chicago")
        // use parseInt and past value: convert the string to number by parsing

        for( HashMap<String, String> findStudent: listOfStudents){
            //Integer.parseInt(findStudent.get("Age"));//this is number now we can compare
            if(Integer.parseInt(  findStudent.get("Age")  )<= 30 && findStudent.get("City").equalsIgnoreCase("Chicago")){
                System.out.println(  findStudent.get("Firstname") + " is from Chicago and under age of 30" );
            }
        }


       /*
        for( HashMap<String, String> student : listOfStudents){
            if(!student.get ("City").equalsIgnoreCase("Chicago")){
                System.out.println( student.get("Firstname") + "You can join Online");
            }
        }

        //for loop with index number on the list

       for( int i = 0 ;  i < listOfStudents.size() ;  i++) {
           //listOfStudents.get(i); //get individual student map
           if (!listOfStudents.get(i).get("City").equalsIgnoreCase("Chicago")) {
               System.out.println(listOfStudents.get(i).get("Firstname") + "*****you can join online");


           }
       }

    List<  List<String> > result1 = fullNameFinder(listOfStudents);
       //fullNameFinder1(listOfStudents);//Check return type of this : command and click -> hashMap
       HashMap<String, List > result2 = fullNameFinder1(listOfStudents);

       //from the map above, find o city say hi
       // result2.get("City"); //return list of city, put in for loop
        for(Object individualCity : result2.get("cities")){
            System.out.println(individualCity);//
            if(individualCity.toString().equalsIgnoreCase("Winnetka")){
                System.out.println(" You are lucky since you are in " + individualCity);
            }
        }
*/

    }

    //create a method
    //pass a parameter as list of map
    //return all student firstname in one list and lastNames in other list
    //how can i return 2 different list: return all data in 1 box and get that box
//return 1 larger list contain a small list in there


    public static List<   List <String>   > fullNameFinder (List <HashMap <String, String> >  list) {

        //find out firstName and lastName and put it into the list
        List firstNames = new ArrayList<>();
        List lastNames = new ArrayList<>();
        List < List<String> > fullNames = new ArrayList<>();//for return list fullname
        for(HashMap <String, String > student : list){
            //for loop:(data type is map : list in parameter)
            firstNames.add(   student.get("Firstname")  );
            lastNames.add (   student.get ("LastName")  );//after this done, we need to add this into the main list
            //so we create fullName list

        }
        fullNames.add(firstNames);
        fullNames.add(lastNames);
        System.out.println(fullNames);
        return fullNames;

    }


    public static HashMap<String, List> fullNameFinder1 (List< HashMap<String, String> > list){
       //RETURN RESULT AS A MAP
        List firstNames = new ArrayList<>();
        List lastNames = new ArrayList<>();

        //new task: create another list for cities
        List cities = new ArrayList<>();

        HashMap <String , List> map1 = new HashMap<>();

        for(HashMap <String, String > student : list){

            //new task :find and add cities to the list you created
             cities.add(student.get("City"));
            firstNames.add(   student.get("Firstname")  );
            lastNames.add (   student.get ("LastName")  );

        }
        //new task: add your city list to the map
        map1.put("City" , cities);
        map1.put("Firstname" , firstNames);
        map1.put("LastName" , lastNames);
        System.out.println(map1);
        return map1;
    }
}