package DSA;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateElement {

    public static void main(String[] args) {

        int[] nums = {1,2,1,2};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {


        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            int idx = Math.abs(nums[i]) -1;

            if(nums[idx]<0){
                ans.add(idx + 1);
            }

            nums[idx]=nums[idx] * -1;



        }


        return ans;
    }
}

