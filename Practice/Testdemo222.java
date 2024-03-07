package Practice;

import java.util.HashMap;
import java.util.Map;

public class Testdemo222 {
    public static void main(String[] args) {
        String input="i am attending interview"; //most repetitive character  i-4
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i),0);
            }

        }
        System.out.println(map);

    }
}
