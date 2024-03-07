package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Ibm {
    public static void main(String[] args) {
        List<EmployeeDetails> list = new ArrayList<>();
        list.add(new EmployeeDetails(1,"name1",1000L));
        list.add(new EmployeeDetails(2,"name1",3000L));
        list.add(new EmployeeDetails(3,"name1",2000L));
        List l1=list.stream().filter(emp -> emp.getSal() > 2000).collect(Collectors.toList());
        List l2=list.stream().filter(emp -> emp.getSal() == emp.getSal()).collect(Collectors.toList());

        l1.forEach(System.out::println);

    }
}

//