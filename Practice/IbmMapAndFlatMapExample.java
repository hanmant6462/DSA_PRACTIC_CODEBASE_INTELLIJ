package Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IbmMapAndFlatMapExample {
    public static void main(String[] args) {
//        List<EmployeeDetails> empList= Arrays.asList(new EmployeeDetails(1,"name1",1000L),new EmployeeDetails(1,"name1",900L));
//        List<EmployeeDetails> sal1 =empList.stream().filter(emp -> emp.getSal() > 999L).collect(Collectors.toList());
//        System.out.println(sal1.get(0));

        List<List<EmployeeDetails>> empList1= Arrays.asList(Arrays.asList(new EmployeeDetails(1,"name1",1000L),new EmployeeDetails(2,"name2",900L)));
        List<EmployeeDetails> emp = empList1.stream().flatMap(Collection::stream).filter(emp1 -> emp1.getSal() >= 1000L).collect(Collectors.toList());

        System.out.println(emp.get(0).getSal());
    }
}
