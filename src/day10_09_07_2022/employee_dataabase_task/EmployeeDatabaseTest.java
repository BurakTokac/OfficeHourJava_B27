package day10_09_07_2022.employee_dataabase_task;

public class EmployeeDatabaseTest {
    public static void main(String[] args) {

        EmployeeDatabase employeeDatabase=new EmployeeDatabase();
        System.out.println("=========get all employees========");
        System.out.println(employeeDatabase.getAllEmployees());

        System.out.println("=========add one employee========");
        Employee employee=new Employee("Adam",9);
        employeeDatabase.addEmployee(employee);
        System.out.println("=========get all employees after adding========");
        System.out.println(employeeDatabase.getAllEmployees());

        System.out.println("=========delete employee id with 5  ========");
     //   employeeDatabase.deleteEmployee(5);
        System.out.println(employeeDatabase.getAllEmployees());

      //  employeeDatabase.deleteAllEmployees();
      //  System.out.println(employeeDatabase.getAllEmployees());
        System.out.println(employeeDatabase.getEmployeesWithName("Adam"));
    }
}
