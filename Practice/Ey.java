package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ey {

    public static void main(String[] args) {
        List<Human> list1 = Arrays.asList(new Human("ram",12),new Human("ram",11),new Human("hanu",10));
        list1.stream().sorted(Comparator.comparing(Human::getName).thenComparing(Human::getAge)).collect(Collectors.toList()).forEach(System.out::println);


    }



}


class Human {
    private String name;
    private int age;

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

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


}