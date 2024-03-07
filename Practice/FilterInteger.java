package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterInteger {
    public static void main(String[] args) {
        List<Object> list= Arrays.asList("asf",10,"wert","222");
        List<Integer> integerList = list.stream()
                .filter(o -> o instanceof Integer)
                .map(o -> (Integer) o)
                .collect(Collectors.toList());
        integerList.forEach(System.out::println);
    }
}
