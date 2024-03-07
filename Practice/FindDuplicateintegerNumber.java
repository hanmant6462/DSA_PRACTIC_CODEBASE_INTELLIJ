package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateintegerNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,3,4,4};
        int result =findDuplicatewithJava8(numbers);
        System.out.println(result);

    }

    private static int findDuplicatewithJava8(int[] numbers) {
        List<Integer> nums=new ArrayList();
        for(int i:numbers){
            nums.add(i);
        }

        Set set = nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());
        set.forEach(System.out::println);

        return 0;
    }

    public static int findDuplicate(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return nums[j];
                }

            }

        }
        return -1;

    }
}
