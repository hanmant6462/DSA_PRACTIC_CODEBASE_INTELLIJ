package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

//5. Write a program to sort the elements in collections?
//public class Employee {int id; int age; double salary; String name;
//}
//use above the Employee class and sort the Employee objects in descending order based on name
//and salary.
public class SpectraTest1 {
    public static void main(String[] args) {
        sortEmployeeAndPrint();
    }

    private static void sortEmployeeAndPrint() {
        List<EmployeeSpectra> list = Arrays.asList(new EmployeeSpectra(1,31,100,"emp1"),new EmployeeSpectra(2,32,200,"lastEmp"));
        for (EmployeeSpectra emp:list){
            System.out.println(emp);
        }
    }


}

 class EmployeeSpectra implements Comparator<EmployeeSpectra> {
     public EmployeeSpectra(int id, int age, double salary, String name) {
         this.id = id;
         this.age = age;
         this.salary = salary;
         this.name = name;
     }

     @Override
     public String toString() {
         return "EmployeeSpectra{" +
                 "id=" + id +
                 ", age=" + age +
                 ", salary=" + salary +
                 ", name='" + name + '\'' +
                 '}';
     }

     int id; int age;

     @Override
     public int compare(EmployeeSpectra o1, EmployeeSpectra o2) {
         if((o2.getSalary() < o1.getSalary()) ){
             return -1;
         }
         return 1;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         EmployeeSpectra that = (EmployeeSpectra) o;
         return id == that.id && age == that.age && Double.compare(that.salary, salary) == 0 && name.equals(that.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(id, age, salary, name);
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     double salary; String name;
}
