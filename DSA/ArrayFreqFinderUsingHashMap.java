package DSA;

import java.util.HashMap;
import java.util.Map;

public class ArrayFreqFinderUsingHashMap {
    public static void main(String[] args) {
        int nums[]={2,1,3,5,6,3,6,8,9,2,7};

        HashMap<Integer,Integer> map=new HashMap<>();
        //filling the map with value and frequency
         for (int i=0;i<nums.length;i++) {

             if (map.containsKey(nums[i])) {
                 map.put(nums[i], map.get(nums[i]) + 1);
             } else {
                 map.put(nums[i], 1);
             }
         }

             //printing map with frequency
             for (Map.Entry entry:map.entrySet()){
                 System.out.println(entry.getKey() +"-"+entry.getValue());
             }

         }


    }

