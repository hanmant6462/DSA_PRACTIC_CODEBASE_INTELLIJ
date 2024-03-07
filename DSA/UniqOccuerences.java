package DSA;

import Practice.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqOccuerences {

    public static void main(String[] args) {
        //list of employee 4th highest salary from

        List<EmployeeT> list = Arrays.asList(new EmployeeT(1,"test1", "dev", 100),new  EmployeeT(2,"test1", "dev", 200));
        String s=list.stream().sorted((a,b) -> b.getSal() - a.getSal()).limit(2).collect(Collectors.toList()).get(1).toString();
        System.out.println(s);
    }
}




