package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JpTest {
    public static void main(String[] args) {
        String str = "test1 test111 test1 test111 test1 ";  //
        String strArray[] = str.split(" ");
        String s1= Arrays.stream(strArray)
                // Group the words by their occurrences
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                // Find the entry with the maximum occurrence count
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                // Extract the word from the resulting entry
                .map(Map.Entry::getKey)
                .orElse("");
        System.out.println(s1);
    }
    String str = "test1 test111 test1 test111 test1 ";  //
    String strArray[] = str.split(" ");



}
