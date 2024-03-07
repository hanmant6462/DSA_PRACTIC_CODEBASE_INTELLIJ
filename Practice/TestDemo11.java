package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestDemo11 {
    public static void main(String[] args) {

        List<String> phoneModelList= Arrays.asList("iphone","sam","mi");
        List<String> feedbackList= Arrays.asList("iphone cam is good","sam c2","iphone c1","iphone cam is c2","sam asdfad","iphone c3","mi c1");

       Map<String, Long > map = phoneModelList.stream()
               .filter(i -> feedbackList.contains(i))
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String, Long> feedbackCount = feedbackList.stream()
                .flatMap(feedback -> Arrays.stream(feedback.split("\\s+")))
                .filter(phoneModelList::contains)
                .collect(Collectors.groupingBy(
                        phoneModel -> phoneModel,
                        Collectors.counting()
                ));

        feedbackCount.forEach((model, count) ->
                System.out.println(model + " - " + count));


        Map<String, Integer> occurrenceMap = new HashMap<>();

        for (String phoneModel : phoneModelList) {
            occurrenceMap.put(phoneModel, 0);
        }

        for (String feedback : feedbackList) {
            for (String phoneModel : phoneModelList) {
                if (feedback.contains(phoneModel)) {
                    occurrenceMap.put(phoneModel, occurrenceMap.get(phoneModel) + 1);
                }
            }
        }

        for (String phoneModel : phoneModelList) {
            System.out.println(phoneModel + " - " + occurrenceMap.get(phoneModel));
        }
    }

    //2 lists  1 list mobile model ex.iphone,  2 list feedback "iphone camera good"

    // each model comments   o/p iphone - 3  sam-4

    //




}
