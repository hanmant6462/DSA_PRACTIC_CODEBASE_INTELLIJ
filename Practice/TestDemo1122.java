package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo1122 {

    public static void main(String[] args) {
        int max=0;
        int secondmax=0;
        int arr[] = {12, 35, 1, 10, 34, 1}; //o/p 34
        for(int i =0; i<arr.length;i++){
             max = Math.max(max, arr[i]);

            }
        System.out.println(max);
        for(int i =0; i<arr.length;i++){
            if(arr[i] != max){
                secondmax =  Math.max(secondmax, arr[i]);
            }
        }

        System.out.println(secondmax);
    }
}
