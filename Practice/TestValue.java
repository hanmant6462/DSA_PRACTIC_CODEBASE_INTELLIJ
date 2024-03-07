package Practice;

import java.util.Arrays;
import java.util.List;

//3 arguments (hrs, mins, sec)
//
//write a function which calculates total seconds starting from 12 am to the specified arguments passed
//ex (3, 45, 20) so from 12 am to this time specified i need total seconds
public class TestValue {
    public static void main(String[] args) {
       List<Integer> listArgs = Arrays.asList(3,45,20);
        int Seconds=getTotalSeconds(listArgs);
        System.out.println(Seconds);
    }

    private static int getTotalSeconds(List<Integer> listArgs) {

        int totalSeconds=0;
        int CalculateSeconds = listArgs.get(0)*60*60 + listArgs.get(1)*60 + listArgs.get(1);
        System.out.println(CalculateSeconds);
        return CalculateSeconds;
    }
}
