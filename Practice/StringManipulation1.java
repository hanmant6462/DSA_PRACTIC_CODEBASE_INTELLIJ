package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulation1 {

//        public static void main(String args[]) {
//            String input = "Java articles are Awesome";
//
//            Character result = input.chars() // Stream of String
//                    .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
//                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
//                    .entrySet()
//                    .stream()
//                    .filter(entry -> entry.getValue() == 1L)
//                    .map(entry -> entry.getKey())
//                    .findFirst()
//                    .get();
//            System.out.println(result);
//        }

    public static  void main(String[] args) {
       // List<String> list = Arrays.asList("ad","ac");
        //list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 44));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 11));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.stream()
                .sorted(Comparator.comparing(notes -> notes.age))
                .collect(Collectors.toList())
                .forEach(lst -> System.out.println(lst.getAge()));
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity()
                                , Collectors.counting()
                        ));
        System.out.println(namesCount);


        String s = "Hanmantsdkjfg";
        Map<String,Long> map = Arrays.stream(s.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s1 -> s1,LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);
        //map.forEach(System.out::print);
    }


    }

    class Notes {
    int i;
    String name;

        public Notes(int i, String name, int age) {
            this.i = i;
            this.name = name;
            this.age = age;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        int age;
    }


