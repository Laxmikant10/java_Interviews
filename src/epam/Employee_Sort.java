package src.epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Question - Sort employee with name and if name is same sort with id
public class Employee_Sort {

    public static void main(String[] args) {
        List<EmployeeDOA> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeDOA(19,"Lax"));
        employeeList.add(new EmployeeDOA(55,"Anu"));
        employeeList.add(new EmployeeDOA(14,"Anu"));
        employeeList.add(new EmployeeDOA(16,"Laxmikant"));
        employeeList.add(new EmployeeDOA(10,"Gale"));

        System.out.println("employeeList = " + employeeList);

        Comparator<EmployeeDOA> byName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<EmployeeDOA> byId = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());

        //Sort employee with name
        employeeList.stream().sorted(byName).forEach(System.out::println);
        System.out.println("---------------------------------------------");
        //Sort employee with name and if name is same sort with id
        employeeList.stream().sorted(byName.thenComparing(byId)).forEach(System.out::println);
    }
}
