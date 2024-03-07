package Practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// [11:43 AM] Sandip Mahadev Sapkal
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings
public class ZensarTest {

    public static void main(String[] args) {
        String str="abbcccdddd"; //a = 1, b = 2
        Map<Character,Integer> freqMap = new HashMap<>();
        Map<char[],Long> map = Stream.of(str.toCharArray())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey().toString() +" "+ entry.getValue().toString());
        }
    }
}


 class CommonPrefixFinder {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Longest common prefix of strs1: " + longestCommonPrefix(strs1));
        System.out.println("Longest common prefix of strs2: " + longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array of strings lexicographically
        Arrays.sort(strs);

        // Get the first and last strings in the sorted array
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Compare the characters of the first and last strings
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (last.length() > i && last.charAt(i) == first.charAt(i)) {
                prefix.append(first.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}
