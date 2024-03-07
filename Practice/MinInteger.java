package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinInteger {
    int min = 0;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,2);
       //int number =  findMinInteger(list);
        int number1 =  findMinIntegerJava8(list);
        System.out.println("min integer "+number1);
    }

    private static Integer findMinIntegerJava8(List<Integer> list) {

        System.out.println(list.stream().min(Comparator.naturalOrder()).get());
         // (Integer) list.stream().sorted().min(Comparator.naturalOrder()).get();
//        return (Integer) list.stream()
//                .reduce(Integer.MAX_VALUE,Integer::min);
//        return list.stream()
//                .reduce(Integer.MAX_VALUE, Integer::min);
        return list.stream()                // Stream<Integer>
                .reduce(Integer::min)   // Optional<Integer>
                .get();



    }

     static int findMinInteger(List list) {
        int nums[] = {5,2,1,3,4};
        int min = nums[0];
        for (int i=1;i<nums.length;i++){
            if(min > nums[i]){
                min = nums[i];
            }

        }
         return min;

    }



}
