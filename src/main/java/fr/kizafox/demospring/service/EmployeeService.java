package fr.kizafox.demospring.service;

import com.github.javafaker.Faker;
import fr.kizafox.demospring.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Change this line to a short description of the class
 *
 * @author : KIZAFOX
 * @date : 06/09/2023
 * @project : GithubCopilot
 */

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        for(int i = 1; i <= 10; i++){
            Faker faker = new Faker();

            String name = faker.name().fullName();
            String email = faker.internet().emailAddress();
            String country = faker.address().country();

            employees.add(new Employee(i, name, email, country));

            System.out.println("Employee info >> (id: " + i + " - name: " + name + " - email: " + email + " - country: " + country + ")");
        }
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(Employee employee) {
        Employee employeeToUpdate = getEmployeeById(employee.getId());
        employeeToUpdate.setName(employee.getName());
        employeeToUpdate.setEmail(employee.getEmail());
    }

    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }
}
