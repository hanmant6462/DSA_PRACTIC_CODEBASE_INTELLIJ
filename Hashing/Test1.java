package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=10;
        int n =arr.length;
        int result =findSubArraySum(arr,n,k);
        System.out.println(result);
    }

    private static int findSubArraySum(int[] arr, int n, int k) {

        int currSum=0;
        int result=0;
        Map<Integer,Integer> prefixSumMap=new HashMap<>();
        prefixSumMap.put(0,1);
        for(int i=0;i<n;i++){
            currSum+=arr[i];

            int removeSum = currSum - k;
            if(prefixSumMap.containsKey(removeSum)){
                result += prefixSumMap.get(removeSum);
            }
            prefixSumMap.put(currSum,prefixSumMap.getOrDefault(currSum,0) + 1);
        }

        return result;
    }
}
