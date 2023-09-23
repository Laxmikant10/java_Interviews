package src.techmahindra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployee_Department {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Lax", 49000.0, "Mechanical"));
        list.add(new Employee("Anu", 95000.0, "ENTC"));
        list.add(new Employee("Potta", 67000.0, "ENTC"));
        list.add(new Employee("Bhatti", 390000.0, "CS"));
        list.add(new Employee("Gale", 11000.0, "BSC"));
        list.add(new Employee("Swap", 45000.0, "Mechanical"));
        list.add(new Employee("Bala", 89000.0, "CS"));

        //1. want emp whose salary > 50,000
        List<String> collect = list.stream().filter(employee -> employee.salary > 50000).map(employee -> employee.getName() + " " + employee.getSalary()).collect(Collectors.toList());

        System.out.println("sortedSalary = " + collect);

        //2. display emp name based on department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> listMap = list.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        //System.out.println("listMap = " + listMap);

        listMap.forEach((department, employeesInDepartment) -> {
            System.out.println(department);
            employeesInDepartment.forEach(employee -> System.out.println(" " + employee));
        } );

        System.out.println();
        //3. Print & Count the number of Department
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));
        System.out.println("map = " + map);


    }
}
