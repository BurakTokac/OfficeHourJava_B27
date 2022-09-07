package day10_09_07_2022.employee_dataabase_task;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeDatabase {

    static ArrayList<Employee> employees = new ArrayList<>();

    static {
        Employee employee1 = new Employee("Baz", 1);
        Employee employee2 = new Employee("Olesya", 2);
        Employee employee3 = new Employee("Sergei", 3);
        Employee employee4 = new Employee("Jose", 4);
        Employee employee5 = new Employee("FarzonaOlim", 5);
        Employee employee6 = new Employee("Reheman", 6);
        Employee employee7 = new Employee("Adam", 7);
        Employee employee8 = new Employee("Baz", 8);
        employees.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6,employee7,employee8));
    }

    //we will get the employee from the user and we will add this employee to the database which is employees list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    //we will get id from the user and we will find the employee and delete it
    public void deleteEmployee(long id) {
        employees.removeIf(emp -> emp.id == id);
    }

//get the all employees from the database which is employees list

    public ArrayList<Employee> getAllEmployees() {

        return employees;
    }


    //get the specific employee from the database which is employees list

    public  Employee getEmployeeWithId(long id){
        Employee result=null;
        for (Employee employee : employees) {
            if (employee.id==id)
                result=employee;
        }
        return result;
    }

    public void  deleteAllEmployees(){
        employees.clear();
    }

//get all employees which are/is names are Adam


public  ArrayList<Employee> getEmployeesWithName(String name){
        ArrayList<Employee> result=new ArrayList<>();

    for (Employee employee : employees) {
        if (employee.name.equals(name))
            result.add(employee);
    }
        return result;

}


}
