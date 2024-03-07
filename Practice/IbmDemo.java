package Practice;

import java.util.ArrayList;
import java.util.List;

public class IbmDemo {

    public static void main(String[] args) {
        //2 dicese - 1 to 6    4 dice + 1dice //5
        // 2 dicess
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                list.add(i + j);
                System.out.println(list.size());
            }
        }
    }
}


// emp name and sal   1000 Highest Sal

//select name, sal from Emp where sal=max(sal) and order by sal asc ;


//consider list of sal nth highest


