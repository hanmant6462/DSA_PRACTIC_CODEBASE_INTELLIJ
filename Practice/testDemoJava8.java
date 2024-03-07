package Practice;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class testDemoJava8 {
    public static void main(String[] args) {
        String name="Hanmant";
        //List<char[]> s1 = Arrays.asList(name.toCharArray());
        //String s2 = s1.stream().map(x -> new StringBuilder(Arrays.toString(x)).reverse()).collect(Collectors.joining());
        //name.chars().mapToObj(c -> (char) c).sorted((c1,c2) -> c2.compareTo(c1)).forEach(System.out::print);
        //System.out.println(s2);

        name.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((s1, s2) -> s2 + s1)
                .orElse("");
        System.out.println(name);

        String name1="Hanmant";
        Map map = Arrays.stream(name.split("")).collect(
                Collectors.groupingBy(
                        Function.identity(), counting()

                )
        );
        System.out.println(map);


        List<Employee1> emp = Stream.of(
                new Employee1(1,"A1","dev","1000"),
                new Employee1(2,"B1","dev","2000"),
                new Employee1(3,"B1","QA","3000")
        ).collect(Collectors.toList());

        Comparator<Employee1> empCompare =  Comparator.comparing(Employee1::getSal);
        Map<String, Optional<Employee1>> map1 = emp.stream().sorted(empCompare).collect(
                groupingBy(Employee1::getDept, Collectors.reducing(BinaryOperator.maxBy(empCompare)))
        );
        System.out.println(map1);


        List<Integer> list=Arrays.asList(1,2,45,12,2,2);

      long l = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(l);
        //list1.forEach(System.out::println);


    }
}
