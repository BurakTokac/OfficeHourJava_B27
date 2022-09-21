package day_11_09_21_2022.databases;

import day_11_09_21_2022.Employee;
import day_11_09_21_2022.services.DatabaseService;

import java.util.ArrayList;
import java.util.List;

public class OracleDatabes implements DatabaseService {

    List<Employee> oracleDatabase = new ArrayList<>();


    @Override
    public void addEmployee(Employee employee) {
        oracleDatabase.add(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        oracleDatabase.removeIf(emp -> emp.getEmplyeeId() == id);
    }

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public List<String> getAllNames() {
        return null;
    }

    @Override
    public List<String> getUniqueNames() {
        return null;
    }
}
