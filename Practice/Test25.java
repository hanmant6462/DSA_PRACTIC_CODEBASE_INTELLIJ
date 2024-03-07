package Practice;

import java.util.HashMap;
import java.util.Map;

public class Test25 {
    public static void main(String[] args) {
        String name="Hanmant";  //H-1, a-2, ....
        char ch[] = name.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for (char ch1: ch){
            if(map.containsKey(ch1)) {
                map.put(ch1, map.get(ch1)+1);
            } else {
                map.put(ch1, 1);
            }
        }
        System.out.println(map);

    }
}
