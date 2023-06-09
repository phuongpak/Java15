package loops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        /*
        print out hours and minutes as follows
        for the hours from 1 to 12
        minutes from 0 to 59

        hour-1: min-0:sec - 0
        hour-1:min -1 :sec -1
        hour-1:min-2
        ....
        hour-2:min-0
        hour-2:min-1
         */

        //extra work after nested loop break;
        // 1. make sure each hour is 30 minute
        //2.as soon as minute 30, stop hour, mean we only see the hour 1 when it reaches to 30' then stop


        OUTER:
        for (int hour = 1; hour <= 12; hour++) {


            INNER1:
            for (int min = 0; min < 60; min++) {
                // if(min == 31) break;//1. this is single statement and no need { cuz only this statement affect
                //       if(min == 30){
                //          break OUTER;//FOR 2.


                INNER2:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec > 20 && sec < 40) {
                        continue OUTER;//it will skip the sec from 21 to 39
                    }
                    if (hour <= 6) {

                        System.out.println("hour-" + hour + " : min -" + min + " : sec-" + sec + " AM");
                    } else {
                        System.out.println("hour-" + hour + " : min -" + min + " : sec-" + sec + " PM");
                    }
                }
            }

        }
    }
}

