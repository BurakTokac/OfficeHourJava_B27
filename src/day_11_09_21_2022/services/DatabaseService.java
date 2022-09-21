package day_11_09_21_2022.services;


import day_11_09_21_2022.objects.Employee;

import java.util.List;

public interface DatabaseService {

    void addEmployee(Employee employee);  //first rule between classes
    void deleteEmployee(Long id);  //second rule btween classes
    Employee getEmployee(Long id); //third
    List<Employee> getEmployees();
    List<String> getAllEmployeesNames();
    List<String> getUniqueEmployeeNames();




}
