package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test123 {
    public static void main(String[] args) {
        //100 20 50 80 60
        // house 1 2 3 4 5 6
        //int maxMoney=l;
        List<Integer> list = Arrays.asList(20,100,50,80);
        //Collections.sort(list,Collections.reverseOrder());
        int maxMoney=0;
        int maxMoney1 =0;
        for(int i = 0;i<list.size()-2;i++){

            maxMoney = maxMoney + list.get(i+2);

            i++;
        }
        for(int i = 1;i<list.size()-2;i++){

             maxMoney1 = maxMoney1 + list.get(i+2);

            i++;
        }
        if(maxMoney1>maxMoney){
            System.out.println(maxMoney1);
        } else {
            System.out.println(maxMoney);
        }

    }
}
