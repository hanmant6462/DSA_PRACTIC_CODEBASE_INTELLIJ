package DSA;

import java.util.HashMap;
import java.util.Map;

public class CountPairWithGivenSum {
    public static void main(String[] args) {

        int arr[]={1,1,1,1};
        int k=2; // find pair
        int pairs=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0 ;i<arr.length;i++) {
            int a = k - arr[i];
            if (map.containsKey(a)) {
                pairs+= map.get(a);
            } if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(pairs);
    }
}
