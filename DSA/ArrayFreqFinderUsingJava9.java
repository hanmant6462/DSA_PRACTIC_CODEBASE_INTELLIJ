package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayFreqFinderUsingJava9 {
    public static void main(String[] args) {
        int nums[]=new int[]{2,1,3,5,6,3,6,8,9,2,7};
        //List list= Arrays.asList(2,1,3,5,6,3,6,8,9,2,7);

        Map<Integer,Long> map=Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(num->num ,Collectors.counting()));
        map.forEach((k,v)->System.out.println(k +" " + v));

         }


    }

