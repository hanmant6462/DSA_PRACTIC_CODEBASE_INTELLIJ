package DSA;

import java.util.HashMap;

public class FirstuniqCharcter {
    public static void main(String[] args) {
        int result = firstUniqChar("aabb");
        System.out.println(result);
    }

        public static int firstUniqChar(String s) {

            char ch[] = s.toCharArray();
            HashMap<Character, Integer> map = new HashMap();
            int result=-1;
            for (int i = 0; i < ch.length; i++) {
                if (map.containsKey(ch[i])) {
                    map.put(ch[i], map.get(ch[i]) + 1);
                } else {
                    map.put(ch[i], 1);
                }
            }
            for (int i = 0; i < ch.length; i++) {
                if(map.get(ch[i]) == 1){
                    return i;
                }
            }
            return -1;
        }}
