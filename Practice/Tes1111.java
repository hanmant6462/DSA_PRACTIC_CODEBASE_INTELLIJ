package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tes1111 {
    public static void main(String[] args) {
        String name= "Hanmant";
        Map<String,Integer> map = new HashMap<>();
        String[] str = name.split("");
        System.out.println(str.length);

        for(String s1:str){
            if(map.keySet().contains(s1)){
                map.put(s1,map.get(s1) + 1);
            } else {
                map.put(s1,1);
            }
        }
        System.out.println(map);

        Map<Character,Long> map1 =name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map1.forEach((character,freq) -> System.out.println(character+" - "+freq));


    }


}
