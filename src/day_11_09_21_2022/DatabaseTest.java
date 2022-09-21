package day_11_09_21_2022;

import day_11_09_21_2022.databases.OracleDatabes;
import day_11_09_21_2022.objects.Employee;
import day_11_09_21_2022.services.DatabaseService;

import java.util.List;

public class DatabaseTest {


    public static void main(String[] args) {

        DatabaseService oraclaDatabase=new OracleDatabes();
        //add an employee into the database
        Employee employee1=new Employee("Adam",1L);
        oraclaDatabase.addEmployee(employee1);
        //get the Employees
        List<Employee> employees = oraclaDatabase.getEmployees();
        System.out.println(employees);
        //add one more employee
        Employee employee2=new Employee("Aaron",2L);
        oraclaDatabase.addEmployee(employee2);
        //get the all employees
        System.out.println(oraclaDatabase.getEmployees());
        //get the single employee which has id =2
        System.out.println(oraclaDatabase.getEmployee(2l));
        //delete the employee which has id=1
        oraclaDatabase.deleteEmployee(1L);
        //get the all amployees
        System.out.println(oraclaDatabase.getEmployees());


    }
}
