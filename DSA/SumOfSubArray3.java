package DSA;

import java.util.HashMap;
import java.util.Map;

public class SumOfSubArray3 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,8,5,9,2};

        Map<Integer,Integer> prefixSumMap=new HashMap<>();
        int sum=0;
        for (int i = 0;i<arr.length;i++){
            sum+=arr[i];
            prefixSumMap.put(i,sum);
        }
        prefixSumMap.forEach((k,v)-> System.out.println(k +" "+ v));

        int[][] queries={{1,2},{3,5},{0,6}};
        for (int[] q:queries) {
            int result = getSumOfLR(prefixSumMap, q[0], q[1]);
            System.out.println(result);
        }


    }

    private static Integer getSumOfLR(Map<Integer, Integer> prefixSumMap, int l, int r) {
        if(l == 0){
            return prefixSumMap.get(r);
        }
        return prefixSumMap.get(r) - prefixSumMap.get(l-1);
    }
}

