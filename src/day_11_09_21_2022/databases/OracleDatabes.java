package day_11_09_21_2022.databases;

import day_11_09_21_2022.Employee;
import day_11_09_21_2022.services.DatabaseService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        for (Employee employee : oracleDatabase) {
            if (employee.getEmplyeeId()==id)
                return employee;
        }
        System.out.println("in database there is no this record");
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
    return oracleDatabase;
    }

    @Override
    public List<String> getAllEmployeesNames() {
        List<String> names = new ArrayList<>();
        for(Employee eachEmployee : oracleDatabase){
            names.add(eachEmployee.getName());
        }
        return names;
    }

    @Override
    public List<String> getUniqueEmployeeNames() {
        /*

        Aaron,Adam,Adam,Friyat,Alec
        Aaron,Adam,Friyat,Alec
         */


return null;

    }
}
