package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TitleCaseConverter {


    public static void main(String[] args) {
        List<String> list= Arrays.asList("india", "austrelia",  "srinlanka", "swiss");
        List<String> contries = list.stream().map(TitleCaseConverter::convertToTitlecase).collect(Collectors.toList());
        contries.forEach(System.out::println);
    }

    private static String convertToTitlecase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        boolean convertNext =true;
        StringBuilder sb=new StringBuilder();
        for(Character ch:input.toCharArray()){
            if (Character.isSpaceChar(ch))
                {
                     convertNext = true;
                }
            else if(convertNext){
                ch = Character.toTitleCase(ch);
                convertNext =false;

            }else{
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
