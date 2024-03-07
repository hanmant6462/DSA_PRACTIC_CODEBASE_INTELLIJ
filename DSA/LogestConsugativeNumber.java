package DSA;

import java.util.HashMap;
import java.util.Map;

public class LogestConsugativeNumber {
    public static void main(String[] args) {
        int nums[] = {1, 0, -1, 3, 4, 7, 6, 5};

        int res = longestConsecutive(nums);
        System.out.println(res);
    }

    public static int longestConsecutive(int[] nums) {

        int logestLength = 0;

        Map<Integer, Boolean> exploredMap = new HashMap<>();

        for (int i : nums) {
            exploredMap.put(i, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentLength = 1;

            int nextNum = num + 1;

            while (exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == false) {
                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);
                nextNum++;

            }

            int prevNum = num - 1;

            while (exploredMap.containsKey(prevNum) && exploredMap.get(prevNum) == false) {
                currentLength++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;

            }
            logestLength = Math.max(logestLength, currentLength);
        }
        return logestLength;
    }
}
