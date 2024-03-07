package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,0,0,1,3,1,1,1,2,5};
        int k = 3;
        int result = findLongestSubarray(arr,k);
        System.out.println(result);
    }

    private static int findLongestSubarray(int[] arr, int k) {

        Map<Integer,Integer> prefixSumMap= new HashMap<>();
        int sum=0;
        int maxLen=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem = sum - k;
            if(prefixSumMap.containsKey(rem)){
                int len= i - prefixSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!prefixSumMap.containsKey(sum)){
                prefixSumMap.put(sum,i);
            }
        }


        return k;
    }
}
