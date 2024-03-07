package DSA;

import java.util.HashMap;

public class LargestSubArraywithZeroSum {

    public static void main(String[] args) {
        int arr[]={1,10,11,-5,-6};
        int res = maxLen(arr,5);
        System.out.println(res);
    }

    static int maxLen(int arr[], int n)
    {
        // Your code here

        HashMap<Integer,Integer> map=new HashMap();

        int sum = 0;
        int maxLength=0;

        int[] prefixSum=new int[n];

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            prefixSum[i]=sum;
        }
        map.put(0,-1);
        for(int i=0;i<n;i++) {
            if (map.containsKey(prefixSum[i])) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum[i]));

            } else {
                map.put(prefixSum[i], i);
            }
        }

        return maxLength;


    }
}



 class LargestSubarrayWithSumZero {
    public static int maxLen(int[] A, int n) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];

            // If the current sum is zero, update the max length to the current index + 1.
            if (sum == 0) {
                maxLen = i + 1;
            } else if (sumMap.containsKey(sum)) {
                // If the sum has been seen before, update max length if necessary.
                maxLen = Math.max(maxLen, i - sumMap.get(sum));
            } else {
                // Store the current sum along with its index in the map.
                sumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] A = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = A.length;
        int result = maxLen(A, n);
        System.out.println("The length of the largest subarray with sum 0 is: " + result);
    }
}
