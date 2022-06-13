package lab_7.lab_7_1;

import java.util.List;

public class TotalSalaryCalculator {
    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}
