package DSA;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// string   level ->
//ex   abcabc -> true
//ex abcde --> false  //MADAM
public class Practice1 {
    public static void main(String[] args) {
        String str="abcabc";
    boolean result=isPalindrom(str);
    }

    private static boolean isPalindrom(String str) {
        String result = "";
        char ch[] = str.toCharArray();
        List list = new ArrayList<>();
        for (char ch1 : ch) {
            list.add(ch1);
        }
        //Map<String,Integer> map=list.stream().map();
        return true;
    }
}
