package DSA;

import java.util.HashMap;
import java.util.Map;

public class MaxDistanceBetweenInteger {
    public static void main(String[] args) {

       int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 1};
        Map<Integer,Integer> map = new HashMap<>();
        int maxDiff=0;
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
               maxDiff = Math.max(maxDiff,i - map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println(maxDiff);



    }
}
