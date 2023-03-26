package Project1;

public class Task4 {
    public static void main(String[] args) {

        int totalMinutes = 3456789;
        int totalHours = totalMinutes/60;
        int totalDays = totalHours/24;
        int totalYears = totalDays/365;
        System.out.println(totalYears);//6 years


        int rDays = totalDays%365;
        System.out.println(rDays);//210 days
        System.out.println("3456789 minutes will be " + totalYears + "year and "+ rDays + "days");













    }

}
