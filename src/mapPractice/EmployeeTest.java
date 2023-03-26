package mapPractice;

import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Emma", "Chicago" , 30);
        Employee e2 = new Employee("Alex", "Des Plaines" , 24);
        Employee e3 = new Employee("Sam", "Chicago" , 35);
        Employee e4 = new Employee("David", "zion" , 40);

        HashMap<Integer, Employee> employeeMap = new HashMap<>();//make value is specific Object

        employeeMap.put(e1.id, e1   );
        employeeMap.put(e2.id , e2  ) ;
        employeeMap.put(e3.id , e3   );
        employeeMap. put(e4.id , e4  );

        //show this map and see
        System.out.println(employeeMap);//cannot see information
        //{80615=mapPractice.Employee@56cbfb61,
        // 56903=mapPractice.Employee@1134affc,
        // 68732=mapPractice.Employee@d041cf, 15134=mapPractice.Employee@129a8472}

       //run  method namFinder
        nameFinder(employeeMap);




    }

    public static void nameFinder(HashMap<Integer, Employee> map){
            //value is employee type so return is Employee employee:
        for(Employee employee: map.values() ){
            System.out.println( employee. name);//then go run method nameFinder in main method
        }
    }



}


//to get name , go to employeeMap first to check name
//employeeMap.value()