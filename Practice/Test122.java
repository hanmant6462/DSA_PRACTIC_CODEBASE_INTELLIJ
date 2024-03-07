package Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test122 {

        public static void main(String[] args) {
            List<List<EmployeeDetails>> employeesList = new ArrayList<>();

            // ... Initialize the employeesList as shown above ...


            List<EmployeeDetails> department1 = Arrays.asList(
                    new EmployeeDetails(1, "Alice", 12000L),
                    new EmployeeDetails(2, "Bob", 9500L),
                    new EmployeeDetails(3, "Charlie", 10500L)
            );
            List<EmployeeDetails> department2 = Arrays.asList(
                    new EmployeeDetails(4, "Alice", 8000L),
                    new EmployeeDetails(5, "Bob", 9500L),
                    new EmployeeDetails(6, "Charlie", 7500L)
            );
            employeesList.add(department1);
            employeesList.add(department2);

            List<EmployeeDetails> highSalaryEmployees = employeesList.stream()
                    .flatMap(Collection::stream) // Flatten the list of lists
                    .filter(employee -> employee.getSal() > 10000L)
                    .collect(Collectors.toList());

            // Print the high-salary employees
            highSalaryEmployees.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getSal()));
        }
    }



