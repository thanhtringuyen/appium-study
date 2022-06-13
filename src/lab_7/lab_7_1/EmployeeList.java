package lab_7.lab_7_1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList extends TotalSalaryCalculator {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee_1 = new FullTimeEmployee();
        Employee employee_2 = new FullTimeEmployee();
        Employee employee_3 = new FullTimeEmployee();
        Employee employee_4 = new ContractEmployee();
        Employee employee_5 = new ContractEmployee();

        employeeList.add(employee_1);
        employeeList.add(employee_2);
        employeeList.add(employee_3);
        employeeList.add(employee_4);
        employeeList.add(employee_5);

        TotalSalaryCalculator totalSalaryCalculator = new TotalSalaryCalculator();
        System.out.println("There are a total of " + employeeList.stream().filter(e -> e instanceof FullTimeEmployee).count() + " Full Time Employees");
        System.out.println("There are a total of " + employeeList.stream().filter(e -> e instanceof ContractEmployee).count() + " Contract Employees");
        System.out.println("The total salary is: " + totalSalaryCalculator.getTotalSalary(employeeList));
    }
}

