package Hashing;

import Practice.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test12121 {

    public static void main(String[] args) {
        List<Employee12> list1 = Arrays.asList(new Employee12(1,"test1"),new Employee12(3,"test1"));
        List<Employee12> list2 = Arrays.asList(new Employee12(1,"test1"),new Employee12(2,"test1"));
        List<Employee12> result = new ArrayList<>();
        for (Employee12 e: list1){
            if(list2.contains(e)){

                result.add(e);
            }
        }
        System.out.println(result);
    }
    public void removeDuplicate(List l1, List l2){
        List<Employee12> list1 = Arrays.asList(new Employee12(1,"test1"),new Employee12(3,"test1"));
        List<Employee12> list2 = Arrays.asList(new Employee12(1,"test1"),new Employee12(2,"test1"));
        List<Employee12> result = new ArrayList<>();
        for (Employee12 e: list1){
            if(list2.contains(e)){

                result.add(e);
            }
        }
        System.out.println(result);
    }





}

class Employee12{
    int id;
    String name;

    public Employee12(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee12 that = (Employee12) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "Employee12{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//2 employee lists   - both list contain emp object  id,name,



