package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharactersInStrings {
        public static List<String> commonChars(String[] words) {
            List<String> result = new ArrayList<>();

            if (words == null || words.length == 0) {
                return result;
            }

            // Initialize character frequencies for the first word
            Map<Character, Integer> commonFreq = new HashMap<>();
            for (char c : words[0].toCharArray()) {
                commonFreq.put(c, commonFreq.getOrDefault(c, 0) + 1);
            }

            // Iterate through the remaining words
            for (int i = 1; i < words.length; i++) {
                Map<Character, Integer> wordFreq = new HashMap<>();

                // Update character frequencies for the current word
                for (char c : words[i].toCharArray()) {
                    wordFreq.put(c, wordFreq.getOrDefault(c, 0) + 1);
                }

                // Intersect character frequencies with the commonFreq
                for (char c : commonFreq.keySet()) {
                    if (wordFreq.containsKey(c)) {
                        commonFreq.put(c, Math.min(commonFreq.get(c), wordFreq.get(c)));
                    } else {
                        commonFreq.put(c, 0); // Character not present in the current word
                    }
                }
            }

            // Collect common characters into the result list
            for (Map.Entry<Character, Integer> entry : commonFreq.entrySet()) {
                char c = entry.getKey();
                int frequency = entry.getValue();
                for (int i = 0; i < frequency; i++) {
                    result.add(String.valueOf(c));
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String[] words1 = {"bella", "label", "roller"};
            List<String> result1 = commonChars(words1);
            System.out.println("Common Characters: " + result1);

            String[] words2 = {"cool", "lock", "cook"};
            List<String> result2 = commonChars(words2);
            System.out.println("Common Characters: " + result2);
        }
    }

