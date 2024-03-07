package Practice;

import java.util.HashMap;
import java.util.Map;

public class Te1 {
    public static void main(String[] args) {

                System.out.println("Hello, World!");
                int a[] = {1, 2, 3, 4, 3, 2, 1};
                Map<Integer,Integer> map = new HashMap<>();
                for(int i:a){
                    if(map.containsKey(i)){
                        map.put(i,map.get(i) + 1);
                    } else{
                        map.put(i,1);
                    }
                }

                for(Map.Entry entry:map.entrySet()){
                    if((Integer) entry.getValue() == 1 ){
                        System.out.println(entry.getKey() );
                    }

                }

            }
        }


