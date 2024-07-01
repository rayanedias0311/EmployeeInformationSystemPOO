package pacote;
import java.util.ArrayList;

import pacote.Employee;

public class employeeManager {
    private ArrayList<Employee> employees;

    public employeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
