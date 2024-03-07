package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test113344 {

    //numner list   1,5,10,30,28,33 given input n input  o/p - 5
    public static void main(String[] args) {
        int n=4;
        List<Integer> list = Arrays.asList(1,5,10,30,28,33);

        Integer result = list.stream().sorted().filter(a -> a > n ||  a < n).collect(Collectors.toList()).get(0);
        System.out.println(result);
    }



}
